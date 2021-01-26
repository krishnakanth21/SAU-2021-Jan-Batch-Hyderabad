package com.accolite.au_demo.service;

import com.accolite.au_demo.entity.User;

import java.util.List;

public interface UserService {
    public User addUser(User user);

    public User getUserById(Integer id);

    public List<User> getUserByEmail(String emailId);

    public User updateUser(User user);

    public String deleteUser(Integer id);
}
