package com.uocloud.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {
    @GetMapping("/index")
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
    @GetMapping("/about")
    @RequestMapping("/about")
    public String about(){
        return "about";
    }
}
