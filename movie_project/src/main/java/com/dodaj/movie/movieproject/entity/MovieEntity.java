package com.dodaj.movie.movieproject.entity;

import javax.persistence.*;

@Entity
@Table(name = "movie")
public class MovieEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "movie_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "movie_seq", sequenceName = "movie_seq", allocationSize = 1)
    private Integer id;

    @Column(name = "movie_name")
    private String name;

    @Column(name = "description")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
