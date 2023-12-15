package com.example.MovieWebsite.entities;

import jakarta.persistence.Id;

public class Director {
    @Id
    Long DirectorId;
    String name;
    String surname;
    int age;
    String Movies;
}
