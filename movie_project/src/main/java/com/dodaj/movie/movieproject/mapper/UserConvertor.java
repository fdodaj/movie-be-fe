package com.dodaj.movie.movieproject.mapper;

import com.dodaj.movie.movieproject.dto.UserDto;
import com.dodaj.movie.movieproject.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserConvertor {

    public UserDto toDto(UserEntity entity) {
        UserDto dto = new UserDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setAge(entity.getAge());
        return dto;
    }

    public UserEntity toEntity(UserDto dto) {
        UserEntity entity = new UserEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        return entity;
    }


}
