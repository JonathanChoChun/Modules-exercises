package com.techelevator.dao;

import com.techelevator.handler.Logger;
import com.techelevator.model.Album;
import com.techelevator.model.Genre;
import com.techelevator.model.Track;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenreDaoFile extends DaoFile implements GenreDao {
    public GenreDaoFile(String directoryName, Logger logger) {

        super(directoryName, logger);
    }

    @Override
    public List<Genre> LoadAllGenres(){
        List<Object> genresObjects = new ArrayList<>();
        super.Load(genresObjects,"genre");
        List<Genre> genres = new ArrayList<>();
        for (Object genre : genresObjects){
            genres.add((Genre)genre);
        }
        return genres;
    }

    @Override
    public void addGenre(Genre genre) {

    }

    @Override
    protected void LoadDetail(Scanner curFile,List<Object> listOfObjects) {
        while (curFile.hasNextLine()) {
            String[] genreInfo = curFile.nextLine().split("\\|");
            Genre genre = new Genre(genreInfo[0], genreInfo[1]);
            listOfObjects.add(genre);
        }
    }


}
