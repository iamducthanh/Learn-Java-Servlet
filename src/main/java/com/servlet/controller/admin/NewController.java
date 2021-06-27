package com.servlet.controller.admin;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.servlet.constant.SystemConstant;
import com.servlet.model.NewModel;
import com.servlet.service.INewService;
import com.servlet.service.impl.NewService;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/admin/new"})
public class NewController extends HttpServlet {
    @Inject
    private INewService newService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NewModel newModel = new NewModel();
        String sort = req.getParameter("sort");
        if(sort == null){
            newModel.setListResult(newService.findAll());
        } else if(sort.equals("asc")) {
            System.out.println("asc done");
            newModel.setListResult(newService.fillAllAndSortAsc());
            newModel.getListResult().forEach((newss) -> {
                System.out.println(newss.getTitle());
            });
        }
        req.setAttribute(SystemConstant.MODEL, newModel.getListResult());
        RequestDispatcher rd = req.getRequestDispatcher("/views/admin/news/listNew.jsp");
        rd.forward(req, resp);
    }
}
