package com.tummyfull.dao;


import com.tummyfull.model.Item;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuDAOImpl implements MenuDAO {
    @Override
    public List<Item> findAllItems() {
        List<Item> items = new ArrayList<>();
        Item item1 = new Item();
        item1.setItemId(1);
        item1.setItemName("Chai");
        item1.setItemPrice(4.00);


        Item item2 = new Item();
        item2.setItemId(2);
        item2.setItemName("Pakoda");
        item2.setItemPrice(10.00);

        Item item3 = new Item();
        item3.setItemId(3);
        item3.setItemName("Thumbsup");
        item3.setItemPrice(8.00d);

        items.add(item1);
        items.add(item2);
        items.add(item3);

        return items;
    }
}
