package com.techelevator.view;

import com.techelevator.dao.AlbumDao;
import com.techelevator.dao.GenreDao;
import com.techelevator.handler.Logger;
import com.techelevator.handler.MenuManagement;
import com.techelevator.handler.MusicManagment;
import com.techelevator.handler.UserManagment;
import com.techelevator.model.*;

import java.io.InputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;

public class MusicCli {
    private MusicTransport musicTransport;
    private Menu menu;
    private PrintStream out;
    private Scanner in;
    private Logger logger;
    private GenreDao genreDao;
    private AlbumCli albumCli;
    private AlbumDao albumDao;
    private UserManagment userHandler;
    private MusicManagment musicHandler;
    private UserInfoCli userInfoCli;
    private User user;
    private MenuManagement menuHandler;

    public MusicCli(PrintStream out, InputStream in, Logger logger, UserManagment userHandler, MusicManagment musicHandler, MenuManagement menuHandler) {
        this.menu = menu;
        this.out = out; //new PrintWriter(out);
        this.in = new Scanner(in);
        this.logger = logger;
        this.userHandler = userHandler;
        this.musicHandler = musicHandler;
        this.menuHandler = menuHandler;
        this.userInfoCli = new UserInfoCli(userHandler, this.in, out);
        this.menu = new Menu(in, out, true);
        this.musicTransport = new MusicTransport();
        this.albumCli = new AlbumCli(this.musicTransport, out, this.in, logger, menu, musicHandler);
    }

    public void run() {
        this.user = this.userInfoCli.loginUser();
        if (this.user == null) System.exit(2);
        showMenu("main");
        //showMenu();
    }

    private void showMenu(String menuCode) {
        List<MenuItem> menuItemList = this.menuHandler.getMenus(menuCode,this.user);
        MenuItem[] menus = menuItemList.toArray(new MenuItem[0]);
        MenuItem menuChoice = this.menu.getChoiceFromOptions(menus,null);

            if (menuChoice.getMenuCode()!=null) {
                showMenu(menuChoice.getMenuCode());
                return;
            }
    }
    private void showMenu() {

        boolean isLeaving = false;
        while (!isLeaving) {
            String choice = (String) menu.getChoiceFromOptions(new String[]{
                    "List all albums",
                    "List all genres",
                    "Get Albums by genre",
                    "Pick albums",
                    "Pick albums by Genre",
                    "Display picked Albums",
                    "Manage Genres",
                    "Exit"}, null);
//            if (choice.getMenuCode()!=null) {
//                showMenu(choice.getMenuCode());
//                return;
//            }
            switch (choice) {
                case "List all albums":
                    this.albumCli.displayAlbums(null);
                    break;
                case "List all genres":
                    this.albumCli.displayAllGenres();
                    break;
                case "Get Albums by genre":
                    boolean isLeavingSub = false;
                    while (!isLeavingSub) {
                        choice = (String) menu.getChoiceFromOptions(musicTransport.getGenreArray("Exit"), "Pick the Genre");
                        switch (choice) {
                            case "Exit":
                                isLeavingSub = false;
                            default:
                                this.albumCli.displayAlbums(choice);
                        }
                    }
                    break;
                case "Pick albums":
                    this.albumCli.pickAlbums();
                    break;
                case "Pick albums by Genre":
                    //DisplayGenreMenu(null);
                    break;
                case "Display picked Albums":
                    this.albumCli.displayPickedAlbums();
                    break;
                case "Manage Genres":
                    String genreChoice = (String) menu.getChoiceFromOptions(new String[]{
                            "Add Genre",
                            "Update Genre",
                            "Pick Genre",
                            "Delete Genre",
                            "Exit"}, null);
                    switch (genreChoice) {
                        case "Add Genre":
                            Genre newGenre = new Genre("Blues", "Sam has the missing code blues");
                            genreDao.addGenre(newGenre);
                            break;
                        case "Update Genre":
                            break;
                        case "Pick Genre":
                            break;
                        case "Add GDelete Genreenre":
                            break;
                    }
                    break;
                case "Exit":
                    isLeaving = true;
                    break;

            }
        }
    }
}
