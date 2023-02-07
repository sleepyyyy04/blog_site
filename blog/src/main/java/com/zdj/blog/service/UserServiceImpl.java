package com.zdj.blog.service;

import com.zdj.blog.dao.UserRepository;
import com.zdj.blog.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user= userRepository.findByUsernameAndPassword(username, com.lrm.util.MD5Utils.code(password));
        return user;
    }
}
