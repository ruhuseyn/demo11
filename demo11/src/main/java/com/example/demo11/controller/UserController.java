package com.example.demo11.controller;

import com.example.demo11.entity.User;
import com.example.demo11.manager.UserManager;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    private final UserManager userManager;

    public UserController(UserManager userManager) {
        this.userManager = userManager;
    }

    @GetMapping("/users")
    public List<User> getAll() {
        return userManager.getAll();
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable int id) {
        return userManager.getById(id);
    }

    @PostMapping("/user")
    public void saveUser(@RequestBody User user) {
        saveUser(user);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable int id) {

        deleteUser(id);
    }


}
