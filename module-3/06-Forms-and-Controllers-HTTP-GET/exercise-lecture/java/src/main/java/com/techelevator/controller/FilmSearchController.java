package com.techelevator.controller;

import com.techelevator.dao.FilmDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

    @Autowired
    private FilmDao filmDao;

    @RequestMapping(value="/filmForm", method = RequestMethod.GET)
    public String showFilmSearchForm() {
        return "filmList";
    }
    @RequestMapping(value="/filmSearch", method = RequestMethod.GET)
    public String searchFilms(@RequestParam String genre,
                              @RequestParam int minLength,
                              @RequestParam int maxLength,
                              ModelMap modelMap) {
        modelMap.put("films",filmDao.getFilmsBetween(genre,minLength,maxLength));
        return "filmList";
    }

//    @RequestMapping(value = "/actorForm", method = RequestMethod.GET)
//    public String showSearchActorForm() {
//
//        return "actorList";
//    }
//
//    @RequestMapping(value="/actorSearch", method = RequestMethod.GET)
//    public String searchActors(@RequestParam String lastName,ModelMap models) {
//        /* Call the model and pass values to the jsp */
//        models.put("actors", actorDao.getMatchingActors(lastName));
//
//        return "actorList";
//    }
}