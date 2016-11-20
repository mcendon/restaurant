package io.github.mcendon.restaurant.menubackend.managers;

import io.github.mcendon.restaurant.menubackend.dataaccess.Accessor;
import io.github.mcendon.restaurant.menubackend.model.MenuModel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import io.github.mcendon.restaurant.menubackend.dataaccess.MenuAccessorImpl;
import java.util.ArrayList;

public class MenuManager {
    private static Map<Integer, List<MenuModel>> groupBy(final String field) {
        final Map<Integer, List<MenuModel>> result = new HashMap<>(); 
        final List<MenuModel> menuList = getAll();
        
        for (MenuModel menu : menuList) {
            Integer groupKey = null;
            switch (field) {
                case "price":
                    groupKey = menu.getPrice();
                break;
                case "stars":
                    groupKey = menu.getStars();
                break;
            }
            
            if (!result.containsKey(groupKey)) {
                result.put(groupKey, new ArrayList<MenuModel>());
            }
            result.get(groupKey).add(menu);
        }
        
        return result;
    }
    
    public static Map<Integer, List<MenuModel>> groupByStars() {
        return groupBy("stars");
    }
    
    public static Map<Integer, List<MenuModel>> groupByPrice() {
        return groupBy("price");
    }
    
    public static List<MenuModel> getAll() {
        return getMenuAccessor().getAll();
    }
    
    public static Accessor getMenuAccessor() {
        return new MenuAccessorImpl();
    }
}
