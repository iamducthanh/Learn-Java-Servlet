package com.servlet.dao.impl;

import com.servlet.dao.GenericDao;
import com.servlet.dao.INewDao;
import com.servlet.mapper.NewMapper;
import com.servlet.model.NewModel;

import java.util.ArrayList;
import java.util.List;

public class NewDao extends AbstractDao<NewModel> implements INewDao {

    @Override
    public List<NewModel> fillAll() {
        String sql = "SELECT * FROM news";
        return query(sql, new NewMapper());
    }

    @Override
    public List<NewModel> fillAllAndSortAsc() {
        String sql = "SELECT * FROM news order by id asc";
        return query(sql, new NewMapper());
    }
}
