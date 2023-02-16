package com.pprak.springboot.springboot_app.repository;

import com.pprak.springboot.springboot_app.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
//    List<User> getAllUsers();

//    void add(User user);
//
//    User getUserById(long id);
//
//    void updateUser(long id, User updateUser);
//
//    void deleteUser(long id);
}
