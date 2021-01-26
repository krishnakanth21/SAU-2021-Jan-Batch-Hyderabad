package com.accolite.au_demo.controller;

import com.accolite.au_demo.entity.User;
import com.accolite.au_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/signup")
    public User signUp(@RequestBody Map<String, String> userDetails) {

        User user = new User();
        user.setEmailId(userDetails.get("emailId"));
        user.setPassword(userDetails.get("password"));

        userService.addUser(user);
        return user;
    }

    @GetMapping("/get/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("/get/email/{emailId}")
    public List<User> getUserByEmail(@PathVariable String emailId){
        return userService.getUserByEmail(emailId);
    }


    @PutMapping("/update/{id}")
    public User updateUser(@RequestBody User user, @PathVariable Integer id){
        User newUser = userService.getUserById(id);

        newUser.setEmailId(user.getEmailId());
        newUser.setPassword(user.getPassword());
        return userService.updateUser(newUser);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }

}
