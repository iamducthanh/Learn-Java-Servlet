package com.servlet.dao;

import com.servlet.model.UserModel;

import java.util.List;

public interface IUserDao extends GenericDao<UserModel> {
    List<UserModel> fillByUsernameAndPassword(String username, String password);
}
