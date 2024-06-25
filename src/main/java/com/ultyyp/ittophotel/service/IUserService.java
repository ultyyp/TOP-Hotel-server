package com.ultyyp.ittophotel.service;

import com.ultyyp.ittophotel.model.User;

import java.util.List;

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
