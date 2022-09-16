package com.techelevator.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Album {
    private long albumId;
    private String title;
    private Artist artist;
    private Genre genre;
    private long artistId;
    private BigDecimal price;
    private List<Track> tracks;
    private long recordLabelId;
    private RecordLabel recordLabel;
    private int currentInventory;

    public Album(){
        this.tracks = new ArrayList<>();
    }
    public Album(String title, String artist, String genre, BigDecimal price) {
        this.title = title;
        this.price = price;
        this.tracks = new ArrayList<>();

        setArtistByName(artist);
        setGenreByName(artist);
    }

    public int getCurrentInventory() {
        return currentInventory;
    }

    public void setCurrentInventory(int currentInventory) {
        this.currentInventory = currentInventory;
    }

    public long getArtistId() {
        return artistId;
    }

    public void setArtistId(long artistId) {
        this.artistId = artistId;
    }

    public void setArtistByName(String artistName){
        Artist artistLocal = new Artist();
        artistLocal.setArtistName(artistName);
        this.artist = artistLocal;
    }
    public void setGenreByName(String genreName){
        Genre genreLocal = new Genre();
        genreLocal.setName(genreName);
        this.genre = genreLocal;
    }

    public long getAlbumId() {
        return albumId;
    }

    public void setAlbumId(long albumId) {
        this.albumId = albumId;
    }

    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }

    public long getRecordLabelId() {
        return recordLabelId;
    }

    public void setRecordLabelId(long recordLabelId) {
        this.recordLabelId = recordLabelId;
    }

    public RecordLabel getRecordLabel() {
        return recordLabel;
    }

    public void setRecordLabel(RecordLabel recordLabel) {
        this.recordLabel = recordLabel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
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
