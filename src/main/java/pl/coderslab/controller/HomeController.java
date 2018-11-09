package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app/home")
public class HomeController {

    @RequestMapping
    @ResponseBody
    public String login (Model model) {

        return "HOME";
    }
}
