package com.azuredeploy.projecttest.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public Object hello() {
        Map<String, String> object = new HashMap<>();
        object.put("name", "Mohammad Ali Farhan");
        object.put("email", "olifarhaan@gmail.com");
        return object;
    }

}