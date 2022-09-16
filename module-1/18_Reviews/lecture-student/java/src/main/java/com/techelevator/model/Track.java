package com.techelevator.model;

public class Track {
    private String title;
    private String time;
    private int minutes;

    public Track(String title, String time) {
        this.title = title;
        this.time = time;
    }
    private void calculateMinutes(){
        //minute calcs
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getMinutes() {
        return minutes;
    }
}
