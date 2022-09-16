package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

public class MusicTransport {
    private List<Genre> genres;
    private List<Album> albums;

    private List<Album> pickedItems;

    public MusicTransport(List<Object> genres, List<Object> albums) {
        LoadGenresFromObject(genres);
        LoadAlbumsFromObject(albums);
        this.pickedItems = new ArrayList<>();
    }
    private void LoadGenresFromObject(List<Object> genres){
        this.genres = new ArrayList<>();
        for (Object genre : genres){
            this.genres.add((Genre)genre);
        }
    }
    private void LoadAlbumsFromObject(List<Object> albums){
        this.albums = new ArrayList<>();
        for (Object album : albums){
            this.albums.add((Album)album);
        }
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public String[] getGenreArray(String extraElement){
        String[] choices = new String[this.genres.size() + (extraElement==null ? 0 : 1)];
        for (int i = 0;i<this.genres.size();i++){
            choices[i] = this.genres.get(i).toString();
        }
        choices[this.genres.size()] = extraElement;
        return choices;
    }

    public String[] getAlbumArray(String extraElement, String genre){
        String[] choices = new String[this.albums.size() + ((extraElement==null) ? 0 : 1)];
        for (int i = 0;i<this.albums.size();i++){
            choices[i] = this.albums.get(i).getTitle();
        }
        choices[this.albums.size()] = extraElement;
        return choices;
    }
    public void addAlbumToPickList(Album album) {
        if (!this.pickedItems.contains(album)) {
            this.pickedItems.add(album);
        }
    }
    public void addAlbumByTitleToPickList(String title) {
        for (Album album : this.albums) {
            if (album.getTitle().equalsIgnoreCase(title)) {
                addAlbumToPickList(album);
            }
        }
    }
    public Album[] getPickedAlbums(){
        return this.pickedItems.toArray(new Album[0]);
    }
}
