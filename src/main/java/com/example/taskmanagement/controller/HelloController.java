package com.example.taskmanagement.controller;

import com.example.taskmanagement.dto.About;
import com.example.taskmanagement.dto.HelloResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public HelloResponse hello() {
        return new HelloResponse("Hello Spring");
    }

    @GetMapping("/about")
    public About getAbout() {
        return new About("Task Management API", "1.0");
    }
}
