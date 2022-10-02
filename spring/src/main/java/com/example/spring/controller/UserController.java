package com.example.spring.controller;

import com.example.spring.common.Result;
import com.example.spring.model.User;
import com.example.spring.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private static final Logger logger = LogManager.getLogger(UserController.class);

    private final UserService userService;


    public UserController(UserService userService) {
        this.userService = userService;
    }


    @GetMapping("/users")
    public Result getUsers() {
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public Result getUsers(@PathVariable String id) {
        return userService.getUser(id);
    }

    @PostMapping("/users")
    public Result insertUser(@RequestBody User user) {
        return userService.insertUser(user);
    }


    @DeleteMapping("/users")
    public Result expireUser(@RequestBody User user) {
        return userService.expireUser(user);
    }
}
