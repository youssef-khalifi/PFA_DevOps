package com.Projet_DevOps.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class ApiController {

    @GetMapping("hello")
    public String hello(){
        return "hello !!";
    }

    @GetMapping("bye")
    public String bye(){
        return "bye bye !!";
    }
}
