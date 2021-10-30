package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YuHan Wang
 * @date 2021/10/29 23:17
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "Hello World";
    }

    @GetMapping("/${id}")
    public String show(@PathVariable("id") Integer id) {
        return String.valueOf(id);
    }
}
