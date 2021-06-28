package com.servlet.filter;

import com.servlet.constant.SystemConstant;
import com.servlet.model.UserModel;
import com.servlet.utils.SessionUtil;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthorizationFilter implements Filter {
    private ServletContext servletContext;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.servletContext = filterConfig.getServletContext();
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest rq = (HttpServletRequest) request;
        HttpServletResponse rp = (HttpServletResponse) response;
        System.out.println("filter on");
        String urlRq = rq.getRequestURI();
        System.out.println(urlRq);
        if(urlRq.contains("/admin")){
            UserModel userModel = (UserModel) SessionUtil.getSessionUtil().getUser(rq, "USERMODEL");
            if(userModel == null){
                rp.sendRedirect(rq.getContextPath() + "/dang-nhap?action=login&alert=error&message=notLogin");
            } else {
                if(userModel.getVaiTro().equals(SystemConstant.ADMIN)){
                    chain.doFilter(request, response);
                } else if (userModel.getVaiTro().equals(SystemConstant.USER)){
                    rp.sendRedirect(rq.getContextPath() + "/dang-nhap?action=login&alert=error&message=notPermission");
                }
            }
        } else {
            chain.doFilter(request, response);
        }
    }

    @Override
    public void destroy() {

    }
}
