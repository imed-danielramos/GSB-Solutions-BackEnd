package com.gsb.GSB.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.gsb.GSB.model.UserModel;

@Repository
public class UserRepository {

    private List<UserModel> users = new ArrayList<UserModel>(); 
    
    public String addUser(String name, String surname, String email, String address) {
        users.add(new UserModel(name, surname, email, address));
        System.out.println(users.size());
        return "OK";
    }

    public List<UserModel> getUsers() {
        return users;
    }

}