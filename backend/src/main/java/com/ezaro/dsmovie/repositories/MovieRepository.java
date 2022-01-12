package com.ezaro.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezaro.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}

