package com.demo.dayary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IntroController {


    @GetMapping("/")
    public String intro(){

        return "forward:/root/root.html";
    }
}
