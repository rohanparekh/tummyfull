package com.tummyfull.api;

import com.tummyfull.dao.MenuDao;
import com.tummyfull.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MenuAPIv1 implements MenuAPI {

    @Autowired
    private MenuDao menuDao;

    @Override
    public List<Item> getMenu() {
        return (List<Item>) menuDao.findAll();
    }
}