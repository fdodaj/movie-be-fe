package com.dodaj.movie.movieproject.mapper;

import com.dodaj.movie.movieproject.dto.MovieDto;
import com.dodaj.movie.movieproject.entity.MovieEntity;
import org.springframework.stereotype.Component;

@Component
public class MovieConvertor {

    public MovieDto toDto(MovieEntity entity) {
        MovieDto dto = new MovieDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        return dto;
    }

    public MovieEntity toEntity(MovieDto dto) {
        MovieEntity entity = new MovieEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        return entity;
    }


}
