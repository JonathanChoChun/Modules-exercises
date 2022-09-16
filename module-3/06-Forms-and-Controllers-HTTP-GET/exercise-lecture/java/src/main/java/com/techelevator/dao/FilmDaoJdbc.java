package com.techelevator.dao;

import com.techelevator.model.Film;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

/**
 * JDBCFilmDao implements FilmDao
 */
@Component
public class FilmDaoJdbc implements FilmDao {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public FilmDaoJdbc(DataSource datasource) {
        this.jdbcTemplate = new NamedParameterJdbcTemplate(datasource);
    }

    @Override
    public List<Film> getFilmsBetween(String genre, int minLength, int maxLength) {
        List<Film> matchingFilms = new ArrayList<>();

        String filmSearchSql = "SELECT title, description, release_year, length, rating FROM film "
                + "JOIN film_category ON film_category.film_id = film.film_id JOIN category ON category.category_id = film_category.category_id "
                + "WHERE category.name = :genre AND length BETWEEN :minLength AND :maxLength";
        Map<String,Object> params = new HashMap<>();
        params.put("genre",genre);
        params.put("minLength",minLength);
        params.put("maxLength",maxLength);
        SqlRowSet results = jdbcTemplate.queryForRowSet(filmSearchSql, params);
        while (results.next()) {
            matchingFilms.add(mapRowToFilm(results));
        }
        return matchingFilms;
    }

    private Film mapRowToFilm(SqlRowSet results) {
        Film filmRow = new Film();
        filmRow.setTitle(results.getString("title"));
        filmRow.setDescription(results.getString("description"));
        filmRow.setReleaseYear(results.getInt("release_year"));
        filmRow.setLength(results.getInt("length"));
        filmRow.setRating(results.getString("rating"));
        return filmRow;
    }

}