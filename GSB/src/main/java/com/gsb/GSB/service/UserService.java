package com.gsb.GSB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gsb.GSB.model.UserModel;
import com.gsb.GSB.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String addUser(String name, String surname, String email, String address) {
        return userRepository.addUser(name, surname, email, address);
    }

    public List<UserModel> getUsers() {
        return userRepository.getUsers();
    }

}