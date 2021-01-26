package com.accolite.au_demo.service.Impl;

import com.accolite.au_demo.entity.User;
import com.accolite.au_demo.repository.UserRepository;
import com.accolite.au_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

//    @Autowired
    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Override
    public User addUser(User user){

        String plainPassword = user.getPassword();
        String encrptedPassword = getEncryptedPassword(plainPassword);

        user.setPassword(encrptedPassword);

        User savedUser = userRepository.save(user);
        return savedUser;
    }

    @Override
    public User getUserById(Integer id){
        Optional<User> user = userRepository.findById(id);

        return user.isPresent() ? user.get() : null;
    }

    @Override
    public List<User> getUserByEmail(String emailid) {
        return userRepository.findUserByEmailId(emailid);
    }

    @Override
    public User updateUser(User user) {

        String plainPassword = user.getPassword();
        String encrptedPassword = getEncryptedPassword(plainPassword);
        user.setPassword(encrptedPassword);

        User updatedUser = userRepository.save(user);
        return updatedUser;
    }

    @Override
    public String deleteUser(Integer id) {
        Optional<User> user = userRepository.findById(id);

        if(!user.isPresent())
            return "User Not Found!";

        userRepository.deleteById(id);
        return "User Deleted";
    }

    private String getEncryptedPassword(String plainPassword){

        return bCryptPasswordEncoder.encode(plainPassword);
    }

}
