package com.accolite.au_demo.service.Impl;

import com.accolite.au_demo.entity.PrivateMessage;
import com.accolite.au_demo.repository.PrivateMessageServiceRepository;
import com.accolite.au_demo.service.PrivateMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
public class PrivateMessageServiceImpl implements PrivateMessageService {

    @Autowired
    PrivateMessageServiceRepository privateMessageServiceRepository;

    @Override
    public PrivateMessage add(PrivateMessage privateMessage) {

        privateMessage.setCreatedTime(new Timestamp(System.currentTimeMillis()));
        return privateMessageServiceRepository.save(privateMessage);
    }

    @Override
    public List<PrivateMessage> getMessages(Integer userId) {
        return privateMessageServiceRepository.findByUserId(userId);
    }

    @Override
    public String deleteMessage(Integer id) {

        Optional<PrivateMessage> privateMessage = privateMessageServiceRepository.findByMessageId(id);
        if(!privateMessage.isPresent())
            return "Message not found!";

        privateMessageServiceRepository.deleteById(id);
        return "Successfully Deleted!";
    }

}
