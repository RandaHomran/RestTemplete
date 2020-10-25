package io.javabrains.moviecatalogservice.models;

import java.util.Arrays;
import java.util.List;

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
