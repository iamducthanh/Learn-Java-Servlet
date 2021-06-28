package com.servlet.service;

import com.servlet.model.NewModel;

import java.util.List;

public interface INewService {
    List<NewModel> findAll();
    List<NewModel> fillAllAndSortAsc();
    NewModel findOneById(String id);
}
