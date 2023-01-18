package com.example.SpringSecurity.controller;

import com.example.SpringSecurity.model.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/admin")
    public String admin(){
        return "Admine özel mesajdır";
    }

    @GetMapping("/index")
    public String index(){
        return "Index Sayfası, Hoşgeldiniz";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return "Login başarılı, dashboard sayfası";
    }

    @RequestMapping(value = "/register" , method = RequestMethod.GET)
    public String registerPage(Model model){
        model.addAttribute("user", new User());
        return "register";
    }
}
