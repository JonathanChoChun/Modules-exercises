package com.techelevator.model;

import java.util.Date;

public class Artist {
//    artistid
//    artistname
//    dateestablised
//    url
//    biography
    private long artistid;
    private String artistName;
    private Date dateEstablised;
    private String url;
    private String biography;

    public Artist() {
    }

    public long getArtistid() {
        return artistid;
    }

    public void setArtistid(long artistid) {
        this.artistid = artistid;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public Date getDateEstablised() {
        return dateEstablised;
    }

    public void setDateEstablised(Date dateEstablised) {
        this.dateEstablised = dateEstablised;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistName='" + artistName + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
