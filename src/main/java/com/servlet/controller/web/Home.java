package com.servlet.controller.web;

import com.servlet.model.UserModel;
import com.servlet.service.impl.UserService;
import com.servlet.utils.SessionUtil;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

@WebServlet(urlPatterns = {"/trang-chu", "/dang-nhap"})
public class Home extends HttpServlet {
    @Inject
    private UserService userService;

    ResourceBundle rb = ResourceBundle.getBundle("messenge");

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String view = "";
        String action = req.getParameter("action");
        if (action != null && action.equals("login")) {
            req.setAttribute("display","none");
            String alert = req.getParameter("alert");
            String message = req.getParameter("message");
            if(alert != null && alert.equals("error")){
                String username = req.getParameter("username");
                String password = req.getParameter("password");
                if(username != null && password != null){
                    req.setAttribute("username",username);
                    req.setAttribute("password",password);
                }
                req.setAttribute("display","unset");
                req.setAttribute("messenge",rb.getString(message));
            }
            view = "/views/login.jsp";
        } else if (action != null && action.equals("logout")) {
            SessionUtil.getSessionUtil().removeUser(req, "USERMODEL");
            resp.sendRedirect(req.getContextPath() + "/trang-chu");
            return;
        } else {
            view = "/views/web/home.jsp";
        }
        RequestDispatcher rq = req.getRequestDispatcher(view);
        rq.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action.equals("login")) {
            String username = req.getParameter("username");
            String password = req.getParameter("password");
            List<UserModel> user = new ArrayList<>();
            user = userService.fillByUsernameAndPassword(username, password);
            System.out.println(user.size());
            if (user.size() > 0) {
                SessionUtil.getSessionUtil().putUser(req, "USERMODEL", user.get(0));
                if (user.get(0).getVaiTro().equals("ADMIN")) {
                    resp.sendRedirect(req.getContextPath() + "/admin/trang-chu");
                } else {
                    resp.sendRedirect(req.getContextPath() + "/trang-chu");
                }
            } else {
                resp.sendRedirect(req.getContextPath() + "/dang-nhap?action=login&alert=error&message=loginFalse&username="+username+"&password="+password);
            }
        }
    }
}
