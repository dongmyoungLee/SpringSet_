package com.example.spring.service;


import com.example.spring.common.Result;
import com.example.spring.common.ResultCode;
import com.example.spring.model.User;
import com.example.spring.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private static final Logger logger = LogManager.getLogger(UserService.class);

    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Result getUsers() {
        try {
            List<User> userList = userRepository.findAll();
            return new Result(ResultCode.SUCCESS, userList);
        } catch (Exception e) {
            return new Result(ResultCode.DB_ERROR);
        }
    }

    public Result getUser(String id) {
        try {
            Optional<User> optionalUser = userRepository.findById(id);
            if (optionalUser.isEmpty()) {
                return new Result(ResultCode.NOT_EXISTS_USER);
            }
            User user = optionalUser.get();
            return new Result(ResultCode.SUCCESS, user);
        } catch (Exception e) {
            return new Result(ResultCode.DB_ERROR);
        }
    }

    public Result insertUser(User user) {
        //reg dttm setting
        //exp dttm setting

        return saveUser(user);
    }

    public Result saveUser(User user) {
        User savedUser = userRepository.save(user);
        if (savedUser == null) {
            return new Result(ResultCode.FAIL_TO_SAVE_USER);
        }
        return new Result(ResultCode.SUCCESS);
    }

    public Result expireUser(User user) {


        //현재 시간으로 업데이트

        User savedUser = userRepository.save(user);
        if (savedUser == null) {
            return new Result(ResultCode.FAIL_TO_SAVE_USER);
        }
        return new Result(ResultCode.SUCCESS);
    }


}
