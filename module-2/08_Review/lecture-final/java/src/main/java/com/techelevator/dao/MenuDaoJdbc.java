package com.techelevator.dao;

import com.techelevator.model.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuDaoJdbc implements MenuDao {
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public MenuDaoJdbc(DataSource dataSource){
        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }

    @Override
    public List<MenuItem> getMenuItemsByMenuCode(String menuCode, String securityRoleCode){
        List<MenuItem> menuItems = new ArrayList<>();
        String sql = "\n" +
                "select\n" +
                "    m.menuid\n" +
                "     , menuitemcode\n" +
                "     , menulanguage\n" +
                "     , menutext\n" +
                "     , mt.menutypecode as menuCode\n" +
                "     , mt_sub.menutypecode as subMenu\n" +
                "from\n" +
                "    Menu m\n" +
                "    join MenuTypeMenu mtm\n" +
                "        on mtm.menuid = m.menuid\n" +
                "    join MenuType mt\n" +
                "        on mt.menutypeid = mtm.menutypeid\n" +
                "     join MenuSecurityRole msr\n" +
                "         on msr.menuid = m.menuid\n" +
                "    join SecurityRole sr\n" +
                "        on sr.securityroleid = msr.securityroleid\n" +
                "    left join MenuType mt_sub\n" +
                "        on mt_sub.menutypeid = m.submenutypeid\n" +
                "where\n" +
                "    mt.menutypecode=:menucode\n" +
                "    and\n" +
                "    sr.code = :securitycode\n" +
                "order by\n" +
                "        MenuOrder;";
        Map<String,Object> params = new HashMap<>();
        params.put("menucode",menuCode);
        params.put("securitycode",securityRoleCode);
        SqlRowSet results = this.jdbcTemplate.queryForRowSet(sql,params);
        while (results.next()){
            menuItems.add(mapRowsetToMenuItem(results));
        }
        return menuItems;
    }

    private MenuItem mapRowsetToMenuItem(SqlRowSet results) {
        MenuItem menuItem = new MenuItem();
        menuItem.setMenuItemCode(results.getString("menuitemcode"));
        menuItem.setMenuCode(results.getString("menuCode"));
        menuItem.setMenuText(results.getString("menutext"));
        menuItem.setSubMenu(results.getString("subMenu"));
        menuItem.setMenulanguage(results.getString("menulanguage"));
        return menuItem;
    }
}
