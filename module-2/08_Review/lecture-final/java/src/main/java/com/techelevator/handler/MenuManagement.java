package com.techelevator.handler;

import com.techelevator.model.MenuItem;
import com.techelevator.model.User;

import java.util.List;

public interface MenuManagement {
    List<MenuItem> getMenus(String menuCode, User user);
}
