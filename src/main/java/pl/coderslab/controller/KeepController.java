package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.coderslab.repository.CategoryRepository;
import pl.coderslab.repository.PriorityRepository;
import pl.coderslab.repository.TaskRepository;
import pl.coderslab.repository.UserRepository;

@Controller
@RequestMapping("/app/home")
public class KeepController {



    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PriorityRepository priorityRepository;


    @GetMapping
    public String listTasks(Model model) {
        model.addAttribute("categories", categoryRepository.findAll());
        model.addAttribute("users", userRepository.findAll());
        model.addAttribute("tasks", taskRepository.findAll());
        model.addAttribute("priorities", priorityRepository.findAll());
        return "keep";
    }
}
