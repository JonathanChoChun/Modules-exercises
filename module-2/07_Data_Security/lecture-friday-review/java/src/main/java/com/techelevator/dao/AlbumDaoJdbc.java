package com.techelevator.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import com.techelevator.model.Album;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
public class AlbumDaoJdbc implements AlbumDao{
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Autowired
    public AlbumDaoJdbc(DataSource dataSource){

        jdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
    }
    @Override
    public List<Album> LoadAllAlbums() {
        List<Album> albums = new ArrayList<>();
        String sql = "select\n" +
                "                albumid,\n" +
                "                title,\n" +
                "                a.recordlabelid,\n" +
                "                a.artistid,\n" +
                "                price,\n" +
                "                currentinventory,\n" +
                "                ar.artistname,\n" +
                "                r.labelname\n" +
                "                from\n" +
                "                    album a\n" +
                "                    left join recordlabel r\n" +
                "                        on a.recordlabelid = r.recordlabelid\n" +
                "                    join artist ar\n" +
                "                        on a.artistid = ar.artistid";
        Map<String,Object> params = new HashMap<>();
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, params);
        while (results.next()) {
            albums.add(mapRowToAlbum(results));
        }
        return albums;
    }

    private Album mapRowToAlbum(SqlRowSet results) {
        Album album = new Album();
        album.setTitle(results.getString("title"));
        album.setArtistByName(results.getString("artistname"));
        album.setAlbumId(results.getLong("albumid"));
        album.setRecordLabelId(results.getLong("recordlabelid"));
        album.setArtistId(results.getLong("artistid"));
        album.setCurrentInventory(results.getInt("currentinventory"));
        album.setArtistByName(results.getString("artistname"));

        return album;
    }

    @Override
    public List<Album> LoadAlbumsByArtist(long artistId) {
        return null;
    }

    @Override
    public List<Album> LoadAlbumsByLabel(long labelId) {
        return null;
    }

    @Override
    public List<Album> LoadAlbumsByGenre(long genreId) {
        return null;
    }

    @Override
    public List<Album> LoadAlbumsByTitleSearch(String targetName) {
        return null;
    }



    public List<Album> SearchAlbums(String title, String artistName) {
        List<Album> albums = new ArrayList<>();
        String sql = "select\n" +
                "    albumid,\n" +
                "    title,\n" +
                "    a.recordlabelid,\n" +
                "    a.artistid,\n" +
                "    price,\n" +
                "    currentinventory,\n" +
                "    ar.artistname,\n" +
                "    r.labelname\n" +
                "from\n" +
                "    album a\n" +
                "        left join recordlabel r\n" +
                "                  on a.recordlabelid = r.recordlabelid\n" +
                "        join artist ar\n" +
                "             on a.artistid = ar.artistid\n" +
                "where\n" +
                "    a.title like :title\n" +
                "    and\n" +
                "    ar.artistname like :artistname";

        Map<String,Object> params = new HashMap<>();
        params.put("title","%" + title + "%"); //'%B%'
        //a.title like :title
        //title -> %B% wrapped in single quotes
        //title = "%B%"
        //a.title like '%B%'
        params.put("artistname","%" + artistName + "%");

        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, params);
        while (results.next()) {
            albums.add(mapRowToAlbum(results));
        }
        return albums;
    }

}
