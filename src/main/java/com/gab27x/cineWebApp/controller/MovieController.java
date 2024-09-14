package com.gab27x.cineWebApp.controller;

import com.gab27x.cineWebApp.model.Movie;
import com.gab27x.cineWebApp.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    // Endpoint para listar todas las películas
    @GetMapping("/getAll")
    public List<Movie> getAllMovies() {
        return movieService.getAllMovies();
    }

    // Endpoint para registrar una nueva película
    @PostMapping("/add")
    public ResponseEntity<Movie> createMovie(@RequestBody Movie movie) {
        Movie savedMovie = movieService.saveMovie(movie);
        return ResponseEntity.ok(savedMovie);
    }
}
