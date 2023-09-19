package com.sratech.shahspringbootdemowebapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CrispController {

    @GetMapping(value ="/crisp")
    public String getCrisp(){
        return "I love crisp!";
    }
}
