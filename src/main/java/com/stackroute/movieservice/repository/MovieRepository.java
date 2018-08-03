package com.stackroute.movieservice.repository;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.stackroute.movieservice.domain.Movie;

@Repository
public interface MovieRepository extends CrudRepository<Movie,Integer> {
	
	@Query("SELECT movie FROM Movie movie WHERE movie.movieName LIKE CONCAT(:searchTerm,'%')")
	public List<Movie> getByMovieAlpha(@Param("searchTerm")String searchTerm);

}
