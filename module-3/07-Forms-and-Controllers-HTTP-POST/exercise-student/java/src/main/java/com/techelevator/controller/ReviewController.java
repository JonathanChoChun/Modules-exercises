package com.techelevator.controller;


import com.techelevator.dao.ReviewDao;
import com.techelevator.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Controller
public class ReviewController {

    @Autowired
    private ReviewDao reviewDao;

    @RequestMapping(value={"/reviewInput"})
    public String showReviewInput(ModelMap modelHandler) {
        return "reviewForm";
    }

    @RequestMapping(value={"/reviewInput"},method = RequestMethod.POST)
    public String processReviewInput(Review review) {
        review.setDateSubmitted(LocalDateTime.now());
        reviewDao.save(review);
        return "redirect:/";
    }

}
