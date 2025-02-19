package com.example.databazovyprojekt1.Controller;

import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class API {
    @GetMapping(value ="/")
    public String getpage(){

        return "Hello World";
    }
}
