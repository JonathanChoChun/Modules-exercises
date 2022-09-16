package com.techelevator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Survey;
import com.techelevator.dao.SurveyDao;

@Controller
public class SurveyController {

	@Autowired
	private SurveyDao surveyDao;
	
	
	@RequestMapping(path = "/surveyInput", method = RequestMethod.GET)
	public String showSurveyInput() {
		return "surveyInput";
	}

	@RequestMapping(path = "/surveyInput", method = RequestMethod.POST)
	public String processSurveyInput(Survey survey) {

		// here we do something useful with the survey object
		surveyDao.save(survey);
		
		//return "surveyInput";
		return "redirect:/surveyResult";
	}

	@RequestMapping(path = "/surveyResult", method = RequestMethod.GET)
	public String showSurveyResult(ModelMap map) {
	
		Survey survey = surveyDao.getSurvey();
		map.addAttribute("survey", survey);
		
		return "surveyResult";
	}
}
