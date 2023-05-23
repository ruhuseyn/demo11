package com.example.demo11.service;

import com.example.demo11.entity.User;

import java.util.List;

public interface UserInterface {
    List<User> getAll() ;
    User getById(int id );
    User saveUser(User user);
    void deleteUser(int id) ;


}
