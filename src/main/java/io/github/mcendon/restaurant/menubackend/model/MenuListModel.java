package io.github.mcendon.restaurant.menubackend.model;

import java.util.List;

//i need this model class to return a JSON array with a "list" parent field
public class MenuListModel {
    public List<MenuModel> list;
    public MenuListModel(final List<MenuModel> list) {
        this.list = list;
    }
}
