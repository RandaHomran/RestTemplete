package io.javabrains.ratingsdataservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import io.javabrains.ratingsdataservice.model.Rating;
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


