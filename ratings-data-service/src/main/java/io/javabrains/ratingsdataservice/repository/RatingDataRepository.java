package io.javabrains.ratingsdataservice.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import io.javabrains.ratingsdataservice.model.Rating;

public interface RatingDataRepository extends CrudRepository<Rating,String> {
	public List <Rating> findByuserId(String userId);
}
