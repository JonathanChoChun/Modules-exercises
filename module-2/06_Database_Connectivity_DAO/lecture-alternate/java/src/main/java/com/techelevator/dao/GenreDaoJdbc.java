package com.techelevator.dao;

import com.techelevator.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class GenreDaoJdbc implements GenreDao {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public GenreDaoJdbc(DataSource dataSource){

        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
    @Override
    public List<Genre> LoadAllGenres() {
        return null;
    }
}
