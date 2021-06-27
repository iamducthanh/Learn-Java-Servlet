package com.servlet.utils;

import javax.servlet.http.HttpServletRequest;

public class SessionUtil {
    public static SessionUtil sessionUtil = null;

    public static SessionUtil getSessionUtil(){
        if(sessionUtil == null){
            return sessionUtil = new SessionUtil();
        } else {
            return sessionUtil;
        }
    }

    public void putUser(HttpServletRequest req, String key, Object object){
        req.getSession().setAttribute(key, object);
    }

    public Object getUser(HttpServletRequest req, String key){
        return req.getSession().getAttribute(key);
    }

    public void removeUser(HttpServletRequest req, String key){
        req.getSession().removeAttribute(key);
    }
}
