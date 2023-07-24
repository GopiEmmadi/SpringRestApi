package com.example.jdbc.demo.service;

import com.example.jdbc.demo.domain.User;

import java.util.List;

public interface UserService {
    List<User> getUsers();
    User getUserById(Integer id);
    User addUser(User user);
    User updateUser(Integer id,User user);
    void deleteUser(Integer id);
}
