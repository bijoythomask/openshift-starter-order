package com.example.order.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderRestController {

    @RequestMapping("hello")
    public String sayHello(){
        return "Hello from OpenShift 3";
    }
}
