package com.example.sbapp.service;


import com.example.sbapp.entity.User;
import com.example.sbapp.persistence.UserRepo;
import lombok.var;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private UserRepo repo;

    @Override
    public List<User> findAll() {

        List<User> users= (List<User>) repo.findAll();
        return users;
    }
}
