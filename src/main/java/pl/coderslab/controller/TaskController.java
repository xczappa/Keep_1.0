package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Category;
import pl.coderslab.model.Priority;
import pl.coderslab.model.Task;
import pl.coderslab.model.User;
import pl.coderslab.repository.CategoryRepository;
import pl.coderslab.repository.PriorityRepository;
import pl.coderslab.repository.TaskRepository;
import pl.coderslab.repository.UserRepository;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;


@Controller
@RequestMapping("app/task")
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PriorityRepository priorityRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    //DODAWANIE NOWEGO
    @GetMapping(value = "/add")
    public String showTaskForm(Model model) {
        model.addAttribute("task", new Task());
        return "form/task_form";
    }

    //ODBIOR z FORMULARZA - dodawanie albo update
    @PostMapping(value = "/add")
    public String addTask(@Valid Task task, BindingResult result) {
        if (result.hasErrors()) {
            return "form/task_form";
        } else
        if (task.getId() != null) {
            task.setUpdated(LocalDate.now());
            taskRepository.save(task);
        } else {
            task.setCreated(LocalDate.now());
            task.setActive(true);
            taskRepository.save(task);
        }
        return "redirect:/app/home";
    }

    //ustawianie ACTIVE na false/true
    @GetMapping(value = "/done/{id}")
    public String editArticle(@PathVariable long id) {
        Task task = taskRepository.findOne(id);
        if (task.getActive() == true) {
            task.setActive(false);
            task.setCompleted(LocalDate.now());
        } else {
            task.setActive(true);
            task.setCompleted(null);
        }
        taskRepository.save(task);
        return "redirect:/app/home";
    }

    //KASOWANIE
    @RequestMapping("/delete/{id}")
    public String deleteArticle(@PathVariable long id) {
        taskRepository.delete(id);
        return "redirect:/app/home";
    }

    //EDYTOWANIE
    @GetMapping(value = "/edit/{id}")
    public String editTask(Model model, @PathVariable long id) {
        Task task = taskRepository.findOne(id);
        model.addAttribute("task", task);
        return "form/task_form";
    }


    // listy potrzebne do formularzy
    @ModelAttribute("userz")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @ModelAttribute("priorytiz")
    public List<Priority> getPriority() {
        return priorityRepository.findAll();
    }

    @ModelAttribute("categoriez")
    public List<Category> getCategory() {
        return categoryRepository.findAll();
    }

}
