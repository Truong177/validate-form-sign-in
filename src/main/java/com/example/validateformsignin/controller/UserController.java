package com.example.validateformsignin.controller;

import com.example.validateformsignin.model.User;
import com.example.validateformsignin.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("/")
    public String showForm(Model model){
        model.addAttribute("user",new User());
        return "index";
    }
    @PostMapping("/")
    public String processForm(@Valid User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        userService.saveUser(user);
        return "result";
    }

}
