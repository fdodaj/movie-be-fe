package com.dodaj.movie.movieproject.service;

import com.dodaj.movie.movieproject.dto.UserDto;
import com.dodaj.movie.movieproject.entity.MovieEntity;
import com.dodaj.movie.movieproject.entity.UserEntity;
import com.dodaj.movie.movieproject.mapper.UserConvertor;
import com.dodaj.movie.movieproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserConvertor userConvertor;

    public List<UserDto> getAllusers(){
        return userRepository.findAll().stream()
                .map(entity -> userConvertor.toDto(entity))
                .collect(Collectors.toList());
    }

    public UserDto getUser(Integer id){

        return userConvertor.toDto( userRepository.getOne(id));
    }

    public void addUser(UserDto dto){

        userRepository.save(userConvertor.toEntity(dto));
    }

    public void updateUser (Integer id, UserDto dto){
        UserEntity entity = userRepository.findById(id).get();
        entity.setAge(dto.getAge());
        entity.setName(dto.getName());
        userRepository.save(entity);
    }
    public  void deleteUser(Integer id){
        userRepository.deleteById(id);
    }





}

