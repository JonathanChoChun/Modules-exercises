package com.techelevator.dao;

import com.techelevator.model.Album;
import com.techelevator.model.Track;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlbumDaoFile extends DaoFile {
    //get a directory name passed
    //read all files
    //load a list of albums (with tracks) and return that list
    //private String directoryName;

    public AlbumDaoFile(String directoryName) {
        //this.directoryName = directoryName;
        super(directoryName);
    }


    public List<Object> Load(){
//        //load files from directory
//        File directory = new File(this.directoryName);
//        if (!directory.isDirectory()) {
//            throw new RuntimeException("Not a directory:" + directoryName);
//        }
//        //loop through all files
//        List<Album> albums = new ArrayList<>();
//        for (File file : directory.listFiles()){
//            try (Scanner currentFile = new Scanner(file)) {
//                if (currentFile.hasNextLine()){
//                    String typeOfFile = currentFile.nextLine();
//                    if (typeOfFile.equalsIgnoreCase("album")) {
//                        albums.add(LoadAlbum(currentFile));
//                    }
//                }
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        //read first line
//        //if album, load
        List<Object> albums = new ArrayList<>();
        super.Load((albums),"album");
        return albums;
    }

    public void LoadDetail(Scanner curFile,List<Object> listOfObjects) {
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
