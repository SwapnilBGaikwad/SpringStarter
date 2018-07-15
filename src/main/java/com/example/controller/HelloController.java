package com.example.controller;

import com.example.model.Greeting;
import com.example.services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    private ValidationService validationService;
    private Greeting greeting;

    @Autowired
    public HelloController(ValidationService validationService, Greeting greeting) {
        this.validationService = validationService;
        this.greeting = greeting;
    }

    @RequestMapping("/")
    public @ResponseBody
    Greeting index(String no) {
        List<String> validations = validationService.validations(no);
        if (validations.size() > 0) {
            throw new IllegalArgumentException(validations.toString());
        }
        greeting.setNumber(Integer.parseInt(no));
        return greeting;
    }

}