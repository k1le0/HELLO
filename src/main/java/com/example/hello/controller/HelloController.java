package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/time")
    public String time(@RequestParam("time") String time) {
        return time;
    }
}
