package com.accolite.au_demo.controller;


import com.accolite.au_demo.entity.PrivateMessage;
import com.accolite.au_demo.entity.User;
import com.accolite.au_demo.service.PrivateMessageService;
import com.accolite.au_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/message")
public class PrivateMessageController {

    @Autowired
    UserService userService;

    @Autowired
    PrivateMessageService privateMessageService;

    BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @PostMapping("/add/{userId}")
    public ResponseEntity<Object> postMessage(@RequestBody PrivateMessage privateMessage, @PathVariable("userId") Integer userId) {

        User user = userService.getUserById(userId);

        if(user == null)
            return ResponseEntity.notFound().build();

        privateMessage.setUserId(user.getUserId());

        PrivateMessage createdMessage = privateMessageService.add(privateMessage);

        return new ResponseEntity<Object>(createdMessage,HttpStatus.UNAUTHORIZED);
    }

    @GetMapping("/get/{userId}")
    public ResponseEntity<Object> getMessage(@PathVariable("userId") Integer userId, @RequestHeader("password") String password){

        User user = userService.getUserById(userId);

        if(user == null)
            return ResponseEntity.notFound().build();

        if(bCryptPasswordEncoder.matches(password, user.getPassword())) {
            return ResponseEntity.ok(privateMessageService.getMessages(userId));
        }
        return ResponseEntity.ok("Invalid login");
    }

    @DeleteMapping("/delete/{messageId}")
    public String deleteMessage(@PathVariable("messageId") Integer messageId){
        return privateMessageService.deleteMessage(messageId);
    }
}

