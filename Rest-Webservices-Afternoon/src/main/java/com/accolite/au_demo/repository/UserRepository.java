package com.accolite.au_demo.repository;

import com.accolite.au_demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> findUserByEmailId(String s);
}
