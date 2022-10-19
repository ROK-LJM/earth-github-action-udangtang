package com.udangtang.test2.service;

import com.udangtang.test2.entity.UserEntity;
import com.udangtang.test2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity insert(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }
}
