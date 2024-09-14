package com.gab27x.cineWebApp.service;

import com.gab27x.cineWebApp.model.Movie;
import java.util.List;
import java.util.Optional;

public interface MovieService {
    List<Movie> getAllMovies();
    Optional<Movie> getMovieById(Long id);
    Movie saveMovie(Movie movie);
    void deleteMovie(Long id);
}
