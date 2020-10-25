package io.javabrains.movieinfoservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import io.javabrains.movieinfoservice.models.Movie;

public interface MovieRepository extends MongoRepository<Movie,String>  {

}
