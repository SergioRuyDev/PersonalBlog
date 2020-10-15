package com.sergioruy.personalblog.service;

import com.sergioruy.personalblog.dto.RegisterRequest;
import com.sergioruy.personalblog.model.User;
import com.sergioruy.personalblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUserName(registerRequest.getUserName());
        user.setPassword(registerRequest.getPassword());
        user.setEmail(registerRequest.getEmail());
        userRepository.save(user);
    }
}
