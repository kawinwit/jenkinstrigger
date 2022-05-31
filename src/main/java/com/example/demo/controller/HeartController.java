package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HeartController {

    @Autowired
    Environment environment;

    @RequestMapping(path = "/test")
    public ResponseEntity checkApi(HttpServletRequest request) {

        return ResponseEntity.ok("test api");
    }

}
