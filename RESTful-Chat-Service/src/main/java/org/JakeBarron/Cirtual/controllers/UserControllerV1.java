package org.JakeBarron.Cirtual.controllers;

import org.JakeBarron.Cirtual.domains.User;
import org.JakeBarron.Cirtual.managers.UserManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.JakeBarron.Cirtual.managers.UserManager;

import java.util.List;
import java.util.stream.Collectors;

public class UserControllerV1 {
	
    @Autowired
    private UserManager userManager;
    
    
    @RequestMapping(method = RequestMethod.GET)
    List<User> getAllUsers() {
        return userManager.getAllUsers();
    }
    
    @RequestMapping(value = "/{userName}", method = RequestMethod.GET)
    User getUserByUserName(@PathVariable String userName) {
        return userManager.getUserByUserName(userName);
    }
    
    @RequestMapping(method = RequestMethod.POST)
    User register(@RequestBody User user) {
        User response = userManager.registerUser(user);
        return response;
    }
    
    
	
}
