package com.sahilhsgupta7.bookMyShow.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sahilhsgupta7.bookMyShow.model.Movie;
import com.sahilhsgupta7.bookMyShow.service.MovieService;

@RestController
public class MovieController {

    @Autowired
    private MovieService movieService;

    @PostMapping("/movie/add")
    public int addMovie(Movie movie) {
        return movieService.addMovie(movie);
    }

    @DeleteMapping("/movie/remove")
    public void removeMovie(Integer movieId) {
        movieService.removeMovie(movieId);
    }

    @GetMapping("/movie/getAll")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    @PostMapping("/movie/getMovieByName")
    public Movie getMovieByName(String movieName) {
        return movieService.getMovieByName(movieName);
    }
}
