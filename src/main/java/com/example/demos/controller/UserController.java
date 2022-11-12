package com.example.demos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController class
 *
 * @author <a href="https://github.com/gukt">gukt</a>
 */
@RequestMapping("api")
@RestController
public class UserController {

    @GetMapping("user/login")
    public Object login() {
        return "ok";
    }

    @GetMapping("user/logout")
    public Object logout() {
        return "ok";
    }
}
