package com.techelevator.view;

import com.techelevator.dao.GenreDao;
import com.techelevator.handler.Logger;
import com.techelevator.model.Album;
import com.techelevator.model.Genre;
import com.techelevator.model.MusicTransport;
import com.techelevator.model.Track;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class MusicCli {
    private MusicTransport musicTransport;
    private Menu menu;
    private PrintStream  out;
    private Scanner in;
    private Logger logger;
    private GenreDao genreDao;

    public MusicCli(MusicTransport musicTransport, Menu menu, PrintStream out, InputStream in, Logger logger, GenreDao genreDao) {
        this.musicTransport = musicTransport;
        this.menu = menu;
        this.out = out; //new PrintWriter(out);
        this.in = new Scanner(in);
        this.logger = logger;
        this.genreDao = genreDao;
    }
    public void run(){
        //keep track of albums we pick
        //display number picked
        //when displaying albums, show if they have been picked in full list
        //when we exit show all details
        //have menu choice to show details



        boolean isLeaving = false;
        while (!isLeaving) {
            String choice = (String) menu.getChoiceFromOptions(new String[]{
                    "List all albums",
                    "List all genres",
                    "Get Albums by genre",
                    "Pick albums",
                    "Pick albums by Genre",
                    "Display picked Albums",
                    "Manage Genres",
                    "Exit"}, null);
            switch (choice) {
                case "List all albums":
                    DisplayAlbums(null);
                    break;
                case "List all genres":
                    for (Genre genre : musicTransport.getGenres()) {
                        System.out.println(genre.getName() + " - " + genre.getDefinition());
                    }
                    break;
                case "Get Albums by genre":
                    boolean isLeavingSub = false;
                    while (!isLeavingSub) {
                        choice = (String) menu.getChoiceFromOptions(musicTransport.getGenreArray("Exit"), "Pick the Genre");
                        switch (choice) {
                            case "Exit":
                                isLeavingSub = false;
                            default:
                                DisplayAlbums(choice);
                        }
                    }
                    break;
                case "Pick albums":
                    DisplayAlbumsMenu(null);
                    break;
                case "Pick albums by Genre":
                    //DisplayGenreMenu(null);
                    break;
                case "Display picked Albums":
                    DisplayPickedAlbums();
                    break;
                case "Manage Genres":
                    String genreChoice = (String) menu.getChoiceFromOptions(new String[]{
                            "Add Genre",
                            "Update Genre",
                            "Pick Genre",
                            "Delete Genre",
                            "Exit"}, null);
                    switch (genreChoice) {
                        case "Add Genre":
                            Genre newGenre = new Genre("Blues","Sam has the missing code blues");
                            genreDao.addGenre(newGenre);
                            break;
                        case "Update Genre":
                            break;
                        case "Pick Genre":
                            break;
                        case "Add GDelete Genreenre":
                            break;
                    }
                    break;
                case "Exit":
                    isLeaving = true;
                    break;

            }
        }
    }



    private void DisplayAlbumsMenu(String genre) {
        this.out.println();
        this.out.println();
        boolean isLeaving = false;
        while (!isLeaving) {
            Object[] albumArray = musicTransport.getAlbumArray("Exit",null);
            String choice = (String) menu.getChoiceFromOptions(albumArray, "Pick the Album");
            switch (choice) {
                case "Exit":
                    isLeaving = true;
                    break;
                default:
                    this.logger.writeAudit("Picking:" + choice);
                    this.musicTransport.addAlbumByTitleToPickList(choice);
                    break;
            }
        }

    }

    private void DisplayAlbums(String genreName){
        for (Album album : musicTransport.getAlbums()) {
            if (genreName==null || genreName.equalsIgnoreCase(album.getGenre().getName())) {
                DisplayAlbumDetail(album);
            }
        }
    }
    private void DisplayPickedAlbums(){
        for (Album album : musicTransport.getPickedAlbums()) {
            DisplayAlbumDetail(album);
        }
    }
    private void DisplayAlbumDetail(Album album){
        out.println("Title - " + (album).getTitle());
        out.println("Artist - " + (album).getArtist().getArtistName());
        if ((album).getGenre()!=null) {
            out.println("Genre - " + (album).getGenre().getName());
        }
        for (Track track : (album).getTracks()) {
            out.println("----" + track.getTitle());
        }
    }
}
