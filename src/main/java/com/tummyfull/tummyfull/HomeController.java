package com.tummyfull.tummyfull;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/home")
public class HomeController {

//    @Autowired
//    private MenuAPI menuAPI;

    @GetMapping(path = "/welcome")
    public String welcome() {
        return "Welcome To Well cooked";
    }

    @GetMapping(path = "items")
    public List<String> listItems() {
//        return menuAPI.getMenu();
        return Arrays.asList("item1", "item2");
//        return (List<Item>) menuRepository.findAll();
    }
}
