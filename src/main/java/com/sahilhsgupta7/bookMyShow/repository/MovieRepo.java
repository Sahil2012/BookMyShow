package com.sahilhsgupta7.bookMyShow.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sahilhsgupta7.bookMyShow.model.Movie;

@Repository
public interface MovieRepo extends JpaRepository<Movie, Integer> {

    @Query(value = "SELECT * FROM movie m WHERE m.movie_name=:name", nativeQuery = true)
    public Movie getMovieByName(@Param("name") String name);
}
