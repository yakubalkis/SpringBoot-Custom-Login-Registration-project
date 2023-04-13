package com.luv2code.controller;

import com.luv2code.model.User;
import com.luv2code.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {

    private UserService userService;

    @Autowired
    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String showRegistrationForm(Model model){

        User theUser = new User();
        model.addAttribute("user", theUser);

        return "registration"; // registration.html
    }

    @PostMapping
    public String registerUserAccount(@ModelAttribute("user") User theUser){
        userService.save(theUser);

        return "redirect:/registration?success";
    }

}















