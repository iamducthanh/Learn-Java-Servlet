package com.servlet.dao;

import com.servlet.model.NewModel;

import java.util.List;

public interface INewDao extends GenericDao<NewModel> {
    List<NewModel> fillAll();
    List<NewModel> fillAllAndSortAsc();
}
