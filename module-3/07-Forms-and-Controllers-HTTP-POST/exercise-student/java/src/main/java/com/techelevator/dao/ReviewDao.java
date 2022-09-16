package com.techelevator.dao;

import com.techelevator.model.Review;

import java.util.List;

public interface ReviewDao {

	public List<Review> getAllReviews();

	public void save(Review post);
}
