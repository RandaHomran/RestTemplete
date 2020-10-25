package io.javabrains.ratingsdataservice.controller;

import io.javabrains.ratingsdataservice.model.Rating;
import io.javabrains.ratingsdataservice.model.UserRating;
import io.javabrains.ratingsdataservice.service.RatingDataService;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/ratingsdata")
public class RatingsController {
	
	@Autowired
	private RatingDataService ratingDataService;

  	@GetMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId) {
  		return new UserRating(ratingDataService.getUserRating(userId));
    }
  	
 	@PostMapping("/add")
    public Rating addRatings(@RequestBody Rating rating) {
  		return ratingDataService.addRating(rating);
    }
 
		

}
