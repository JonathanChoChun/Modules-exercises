package com.techelevator.dao;

import com.techelevator.model.Album;

import java.util.List;

public interface AlbumDao {
    List<Album> LoadAllAlbums();
    List<Album> LoadAlbumsByArtist(long artistId);
    List<Album> LoadAlbumsByLabel(long labelId);
    List<Album> LoadAlbumsByGenre(long genreId);
    List<Album> LoadAlbumsByTitleSearch(String targetName);
}
