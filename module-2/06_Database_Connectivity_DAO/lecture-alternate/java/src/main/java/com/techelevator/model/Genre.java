package com.techelevator.model;

public class Genre {
    private String name;
    private String definition;
    public Genre() {
    }
    public Genre(String name, String definition) {
        this.name = name;
        this.definition = definition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    @Override
    public String toString(){
        return this.name; // + " - " + this.definition;
    }
}
