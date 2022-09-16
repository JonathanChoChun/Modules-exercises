package com.techelevator.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GreetingController {


    @RequestMapping(value = "/")
    public String showGreeting() {


        return "greeting";
    }
}
