package com.servlet.mapper;

import com.servlet.model.UserModel;

import java.sql.ResultSet;

public class UserMapper implements RowMapper<UserModel>{

    @Override
    public UserModel mapRow(ResultSet rs) {
        try {
            UserModel userModel = new UserModel();
            userModel.setId(rs.getLong("id"));
            userModel.setUsername(rs.getString("username"));
            userModel.setPassword(rs.getString("password"));
            userModel.setFullName(rs.getString("fullname"));
            userModel.setStatus(String.valueOf(rs.getInt("status")));
            userModel.setVaiTro(rs.getString("code"));
            return userModel;
        } catch (Exception e) {
            return null;
        }
    }
}
