package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    @RequestMapping(value = "demo/a", method = RequestMethod.POST)
    public String a(){
        return "abc";
    }
}
