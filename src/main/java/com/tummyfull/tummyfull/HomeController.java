package com.tummyfull.tummyfull;

import com.tummyfull.api.MenuAPI;
import com.tummyfull.dao.MenuRepository;
import com.tummyfull.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private MenuAPI menuAPI;

    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome To Well cooked";
    }

    @GetMapping("items")
    public List<Item> listItems() {
        return menuAPI.getMenu();
//        return (List<Item>) menuRepository.findAll();
    }
}
