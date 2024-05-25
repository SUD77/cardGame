package com.card.service;

import com.card.entity.User;

public interface UserService {

    //creating user
    public User createUser(User user) throws Exception;

    //get user by  username
    public User getUserByUsername(String username) throws Exception;
}
