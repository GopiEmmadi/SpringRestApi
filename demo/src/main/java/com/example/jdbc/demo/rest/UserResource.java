package com.example.jdbc.demo.rest;

import com.example.jdbc.demo.domain.User;

import com.example.jdbc.demo.service.empl.UserServiceImpl;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
public class UserResource {

    private UserServiceImpl userService;

    public UserResource(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/users/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        return userService.getUserById(id);
    }
    @PostMapping("/users")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
    }
    @PutMapping("/users/{id}")
    public User updateUser(@PathVariable("id") Integer id,@RequestBody User user){
        return userService.updateUser(id,user);
    }
}
