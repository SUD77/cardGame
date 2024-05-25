package com.card.controller;

import com.card.entity.User;
import com.card.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {
        return this.userService.createUser(user);
    }

    @GetMapping("/{username}")
    public User getUserByUsername(@PathVariable("username") String username) throws Exception{
        return this.userService.getUserByUsername(username);
    }
}