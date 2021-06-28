package com.servlet.controller.admin;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.servlet.constant.SystemConstant;
import com.servlet.model.CategoryModel;
import com.servlet.model.NewModel;
import com.servlet.service.ICategoryService;
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

    @Inject
    private ICategoryService categoryService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        NewModel newModel = new NewModel();
        String view = "";
        String type = req.getParameter("type");
        String id = req.getParameter("id");
        if(type == null && id == null){
            newModel.setListResult(newService.findAll());
            req.setAttribute(SystemConstant.MODEL, newModel.getListResult());
            view = "/views/admin/news/listNew.jsp";
        } else if(type.equals("add") && id == null){
            CategoryModel categoryModel = new CategoryModel();
            categoryModel.setListResult(categoryService.fillAll());
            req.setAttribute("category", categoryModel.getListResult());
            req.setAttribute("type", type);
            view = "/views/admin/news/edit.jsp";
        } else if(type.equals("edit") && id != null){
            newModel = newService.findOneById(id);
            req.setAttribute("type", type);
            req.setAttribute(SystemConstant.MODEL, newModel);
            view = "/views/admin/news/edit.jsp";
        }
//        String sort = req.getParameter("sort");
//        if(sort == null){
//            newModel.setListResult(newService.findAll());
//        } else if(sort.equals("asc")) {
//            System.out.println("asc done");
//            newModel.setListResult(newService.fillAllAndSortAsc());
//            newModel.getListResult().forEach((newss) -> {
//                System.out.println(newss.getTitle());
//            });
//        }
        RequestDispatcher rd = req.getRequestDispatcher(view);
        rd.forward(req, resp);
    }
}
