package com.techelevator.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import com.techelevator.dao.ReviewDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@Autowired
	private ReviewDao reviewDao;

	@RequestMapping(value={"/greeting","/"})
	public String displayGreeting(ModelMap modelHandler) {

		modelHandler.put("reviews",reviewDao.getAllReviews());

		return "greeting";
	}
}
