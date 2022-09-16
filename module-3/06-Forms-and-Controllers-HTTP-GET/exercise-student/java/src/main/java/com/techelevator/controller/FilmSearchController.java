package com.techelevator.controller;

import com.techelevator.dao.FilmDao;
import org.springframework.aop.scope.ScopedProxyUtils;
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
    FilmDao filmDao;

    @RequestMapping(value = "/filmForm", method = RequestMethod.GET)
    public String showFilmSearchForm(ModelMap modelHolder) {

        modelHolder.put("genres",filmDao.getGenre());

        return "filmList";
    }
    @RequestMapping(value = "/filmSearch", method = RequestMethod.GET)
    public String searchFilms(
            @RequestParam String genre,
            @RequestParam int minLength,
            @RequestParam int maxLength,
            ModelMap modelHolder
    ) {
        modelHolder.put("films",filmDao.getFilmsBetween(genre,minLength,maxLength));
        modelHolder.put("genres",filmDao.getGenre());
        return "filmList";
    }

}