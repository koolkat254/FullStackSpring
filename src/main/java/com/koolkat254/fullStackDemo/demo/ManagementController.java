package com.koolkat254.fullStackDemo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/management")
public class ManagementController {


    @GetMapping
    public String get() {
        return "GET:: management controller";
    }
    @PostMapping
    public String post() {
        return "POST:: management controller";
    }

}
