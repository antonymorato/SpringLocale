package com.example.sbapp.controller;


import com.example.sbapp.entity.User;
import com.example.sbapp.persistence.UserRepo;
import com.example.sbapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
@Controller
//@RequestMapping("/main")
public class PageController {

    @Autowired
    UserRepo userRepo;
    @Autowired
    MessageSource messageSource;


    @GetMapping("/main")
    public String main(Map<String,Object> model){

        Iterable<User> users=userRepo.findAll();
        users.forEach(user -> System.out.println(user.getName()+" "+user.getName_ukr()));
        model.put("users",users);

        return "main";}

    @GetMapping("/users")
    public String user( Model model){



        List<User> users=userRepo.findAll();

        users.forEach(user -> System.out.println("login:"+user.getLogin()));
        model.addAttribute("users",users);
        return "users";
    }




}
