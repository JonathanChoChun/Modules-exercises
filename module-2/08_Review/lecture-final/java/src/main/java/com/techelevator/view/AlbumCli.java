package com.techelevator.view;

import com.techelevator.dao.AlbumDao;
import com.techelevator.handler.Logger;
import com.techelevator.handler.MusicManagment;
import com.techelevator.model.Album;
import com.techelevator.model.Genre;
import com.techelevator.model.MusicTransport;
import com.techelevator.model.Track;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlbumCli {
    private MusicTransport musicTransport;
    private PrintStream  out;
    private Scanner userInput;
    private Logger logger;
    private Menu menu;
    private MusicManagment musicHandler;

    public AlbumCli(MusicTransport musicTransport, PrintStream out, Scanner in, Logger logger, Menu menu, MusicManagment musicHandler) {
        this.musicTransport = musicTransport;
        this.out = out;
        this.userInput = in;
        this.logger = logger;
        this.menu = menu;
        this.musicHandler = musicHandler;
    }

    public void displayAlbums(String genreName){
        for (Album album : musicHandler.getAllAlbums()) {
            if (genreName==null || genreName.equalsIgnoreCase(album.getGenre().getName())) {
                displayAlbumDetail(album);
            }
        }
    }
    public void displayAllGenres(){
        out.println();
        for (Genre genre : musicHandler.getAllGenres()) {
            out.println(genre.getName());
        }
        out.println();
    }
    public void displayPickedAlbums(){
        for (Album album : musicTransport.getPickedAlbums()) {
            out.println(AnsiColors.yellowValue("-----------------------",true));
            displayAlbumDetail(album);
        }
        out.println(AnsiColors.yellowValue("-----------------------",true));
    }
    public void displayAlbumDetail(Album album){
        out.println("Title    - " + AnsiColors.purpleValue((album).getTitle(),true));
        out.println("  Artist - " + AnsiColors.cyanValue((album).getArtist().getArtistName(),true));
        if ((album).getGenre()!=null) {
            out.println("Genre - " + (album).getGenre().getName());
        }
        for (Track track : (album).getTracks()) {
            out.println("----" + track.getTitle());
        }
    }
    public void pickAlbums(){
        out.println("Enter all or part of an album title");
        out.print("Album Title: ");
        out.flush();
        String title = userInput.nextLine();
        out.println();
        out.println("Enter all or part of an artist's name");
        out.print("Artist: ");
        out.flush();
        String artist = userInput.nextLine();
        selectAlbumsFromList(musicHandler.SearchAlbums(title,artist));
    }

    public void selectAlbumsFromList(List<Album> albums) {
        List<Album> selectedAlbums = new ArrayList<>();
        String albumChoice = "";
        while (!albumChoice.equals("Exit")) {
            String[] albumMenu = new String[albums.size() + 1];
            for (int i = 0; i < albums.size(); i++) {
                albumMenu[i] = albumToMenuString(albums.get(i),"*",this.musicTransport.isAlbumInPickList(albums.get(i)));
            }
            albumMenu[albums.size()] = "Exit";
            albumChoice = (String) menu.getChoiceFromOptions(albumMenu, null);
            if (!albumChoice.equals("Exit")){
                for (Album album: albums) {
                    if (albumChoice.equals(albumToMenuString(album,"",false))){
                        this.musicTransport.addAlbumToPickList(album);
                    }
                }
            }
        }
    }
    private String albumToMenuString(Album album, String selectedIdentifier, boolean isSelected){
        return ((isSelected) ? selectedIdentifier:"") + album.getTitle() + " (" + ((album.getArtist()==null) ? "No Artist" : album.getArtist().getArtistName()) + ")";
    }
}
