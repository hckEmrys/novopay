package com.scaler.novopay.restcontroller;

import com.scaler.novopay.models.User;
import com.scaler.novopay.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegistrationController {

    @Autowired
    private UserService userService;


    @RequestMapping("/users")
    List<User> getUsers()
    {
        return userService.getUsers();
    }

    @RequestMapping(method = RequestMethod.POST,value = "/register")
    String registerUser(@RequestBody User userToBeRegistered)
    {
        userService.registerUser(userToBeRegistered);
        System.out.println(userToBeRegistered);
        return "200";
    }


}
