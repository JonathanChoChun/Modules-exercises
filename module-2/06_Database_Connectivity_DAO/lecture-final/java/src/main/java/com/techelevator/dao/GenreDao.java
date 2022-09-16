package com.techelevator.dao;

import com.techelevator.model.Album;
import com.techelevator.model.Genre;

import java.util.List;

public interface GenreDao {
    List<Genre> LoadAllGenres();
    void addGenre(Genre genre);
}
