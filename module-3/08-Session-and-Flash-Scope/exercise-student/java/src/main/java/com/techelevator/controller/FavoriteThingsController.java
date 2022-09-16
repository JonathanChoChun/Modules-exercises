package com.techelevator.controller;

import com.techelevator.model.FavoriteThings;
import com.techelevator.model.FavoriteThings;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/FavoriteThings")
public class FavoriteThingsController {


	private static final String APPLICATION_SESSION_KEY = "favoriteThing";
	@RequestMapping(path = "/Page1", method = RequestMethod.GET)
	public String getPage1(ModelMap map) {
		return "page1";
	}



	@RequestMapping(path = "/Page1", method = RequestMethod.POST)
	public String postPage1(FavoriteThings favouriteThings, HttpSession session) {

		System.out.println(favouriteThings.getFavoriteColor());
		session.setAttribute(APPLICATION_SESSION_KEY,favouriteThings);

		return "redirect:/FavoriteThings/Page2";
	}

	@RequestMapping(path = "Page2", method = RequestMethod.GET)
	public String getPage2(ModelMap map) {
		return "page2";}

	@RequestMapping(path = "Page2", method = RequestMethod.POST)
	public String postPage2(ModelMap map, HttpSession session, FavoriteThings favoriteThings) {
		FavoriteThings favoriteThings1 = (FavoriteThings)session.getAttribute(APPLICATION_SESSION_KEY);
		System.out.println(favoriteThings.getFavoriteFood());
		favoriteThings1.setFavoriteFood(favoriteThings.getFavoriteFood());

		session.setAttribute(APPLICATION_SESSION_KEY,favoriteThings1);

		return "redirect:/FavoriteThings/Page3"; }


	@RequestMapping(path = "Page3", method = RequestMethod.GET)
	public String getPage3(ModelMap map) {
		return "page3";}

	@RequestMapping(path = "Page3", method = RequestMethod.POST)
	public String postPage3(ModelMap map, HttpSession session, FavoriteThings favouriteThings) {
		FavoriteThings favoriteThings1 = (FavoriteThings)session.getAttribute(APPLICATION_SESSION_KEY);
		System.out.println(favouriteThings.getFavoriteSeason());
		favoriteThings1.setFavoriteSeason(favouriteThings.getFavoriteSeason());
		session.setAttribute(APPLICATION_SESSION_KEY,favoriteThings1);
		return "redirect:/FavoriteThings/confirmation";}

	@RequestMapping(path = "confirmation", method = RequestMethod.GET)
	public String getConfirmation(ModelMap map) {
		return "confirmation";}

}



