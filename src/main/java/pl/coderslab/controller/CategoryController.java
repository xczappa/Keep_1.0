package pl.coderslab.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Category;
import pl.coderslab.model.Priority;
import pl.coderslab.model.Category;
import pl.coderslab.model.User;
import pl.coderslab.repository.CategoryRepository;
import pl.coderslab.repository.PriorityRepository;
import pl.coderslab.repository.CategoryRepository;
import pl.coderslab.repository.UserRepository;

import javax.validation.Valid;
import java.time.LocalDate;
import java.util.List;


@Controller
@RequestMapping("app/category")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PriorityRepository priorityRepository;


    //DODAWANIE NOWEGO
    @GetMapping(value = "/add")
    public String showCategoryForm(Model model) {
        model.addAttribute("category", new Category());
        return "form/category_form";
    }

    //ODBIOR z FORMULARZA - dodawanie albo update
    @PostMapping(value = "/add")
    public String addCategory(@Valid Category category, BindingResult result) {
        if (result.hasErrors()) {
            return "form/category_form";
        } else
        if (category.getId() != null) {
            categoryRepository.save(category);
        } else {
            categoryRepository.save(category);
        }
        return "redirect:/app/home";
    }

    //KASOWANIE
    @RequestMapping("/delete/{id}")
    public String deleteArticle(@PathVariable long id) {
        categoryRepository.delete(id);
        return "redirect:/app/home";
    }

    //EDYTOWANIE
    @GetMapping(value = "/edit/{id}")
    public String editCategory(Model model, @PathVariable long id) {
        Category category = categoryRepository.findOne(id);
        model.addAttribute("category", category);
        return "form/category_form";
    }

}
