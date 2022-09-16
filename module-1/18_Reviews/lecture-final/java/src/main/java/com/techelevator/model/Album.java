package com.techelevator.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private String artist;
    private String genre;
    private BigDecimal price;
    private List<Track> tracks;

    public Album(String title, String artist, String genre, BigDecimal price) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.price = price;
        this.tracks = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Track[] getTracks() {
        return tracks.toArray(new Track[0]);
    }

    public void addTrack(Track track){
        this.tracks.add(track);
    }
}
