package pl.coderslab.controller;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.dto.LoginDto;
import pl.coderslab.dto.RegistrationDto;
import pl.coderslab.model.User;
import pl.coderslab.repository.UserRepository;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

@Controller
@RequestMapping("/registration")
public class RegistrationController {


    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public String register(Model model){
        model.addAttribute("registrationDto", new RegistrationDto());
        return "/register/registrationForm";
    }

    @PostMapping
    public String postRegister(@Valid RegistrationDto registrationDto, BindingResult result) { //dorzucilismy http... zeby dorzucoic do sesji requesta z flaga
        //System.out.println(registrationDto);

        if (result.hasErrors()) {
            return "register/registrationForm";
        }


        //TAK SAMO Z MAILEM ZROBIC
        boolean passEqual = registrationDto.getPassword().equals(registrationDto.getPasswordRepeat());
        if(!passEqual) {
            result.addError(new FieldError("registrationDto", "password", "nietozsame hasla"));
            return "register/registrationForm";
        }

        if (registrationDto.getPassword().equals(registrationDto.getPasswordRepeat())) {
            User user = new User();
            user.setUserName(registrationDto.getLogin());
            user.setEmail(registrationDto.getEmail());
            user.setHashedPassword(registrationDto.getPassword());
            userRepository.save(user);
        } else {
            return "register/error";
        }

        return "redirect:/login";
    }
}
