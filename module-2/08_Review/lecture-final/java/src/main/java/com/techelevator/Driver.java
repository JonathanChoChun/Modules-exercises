package com.techelevator;

import com.techelevator.dao.*;
import com.techelevator.handler.*;
import com.techelevator.model.*;
import com.techelevator.view.*;

import org.apache.commons.dbcp2.BasicDataSource;

import java.io.*;

public class Driver {
    public static void main(String[] args) {
//        AlbumDao albumDao = new AlbumDaoFile("data", logger);
//        GenreDao genreDao = new GenreDaoFile("data", logger);

        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/albums");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        LogDao logDao = new LogDaoFile();
        AlbumDao albumDao = new AlbumDaoJdbc(dataSource);
        GenreDao genreDao = new GenreDaoJdbc(dataSource);
        UserDao userDao = new UserDaoJdbc(dataSource);
        MenuDao menuDao = new MenuDaoJdbc(dataSource);

        Logger logger = new LogHandler(logDao);
        UserManagment userManager = new UserHandler(userDao);
        MusicManagment musicManager = new MusicHandler(albumDao,genreDao);
        MenuManagement menuHandler = new MenuHandler(menuDao);

        InputStream userInput = System.in;
        PrintStream userOutput = System.out;

        MusicCli musicCli = new MusicCli(userOutput, userInput, logger, userManager, musicManager,menuHandler);
        musicCli.run();
    }
}
