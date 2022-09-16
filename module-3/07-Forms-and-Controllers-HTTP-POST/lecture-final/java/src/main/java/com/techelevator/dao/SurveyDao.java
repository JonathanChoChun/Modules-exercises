package com.techelevator.dao;

import com.techelevator.model.Survey;

public interface SurveyDao {

	void save(Survey survey);
	Survey getSurvey();
	
}
