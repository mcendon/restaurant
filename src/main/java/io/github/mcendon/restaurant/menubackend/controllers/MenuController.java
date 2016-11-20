package io.github.mcendon.restaurant.menubackend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.GsonBuilder;
import io.github.mcendon.restaurant.menubackend.managers.MenuManager;
import io.github.mcendon.restaurant.menubackend.model.MenuListModel;

@RestController
public class MenuController {
    
    @RequestMapping("/menu/list")
    public String menuList() {
        return new GsonBuilder()
                .create()
                .toJson(new MenuListModel(MenuManager.getAll()));
    }
    
    @RequestMapping("/menu/group/price")
    public String groupByPrice() {
        return new GsonBuilder()
                .create()
                .toJson(MenuManager.groupByPrice());
    }
}
