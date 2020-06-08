package com.dodaj.movie.movieproject.mapper;

import com.dodaj.movie.movieproject.dto.RoleDto;
import com.dodaj.movie.movieproject.dto.UserDto;
import com.dodaj.movie.movieproject.entity.RoleEntity;
import com.dodaj.movie.movieproject.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class RoleConvertor {

    public RoleDto toDto(RoleEntity entity) {
        RoleDto dto = new RoleDto();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    public RoleEntity toEntity(RoleDto dto) {
        RoleEntity entity = new RoleEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }


}
