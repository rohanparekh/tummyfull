package com.tummyfull.dao;

import com.tummyfull.model.Item;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MenuDAO {

    public List<Item> findAllItems();
}
