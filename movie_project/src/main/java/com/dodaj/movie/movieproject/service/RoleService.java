package com.dodaj.movie.movieproject.service;

import com.dodaj.movie.movieproject.dto.MovieDto;
import com.dodaj.movie.movieproject.dto.RoleDto;
import com.dodaj.movie.movieproject.entity.MovieEntity;
import com.dodaj.movie.movieproject.entity.RoleEntity;
import com.dodaj.movie.movieproject.mapper.MovieConvertor;
import com.dodaj.movie.movieproject.mapper.RoleConvertor;
import com.dodaj.movie.movieproject.repository.MovieRepository;
import com.dodaj.movie.movieproject.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RoleConvertor roleConvertor;

    public List<RoleDto> getAllRoles(){
        return roleRepository.findAll().stream()
                .map(entity -> roleConvertor.toDto(entity))
                .collect(Collectors.toList());
    }
    public RoleDto getRole(Integer id){
        return roleConvertor.toDto( roleRepository.getOne(id));
    }
    public void addRole(RoleDto dto){
        roleRepository.save(roleConvertor.toEntity(dto));
    }
    public void updateRole (Integer id, RoleDto dto){
        RoleEntity entity = roleRepository.findById(id).get();


        entity.setName(dto.getName());
        roleRepository.save(entity);
    }
    public void deleteRole(Integer id){
        roleRepository.deleteById(id);
    }





}

