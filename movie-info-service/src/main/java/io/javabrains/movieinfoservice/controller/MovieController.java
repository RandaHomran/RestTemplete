package io.javabrains.movieinfoservice.controller;

import io.javabrains.movieinfoservice.models.Movie;
import io.javabrains.movieinfoservice.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@PostMapping(value="/add")
	public Movie createStudent(@RequestBody Movie movie){
		return movieService.addMovie(movie);
	}
	
	@GetMapping(value="/{movieId}",produces=MediaType.APPLICATION_JSON_VALUE)
	public Movie getMovieById(@PathVariable("movieId")String movieId){
		return movieService.getMovieById(movieId);
	}
	
}



