package com.dodaj.movie.movieproject.controller;

import com.dodaj.movie.movieproject.dto.MovieDto;
import com.dodaj.movie.movieproject.dto.UserDto;
import com.dodaj.movie.movieproject.service.MovieService;
import com.dodaj.movie.movieproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDto> getAllUsers(){
        return userService.getAllusers();
    }

    @GetMapping("{id}")
    public UserDto getUser(@PathVariable Integer id) {
        return userService.getUser(id);
    }

    @PostMapping
    public void addUser(@RequestBody UserDto user){
        userService.addUser(user);
    }

    @PutMapping("{id}")
    public void updateUser(@RequestBody UserDto user, @PathVariable Integer id){
        userService.updateUser(id , user);
    }

    @DeleteMapping("{id}")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }






}
