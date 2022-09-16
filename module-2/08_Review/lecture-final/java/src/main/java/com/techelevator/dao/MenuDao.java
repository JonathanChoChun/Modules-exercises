package com.techelevator.dao;

import com.techelevator.model.MenuItem;

import java.util.List;

public interface MenuDao {
    List<MenuItem> getMenuItemsByMenuCode(String menuCode, String securityRoleCode);
}
