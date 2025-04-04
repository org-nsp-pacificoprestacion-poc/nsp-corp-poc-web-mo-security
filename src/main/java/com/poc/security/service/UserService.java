package com.poc.security.service;

import com.poc.security.models.User;
import com.poc.security.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        var users= userRepository.findAll();
        for (User user : users) {
            System.out.println("User email: " + user.getEmail());
        }
        return users;
    }
    public User getUsersByEmail(String email) {
        return userRepository.findByEmailWithInjection(email);
    }
}
