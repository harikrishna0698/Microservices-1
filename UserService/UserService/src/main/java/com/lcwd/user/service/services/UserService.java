package com.lcwd.user.service.services;

import com.lcwd.user.service.entities.User;

import java.util.List;

public interface UserService {
    //user operations

    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUsers();

    //get user by id
    User getUser(String userId);

    //TODO: delete user
    //TODO: update user
}
