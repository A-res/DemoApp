package com.ares.springbootdemo.service;

import com.ares.springbootdemo.model.User;
import com.ares.springbootdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UserService {

    private final UserRepository userRepository;

    @Autowired
    //private UserRepository userRepository;
    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    public User findById(Long id){
        return userRepository.getOne(id;
    }

    public List<User> findAll(){
        return UserRepository.findAll();
    }

    public User saveUser(User user){
        return UserRepository.save(user);
    }

    public void deletbyId(Long id){
        UserRepository.deleteById(id);
    }

}

