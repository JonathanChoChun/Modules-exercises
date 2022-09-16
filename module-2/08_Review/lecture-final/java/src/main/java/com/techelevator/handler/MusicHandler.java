package com.techelevator.handler;

import com.techelevator.dao.AlbumDao;
import com.techelevator.dao.GenreDao;
import com.techelevator.model.Album;
import com.techelevator.model.Genre;

import java.util.List;

public class MusicHandler implements MusicManagment {
    private AlbumDao albumDao;
    private GenreDao genreDao;

    public MusicHandler(AlbumDao albumDao, GenreDao genreDao) {
        this.albumDao = albumDao;
        this.genreDao = genreDao;
    }

    @Override
    public List<Album> SearchAlbums(String title,String artist){

        return albumDao.SearchAlbums(title,artist);
    }

    @Override
    public List<Album> getAllAlbums(){

        return albumDao.LoadAllAlbums();
    }

    @Override
    public List<Genre> getAllGenres() {
        return genreDao.LoadAllGenres();
    }
}
