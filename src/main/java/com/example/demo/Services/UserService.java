package com.example.demo.Services;

import com.example.demo.Repository.UserRepository;
import com.example.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }
    public User save(User  user){
        return userRepository.save(user);
    }

    public Iterable<User> save(List<User> users) {
        return userRepository.saveAll(users);
    }
}
