package io.github.mcendon.restaurant.menubackend.dataaccess;

import io.github.mcendon.restaurant.menubackend.mocks.MenuListMock;
import io.github.mcendon.restaurant.menubackend.model.MenuModel;
import java.util.List;

public class MenuAccessorImpl implements Accessor<MenuModel> {

    @Override public List<MenuModel> getAll() {
        return new MenuListMock();
    }
    
}
