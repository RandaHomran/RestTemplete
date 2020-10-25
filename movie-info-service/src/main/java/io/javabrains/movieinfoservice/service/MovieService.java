package io.javabrains.movieinfoservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.movieinfoservice.models.Movie;
import io.javabrains.movieinfoservice.repository.MovieRepository;

@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;
	
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}
	
	public Movie getMovieById(String movieId) {
		return movieRepository.findById(movieId).get();
	}

}
