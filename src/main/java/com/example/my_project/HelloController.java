package com.example.my_project;

import javax.swing.text.html.HTML;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "<HTML><body><h1>Hello Rumesh! How are you doing today?</h1><h1>Hello Wifey! (Nimna Fernando) How are you doing today?</h1></body></HTML>";
        }
}