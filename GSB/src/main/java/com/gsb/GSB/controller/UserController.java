package com.gsb.GSB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.gsb.GSB.model.UserModel;
import com.gsb.GSB.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/addUser/{name}/{surname}/{email}/{address}", method = RequestMethod.GET)
    public ResponseEntity<String> addUser(@PathVariable String name, @PathVariable String surname,
            @PathVariable String email, @PathVariable String address) {
        String result = userService.addUser(name, surname, email, address);
        return ResponseEntity.ok().body(result);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @RequestMapping(value = "/getUsers", method = RequestMethod.GET)
    public ResponseEntity<List<UserModel>> getUsers() {
        List<UserModel> result = userService.getUsers();
        return ResponseEntity.ok().body(result);
    }

}