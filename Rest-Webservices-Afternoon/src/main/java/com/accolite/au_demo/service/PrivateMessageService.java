package com.accolite.au_demo.service;

import com.accolite.au_demo.entity.PrivateMessage;

import java.util.List;

public interface PrivateMessageService {

    public PrivateMessage add(PrivateMessage privateMessage);

    public List<PrivateMessage> getMessages(Integer userId);

    public String deleteMessage(Integer id);
}
