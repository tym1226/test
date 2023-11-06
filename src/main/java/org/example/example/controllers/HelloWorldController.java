package org.example.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld() {
        return "hello world";
    }

    @GetMapping("/{name}")
    public String helloPerson(@PathVariable("name") String name) {
        return "Hello " + name + "!";
    }
}
