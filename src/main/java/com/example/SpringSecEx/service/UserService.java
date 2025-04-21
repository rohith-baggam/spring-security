package com.example.SpringSecEx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.stereotype.Service;

import com.example.SpringSecEx.model.Users;
import com.example.SpringSecEx.repo.UserRepo;

@Service
public class UserService {
    @Autowired
    private UserRepo repo;

    public Users register(Users user) {
        return repo.save(user);

    }

    @Autowired
    AuthenticationManager authManager;
    @Autowired
    private JWTService jwtService;

    public String verify(Users user) {
        Authentication authentication = authManager
                .authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));

        if (authentication.isAuthenticated()) {
            return jwtService.generateToken(user);
        }

        return "failure";
    }
}
