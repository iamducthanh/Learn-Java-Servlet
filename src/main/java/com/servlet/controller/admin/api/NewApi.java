package com.servlet.controller.admin.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.servlet.model.NewModel;
import com.servlet.service.INewService;
import com.servlet.service.impl.NewService;
import com.servlet.utils.HttpUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(urlPatterns = {"/api-admin-new"})
public class NewApi extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("application/json");
        ObjectMapper objectMapper = new ObjectMapper();
        NewModel newModel = HttpUtil.of(req.getReader()).toModel(NewModel.class);
//        Connection connection = null;
//        PreparedStatement statement = null;
//        ResultSet resultSet = null;
//        connection = conect();
//        String sql = "insert into news values (?,?,?,?,?,?,?,?,?,?)";
//        try {
//            statement = connection.prepareStatement(sql);
//            statement.setString(1, "4");
//            statement.setString(2, newModel.getThumbnail());
//            statement.setString(3, newModel.getShortDescription());
//            statement.setString(4, newModel.getContent());
//            statement.setString(5, String.valueOf(newModel.getCategoryId()));
//            statement.setString(6, String.valueOf(newModel.getCategoryId()));
//            statement.setString(7, null);
//            statement.setString(8, null);
//            statement.setString(9, null);
//            statement.setString(10, null);
//            statement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        NewModel news = new NewService().save(newModel);
        objectMapper.writeValue(resp.getOutputStream(), newModel);
    }

    public Connection conect(){
        try {
            String DB_URL = "jdbc:mysql://localhost:3306/dbnews";
            String USER_NAME = "root";
            String PASSWORD = "";
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            return conn;
        } catch (Exception e) {
            return null;
        }
    }

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
//    }
//
//    @Override
//    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doDelete(req, resp);
//    }
//
//    @Override
//    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPut(req, resp);
//    }
}
