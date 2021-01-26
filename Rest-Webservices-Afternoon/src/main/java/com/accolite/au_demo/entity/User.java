package com.accolite.au_demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class User {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

   @Column
    private String emailId;

   @Column
    private String password;

    @OneToMany(mappedBy = "userId", fetch = FetchType.EAGER, cascade = CascadeType.REMOVE)
    private Set<PrivateMessage> privateMessageList;

}
