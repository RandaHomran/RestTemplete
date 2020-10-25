package io.javabrains.ratingsdataservice.model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class UserRating {
	
    private List<Rating> ratings;
    
    public UserRating(List<Rating> ratings) {
  		super();
  		this.ratings = ratings;
  	}

    public UserRating() {
 
  	}

    public List<Rating> getRatings() {
        return ratings;
    }

	public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

}
