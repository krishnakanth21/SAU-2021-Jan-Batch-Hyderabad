package com.accolite.au_demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity(name = "message")
@Getter
@Setter
public class PrivateMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer messageId;

    @Column
    private String message;

    @Column
    private Timestamp createdTime;

    @Column
    private Integer userId;

}
