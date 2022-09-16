package com.techelevator.model;

import java.util.ArrayList;
import java.util.List;

public class MusicTransport {
    private List<Genre> genres;
    private List<Album> albums;

    public MusicTransport(List<Object> genres, List<Object> albums) {
        LoadGenresFromObject(genres);
        LoadAlbumsFromObject(albums);
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

    public String[] getGenreArray(){
        String[] choices = new String[this.genres.size()];
        for (int i = 0;i<this.genres.size();i++){
            choices[i] = this.genres.get(i).toString();
        }
        return choices;
    }
}
