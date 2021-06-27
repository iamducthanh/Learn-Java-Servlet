package com.servlet.dao;

import com.servlet.model.CategoryModel;

import java.util.List;

public interface ICategoryDao extends GenericDao<CategoryModel> {
    List<CategoryModel> fillAll();
}
