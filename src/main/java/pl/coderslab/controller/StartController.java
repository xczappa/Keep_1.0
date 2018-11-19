package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.repository.CategoryRepository;

@Controller
@RequestMapping("/")
public class StartController {



    @GetMapping
    public String goToLogin () {
        return "welcome";
    }
}
