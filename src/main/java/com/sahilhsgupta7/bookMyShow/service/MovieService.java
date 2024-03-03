package com.sahilhsgupta7.bookMyShow.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sahilhsgupta7.bookMyShow.model.Movie;
import com.sahilhsgupta7.bookMyShow.repository.MovieRepo;

@Service
public class MovieService {

    @Autowired
    private MovieRepo movieRepo;

    public int addMovie(Movie movie) {
        Movie saved = movieRepo.save(movie);
        return saved.getMovieId();
    }

    public void removeMovie(Integer movieId) {
        movieRepo.delete(movieRepo.findById(movieId).get());
    }

    public List<Movie> getAllMovies() {
        return movieRepo.findAll();
    }

    public Movie getMovieByName(String movieName) {
        return movieRepo.getMovieByName(movieName);
    }
}
