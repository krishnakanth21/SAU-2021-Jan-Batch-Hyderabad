package com.accolite.au_demo.repository;

import com.accolite.au_demo.entity.PrivateMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PrivateMessageServiceRepository extends JpaRepository <PrivateMessage, Integer>{

    public List<PrivateMessage> findByUserId(Integer userId);
    public Optional<PrivateMessage> findByMessageId(Integer messageId);
}
