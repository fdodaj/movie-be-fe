package com.dodaj.movie.movieproject.service;

import com.dodaj.movie.movieproject.dto.MovieDto;
import com.dodaj.movie.movieproject.entity.MovieEntity;
import com.dodaj.movie.movieproject.mapper.MovieConvertor;
import com.dodaj.movie.movieproject.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private MovieConvertor movieConvertor;

    public List<MovieDto> getAllmovies(){
        return movieRepository.findAll().stream()
                .map(entity -> movieConvertor.toDto(entity))
                .collect(Collectors.toList());
    }
    public MovieDto getMovie(Integer id){

        return movieConvertor.toDto( movieRepository.getOne(id));
    }

    public MovieDto addMovie(MovieDto dto){
       return movieConvertor.toDto(movieRepository.save(movieConvertor.toEntity(dto)));
    }
    public void updateMovie (Integer id, MovieDto dto){
        MovieEntity entity = movieRepository.findById(id).get();

        entity.setDescription(dto.getDescription());
        entity.setName(dto.getName());
        movieRepository.save(entity);
    }
    public void deleteMovie(Integer id){
        movieRepository.deleteById(id);
    }





}

