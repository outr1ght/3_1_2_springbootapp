package com.pprak.springbootapp.service;

import com.pprak.springbootapp.models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void add(User user);

    User getUserById(long id);

    void updateUser(long id, User updateUser);

    void deleteUser(long id);

}
