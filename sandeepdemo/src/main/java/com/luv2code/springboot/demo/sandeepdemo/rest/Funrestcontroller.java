package com.luv2code.springboot.demo.sandeepdemo.rest;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;
@RestController
public class Funrestcontroller {
    @GetMapping("/")
    public String sayHello(){
        return "sandee say hellow";
    }
}
