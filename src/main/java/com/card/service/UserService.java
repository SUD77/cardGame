package com.card.service;

import com.card.entity.User;

public interface UserService {

    //creating user
    //public User createUser(User user, Set<UserRoles>);
    public User createUser(User user) throws Exception;
}
