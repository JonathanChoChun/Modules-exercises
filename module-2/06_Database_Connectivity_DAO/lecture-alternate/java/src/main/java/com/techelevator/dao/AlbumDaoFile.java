package com.techelevator.dao;

import com.techelevator.handler.Logger;
import com.techelevator.model.Album;
import com.techelevator.model.Track;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlbumDaoFile extends DaoFile implements AlbumDao {
    //get a directory name passed
    //read all files
    //load a list of albums (with tracks) and return that list
    //private String directoryName;

    public AlbumDaoFile(String directoryName, Logger logger) {
        //this.directoryName = directoryName;
        super(directoryName, logger);
    }


    @Override
    public List<Album> LoadAllAlbums(){
        List<Object> albumsAsObjects = new ArrayList<>();
        super.Load((albumsAsObjects),"album");
        List<Album> albums = new ArrayList<>();
        for (Object album : albumsAsObjects){
            albums.add((Album)album);
        }
        return albums;
    }

    @Override
    public List<Album> LoadAlbumsByArtist(long artistId) {
        return new ArrayList<Album>();
    }

    @Override
    public List<Album> LoadAlbumsByLabel(long labelId) {
        return new ArrayList<Album>();
    }

    @Override
    public List<Album> LoadAlbumsByGenre(long genreId) {
        return new ArrayList<Album>();
    }

    @Override
    public List<Album> LoadAlbumsByTitleSearch(String targetName) {
        return null;
    }

    protected void LoadDetail(Scanner curFile,List<Object> listOfObjects) {
        String[] albumInfo = curFile.nextLine().split("\\|");
        //String title, String artist, String genre, BigDecimal price
        Album album = new Album(albumInfo[0],albumInfo[1],albumInfo[2],new BigDecimal(albumInfo[3]));
        //loop through reamining lines and read in tracks
        while (curFile.hasNextLine()) {
            String[] trackInfo = curFile.nextLine().split("\\|");
            album.addTrack(new Track(trackInfo[0],trackInfo[1]));
        }
        listOfObjects.add(album);
    }
}
