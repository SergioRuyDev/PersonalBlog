package com.sergioruy.personalblog.service;

import com.sergioruy.personalblog.dto.RegisterRequest;
import com.sergioruy.personalblog.model.User;
import com.sergioruy.personalblog.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void signup(RegisterRequest registerRequest) {
        User user = new User();
        user.setUserName(registerRequest.getUserName());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(encodePassoword(registerRequest.getPassword()));

        userRepository.save(user);
    }

    private String encodePassoword(String password) {
        return passwordEncoder.encode(password);
    }
}
