package com.techelevator;

import com.techelevator.dao.AlbumDaoFile;
import com.techelevator.dao.GenreDaoFile;
import com.techelevator.dao.LogDao;
import com.techelevator.dao.LogDaoFile;
import com.techelevator.handler.LogHandler;
import com.techelevator.handler.Logger;
import com.techelevator.model.Album;
import com.techelevator.model.Genre;
import com.techelevator.model.MusicTransport;
import com.techelevator.model.Track;
import com.techelevator.view.Menu;
import com.techelevator.view.MusicCli;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        //read in files

        //parse the files with a mix of double, int, string
        //multiple files
        //music
        //albums
        //genre
        //tracks
        //length of play
        //price
        //artist

        //VAT


        //Classes needed
        //Album (will have collection of tracks)
        //Track
        //Genres

        //read directory of files
        //read each file
        //if the file is album add to collection
        //if genre add to genre

//
//        AlbumDaoFile albumReader = new AlbumDaoFile("data");
//        List<Object> albums = albumReader.Load();
//        for (Object album: albums) {
//            System.out.println(((Album)album).getTitle());
//            for (Track track: ((Album)album).getTracks()){
//                System.out.println("----" + track.getTitle());
//            }
//        }
//
//
//        GenreDaoFile genreDaoFile = new GenreDaoFile("data");
//        List<Object> genres = genreDaoFile.Load();
//        for (Object genre: genres) {
//            System.out.println( ((Genre)genre).getName() + " - " + ((Genre)genre).getDefinition());
//        }

        //transport model that has genres & albums


//          for (Genre genre: music.getGenres()) {
//              System.out.println(genre.getName() + " - " + genre.getDefinition());
//          }


        //categorize data

        //output data after calculations
        //log information as we use the system

        //create a final list


//        Adding a logger component to the loads and choices
//        Moving the code we have to a Cli class
//        Looping in the menu and displaying more details
//                        Adding a "purchase" option
//        Displaying some sort of amount
//        Leveraging the MenuItem
        LogDao logDao = new LogDaoFile();
        Logger logger = new LogHandler(logDao);
        //instantiate logger and inject
        AlbumDaoFile albumReader = new AlbumDaoFile("data", logger);

        GenreDaoFile genreDaoFile = new GenreDaoFile("data", logger);

        MusicTransport music = new MusicTransport(genreDaoFile.Load(), albumReader.Load());
//
        InputStream userInput = System.in;
        PrintStream userOutput = System.out;
        Menu menu = new Menu(userInput, userOutput, true);
        //String choice = (String)menu.getChoiceFromOptions(new String[] {"Menu choice 1", "Menu choice 2"},null);
        //System.out.println(choice);

        MusicCli musicCli = new MusicCli(music, menu, userOutput, userInput, logger);
        musicCli.run();


        //line =
        //findInLine
        //wordOnLin
        //equalsIgnoreCase
        //line now has moved pointer in output

        //stack depth

        // append (Stream) so you can add to the file

        // writing outside of try with

        // explore the Java.nio.Path

        // write out with close();

        // size on disk and speed of counting

    }
}
