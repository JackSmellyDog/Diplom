package com.meetup.diplome.demo.service;

import com.meetup.diplome.demo.model.User;

public interface UserService {
    User findUserByEmail(String email);
    void saveUser(User user);
}