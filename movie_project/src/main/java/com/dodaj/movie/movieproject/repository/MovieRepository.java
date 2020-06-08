package com.dodaj.movie.movieproject.repository;


import com.dodaj.movie.movieproject.entity.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository  extends JpaRepository<MovieEntity, Integer> {
}
