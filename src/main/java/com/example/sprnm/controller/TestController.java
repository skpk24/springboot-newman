package com.example.sprnm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/")
public class TestController {

    @GetMapping("/hello")
    public String getMessage(){
        String hello = "Hello";
        return hello;
    }
}
