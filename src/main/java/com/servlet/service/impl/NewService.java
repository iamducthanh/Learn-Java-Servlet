package com.servlet.service.impl;

import com.servlet.dao.INewDao;
import com.servlet.dao.impl.NewDao;
import com.servlet.model.NewModel;
import com.servlet.service.INewService;

import java.util.List;

public class NewService implements INewService {

    @Override
    public List<NewModel> findAll() {
        return new NewDao().fillAll();
    }

    @Override
    public List<NewModel> fillAllAndSortAsc() {
        return new NewDao().fillAllAndSortAsc();
    }

    @Override
    public NewModel findOneById(String id) {
        return new NewDao().fillOneById(id);
    }

}
