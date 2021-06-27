package com.servlet.dao.impl;

import com.servlet.dao.IUserDao;
import com.servlet.mapper.UserMapper;
import com.servlet.model.UserModel;

import java.util.List;

public class UserDao extends AbstractDao<UserModel> implements IUserDao {

    @Override
    public List<UserModel> fillByUsernameAndPassword(String username, String password) {
        String sql = "SELECT * FROM user JOIN role ON user.roleid = role.id WHERE username = ? and password = ?";
        return query(sql, new UserMapper(), username, password);
    }
}
