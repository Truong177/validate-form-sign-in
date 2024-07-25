package com.example.validateformsignin.service.impl;

import com.example.validateformsignin.model.User;
import com.example.validateformsignin.repository.IUserRepository;
import com.example.validateformsignin.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
    @Autowired
    private IUserRepository userRepository;
    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

}
