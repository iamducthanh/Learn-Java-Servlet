package com.servlet.mapper;

import com.servlet.model.CategoryModel;

import java.sql.ResultSet;

public class CategoryMapper implements RowMapper<CategoryModel>{
    @Override
    public CategoryModel mapRow(ResultSet rs) {
        try {
            CategoryModel categoryModel = new CategoryModel();
            categoryModel.setId(rs.getLong("id"));
            categoryModel.setCode(rs.getString("code"));
            categoryModel.setName(rs.getString("name"));
            return categoryModel;
        } catch (Exception e) {
            return null;
        }
    }
}
