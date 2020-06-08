package com.dodaj.movie.movieproject.controller;

import com.dodaj.movie.movieproject.dto.MovieDto;
import com.dodaj.movie.movieproject.dto.RoleDto;
import com.dodaj.movie.movieproject.service.MovieService;
import com.dodaj.movie.movieproject.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<RoleDto> getAllRoles(){
        return roleService.getAllRoles();
    }

    @GetMapping("{id}")
    public RoleDto getRole(@PathVariable Integer id) {
        return roleService.getRole(id);
    }

    @PostMapping
    public void addRole(@RequestBody RoleDto role){
        roleService.addRole(role);
    }

    @PutMapping("{id}")
    public void updateRole(@RequestBody RoleDto role, @PathVariable Integer id){
        roleService.updateRole(id , role);
    }

    @DeleteMapping("{id}")
    public void deleteRole(@PathVariable Integer id){
        roleService.deleteRole(id);
    }






}
