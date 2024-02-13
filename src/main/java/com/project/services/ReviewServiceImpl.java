package com.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.ReviewDao;
import com.project.etities.Review;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class ReviewServiceImpl implements ReviewServices{
	
	@Autowired
	private ReviewDao reviewDao;
	
	@Override
	public Review addReview(Review review) {
		Review reviewNew = reviewDao.save(review);
		return reviewNew;
	}

	

}
