package com.eduard.springboot.demo.elearning.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstRestController {

    // expose "/" that returns "Hello World"
    @GetMapping
    public String sayHello(){
        return "Hello World";
    }
}
