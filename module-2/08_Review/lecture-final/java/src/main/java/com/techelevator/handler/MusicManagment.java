package com.techelevator.handler;

import com.techelevator.model.Album;
import com.techelevator.model.Genre;

import java.util.List;

public interface MusicManagment {
    List<Album> SearchAlbums(String title, String artist);
    List<Album> getAllAlbums();
    List<Genre> getAllGenres();
}
