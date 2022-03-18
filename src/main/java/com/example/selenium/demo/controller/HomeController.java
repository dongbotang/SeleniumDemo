package com.example.selenium.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @project: selenium.demo
 * @author: Dongbo Tang
 * @Date: 18/03/2022
 */
@Controller
public class HomeController {
    @RequestMapping(value="/")
    public String index(){
        return "index";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(name="user", required = false, defaultValue = "world") String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }

}
