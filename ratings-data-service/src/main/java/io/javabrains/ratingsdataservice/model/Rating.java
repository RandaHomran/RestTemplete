package io.javabrains.ratingsdataservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rating {
	@Id
	private String movieId;
	private int rating;
	private String userId;

	public Rating(String movieId, int rating,String userId) {
		this.movieId = movieId;
		this.rating = rating;
		this.userId = userId;
	}
    
	public Rating() {
	
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getMovieId() {
		return movieId;
	}

	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
}
