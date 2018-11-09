package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.coderslab.model.Tweet;
import pl.coderslab.model.User;
import pl.coderslab.repository.TweetRepository;
import pl.coderslab.repository.UserRepository;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TweetRepository tweetRepository;


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showUserForm(Model model) {
        model.addAttribute("user", new User());
        return "form/userForm";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()) {
            return "form/userForm";
        } else if (user.getId() != null) {
            userRepository.save(user);
        } else {
            userRepository.save(user);
        }
        return "redirect:all";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String allUsers(Model model) {
        model.addAttribute("users", userRepository.findAll());
        return "userList";
    }

    @RequestMapping("/delete/{id}")
    public String deleteUser(@PathVariable long id) {
        userRepository.delete(id);
        return "redirect:../all";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public String editUser(Model model, @PathVariable long id) {
        User user = userRepository.findOne(id);
        model.addAttribute("user", user);
        return "form/userForm";
    }

    @RequestMapping(value = "{id}/tweets", method = RequestMethod.GET)
    public String showTweetsByUser(Model model, @PathVariable long id) {
        List<Tweet> tweet = tweetRepository.findAllByUserId(id);
        model.addAttribute("tweet", tweet);
        return "tweetListByUser";
    }

}
