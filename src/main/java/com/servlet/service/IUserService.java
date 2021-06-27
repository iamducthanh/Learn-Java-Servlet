package com.servlet.service;

import com.servlet.model.UserModel;

import java.util.List;

public interface IUserService {
    List<UserModel> fillByUsernameAndPassword(String username, String password);
}
