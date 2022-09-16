package com.techelevator.dao;

import com.techelevator.model.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenreDaoJdbc implements GenreDao {

    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public GenreDaoJdbc(DataSource dataSource){

        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
    @Override
    //Read (select all)
    public List<Genre> LoadAllGenres() {
        List<Genre> genres = new ArrayList<>();
        String sql = "select \n" +
                "        genreid, \n" +
                "        genrename, \n" +
                "        genredescription \n" +
                "    from \n" +
                "        genre;";
        Map<String, Object> params = new HashMap<>();
        SqlRowSet rowset = this.jdbcTemplate.queryForRowSet(sql,params);
        while (rowset.next()){
            genres.add(mapRowToGenre(rowset));
        }
        return genres;
    }

    //Read (select 1)
    public Genre LoadGenreById(long genreId) {

        String sql = "select\n" +
                "        genreid,\n" +
                "        genrename,\n" +
                "        genredescription\n" +
                "    from\n" +
                "        Genre\n" +
                "    where\n" +
                "        genreid = :genreid";

        Map<String, Object> params = new HashMap<>();
        params.put("genreid",genreId);
        SqlRowSet rowset = this.jdbcTemplate.queryForRowSet(sql,params);
        Genre genre = new Genre();
        if (rowset.next()){
            genre = mapRowToGenre(rowset);
        }
        return genre;
    }

    private Genre mapRowToGenre(SqlRowSet rowset){
        Genre genre = new Genre();
        genre.setName(rowset.getString("genrename"));
        genre.setDefinition(rowset.getString("genredescription"));
        genre.setGenreId(rowset.getLong("genreid"));
        return genre;
    }
    //Create (insert)

    public Genre addGenre(Genre genre){
        String sql = "insert into genre (genrename, genredescription) " +
                "values " +
                "(:genrename, :genredescription) returning genreId;";
        Map<String, Object> params = new HashMap<>();
        params.put("genrename",genre.getName());
        params.put("genredescription",genre.getDefinition());
        //this.jdbcTemplate.update(sql,params);
        Long genreId = this.jdbcTemplate.queryForObject(sql, params, Long.class);
        return LoadGenreById(genreId);
    }

    //Update (update)
    //Delete (delete)
}
