package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.repository.CategoryRepository;
import pl.coderslab.repository.TaskRepository;

@Controller
@RequestMapping("/app/home")
public class KeepController {



    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TaskRepository taskRepository;


    @GetMapping
    public String listTasks(Model model) {
        model.addAttribute("categories", categoryRepository.findAll());
        return "keep";
    }
}
