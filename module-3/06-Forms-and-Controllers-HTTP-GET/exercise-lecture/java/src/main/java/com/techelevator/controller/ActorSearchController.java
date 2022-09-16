package com.techelevator.controller;


import com.techelevator.dao.ActorDao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	@RequestMapping(value = "/actorForm", method = RequestMethod.GET)
	public String showSearchActorForm() {

		return "actorList";
	}

	@RequestMapping(value="/actorSearch", method = RequestMethod.GET)
	public String searchActors(@RequestParam String lastName,ModelMap models) {
		/* Call the model and pass values to the jsp */
		models.put("actors", actorDao.getMatchingActors(lastName));

		return "actorList";
	}
}
