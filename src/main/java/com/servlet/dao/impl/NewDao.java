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

    @Override
    public NewModel fillOneById(String id) {
        String sql = "select * from news where id = ?";
        List<NewModel> list = query(sql, new NewMapper(), id);
        return list.isEmpty() ? null : list.get(0);
    }
}
