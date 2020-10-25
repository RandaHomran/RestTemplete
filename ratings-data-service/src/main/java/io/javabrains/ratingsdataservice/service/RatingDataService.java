package io.javabrains.ratingsdataservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import io.javabrains.ratingsdataservice.model.Rating;
import io.javabrains.ratingsdataservice.model.UserRating;
import io.javabrains.ratingsdataservice.repository.RatingDataRepository;

@Service
public class RatingDataService {
	
	@Autowired 
	private RatingDataRepository ratingDataRepository;

	public List<Rating> getUserRating(String userId) {
		return ratingDataRepository.findByuserId(userId);
	}
	
	public Rating addRating(Rating rating) {
		return ratingDataRepository.save(rating);
		}
	
	
		
	}


