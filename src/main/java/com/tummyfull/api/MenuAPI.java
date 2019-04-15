package com.tummyfull.api;


import com.tummyfull.model.Item;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MenuAPI {

    public List<Item> getMenu();
}
