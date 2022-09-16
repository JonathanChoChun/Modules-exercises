package com.techelevator.handler;

import com.techelevator.dao.MenuDao;
import com.techelevator.model.MenuItem;
import com.techelevator.model.User;
import com.techelevator.view.Menu;

import java.util.List;

public class MenuHandler implements MenuManagement {
    private MenuDao menuDao;

    public MenuHandler(MenuDao menuDao) {
        this.menuDao = menuDao;
    }

    @Override
    public List<MenuItem> getMenus(String menuCode, User user) {
        return menuDao.getMenuItemsByMenuCode(menuCode,user.getUserrole());
    }
}
