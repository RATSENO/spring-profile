package com.example.controller;

import com.example.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {

    @Resource(name = "${test.serviceImpl.name}")
    private TestService testService;


    @GetMapping(value = "/test")
    public String test(){
        return testService.talk();
    }
}
