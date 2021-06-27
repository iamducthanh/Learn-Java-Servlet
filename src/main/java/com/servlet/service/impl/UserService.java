package com.servlet.service.impl;

import com.servlet.dao.impl.UserDao;
import com.servlet.model.UserModel;
import com.servlet.service.IUserService;

import java.util.List;

public class UserService implements IUserService {
    @Override
    public List<UserModel> fillByUsernameAndPassword(String username, String password) {
        return new UserDao().fillByUsernameAndPassword(username, password);
    }
}
