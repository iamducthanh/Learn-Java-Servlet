package com.servlet.dao.impl;

import com.servlet.dao.ICategoryDao;
import com.servlet.mapper.CategoryMapper;
import com.servlet.model.CategoryModel;

import java.util.List;

public class CategoryDao extends AbstractDao<CategoryModel> implements ICategoryDao {
    @Override
    public List<CategoryModel> fillAll() {
        String sql = "select * from category";
        return query(sql, new CategoryMapper());
    }
}
