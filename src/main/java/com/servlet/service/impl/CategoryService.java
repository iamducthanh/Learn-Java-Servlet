package com.servlet.service.impl;

import com.servlet.dao.impl.CategoryDao;
import com.servlet.model.CategoryModel;
import com.servlet.service.ICategoryService;

import java.util.List;

public class CategoryService implements ICategoryService {
    @Override
    public List<CategoryModel> fillAll() {
        return new CategoryDao().fillAll();
    }
}
