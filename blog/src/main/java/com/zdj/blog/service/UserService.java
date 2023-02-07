package com.zdj.blog.service;

import com.zdj.blog.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
