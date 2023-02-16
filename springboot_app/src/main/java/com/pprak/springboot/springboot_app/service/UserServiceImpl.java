package com.pprak.springboot.springboot_app.service;

import com.pprak.springboot.springboot_app.models.User;
import com.pprak.springboot.springboot_app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



import java.util.List;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;



    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    @Transactional
    public void add(User user) {
        userRepository.save(user);
    }

    @Override
    @Transactional
    public User getUserById(long id) {
        return userRepository.getOne(id);
    }

    @Override
    @Transactional
    public void updateUser(long id, User updateUser) {
        User userToUpdate = userRepository.getById(id);
        userToUpdate.setName(updateUser.getName());
        userToUpdate.setSurname(updateUser.getSurname());
        userToUpdate.setAge(updateUser.getAge());
    }

    @Override
    @Transactional
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }
}
