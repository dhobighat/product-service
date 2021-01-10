package com.sandipan.work.product.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://aws-dev-dashboard.s3.amazonaws.com/")
public class WelcomeController {

    @GetMapping("/getMessage")
    public String getWelcomeMessage(){
        return "Welcome to AWS ECS Products";
    }

    @GetMapping
    public int healthCheck(){
        return HttpStatus.OK.value();
    }

    @GetMapping("/version")
    public String getVersion(){
        return "1.0.20";
    }
}
