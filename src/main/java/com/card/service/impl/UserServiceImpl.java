package com.card.service.impl;

import com.card.entity.User;
import com.card.repository.UserRepository;
import com.card.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) throws Exception{

        User local = this.userRepository.findByUserName(user.getUserName());
        if(local != null){
            System.out.println("User is already there !!");
            throw new Exception("User already present !!");
        }
        else{
            //user create
            userRepository.save(user);
        }
        return null;
    }

    //get user by username
    @Override
    public User getUserByUsername(String username) throws Exception {
        User user =  this.userRepository.findByUserName(username);
        if(user == null) {
            System.out.println("Username not found !!");
            throw new Exception("Username doesn't not exist");
        }
        else{
            return user;
        }
    }
}