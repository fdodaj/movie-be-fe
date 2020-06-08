package com.dodaj.movie.movieproject.controller;

import com.dodaj.movie.movieproject.dto.MovieDto;
import com.dodaj.movie.movieproject.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public List<MovieDto> getAllMovies(){
        return movieService.getAllmovies();
    }

    @GetMapping("{id}")
    public MovieDto getMovie(@PathVariable Integer id) {
        return movieService.getMovie(id);
    }

    @PostMapping
    public MovieDto addMovie(@RequestBody MovieDto movie){
        return movieService.addMovie(movie);
    }

    @PutMapping("{id}")
    public void updateMovie(@RequestBody MovieDto movie, @PathVariable Integer id){
      movieService.updateMovie(id , movie);
    }

    @DeleteMapping("{id}")
    public void deleteMovie(@PathVariable Integer id){
        movieService.deleteMovie(id);
    }






}
