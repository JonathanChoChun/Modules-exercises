package com.techelevator.dao;

import com.techelevator.model.Actor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;

/**
 * JDBCActorDao
 */
@Component
public class ActorDaoJdbc implements ActorDao {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public ActorDaoJdbc(DataSource datasource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(datasource);
    }

    @Override
    public List<Actor> getMatchingActors(String search) {
        List<Actor> matchingActors = new ArrayList<>();
        String actorSearchSql = "select first_name, last_name " +
                "from actor " +
                "where last_name ILIKE :search " +
                "order by last_name";
        Map<String,Object> params = new HashMap<>();
        params.put("search","%" + search + "%");
        SqlRowSet results = jdbcTemplate.queryForRowSet(actorSearchSql, params);
        while (results.next()) {
            matchingActors.add(mapRowToActor(results));
        }
        return matchingActors;
    }

    private Actor mapRowToActor(SqlRowSet results) {
        return new Actor(results.getString("first_name"), results.getString("last_name"));
    }

}