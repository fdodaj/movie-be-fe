package com.dodaj.movie.movieproject.repository;

import com.dodaj.movie.movieproject.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
