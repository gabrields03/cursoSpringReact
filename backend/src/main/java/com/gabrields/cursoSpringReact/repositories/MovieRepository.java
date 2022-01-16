package com.gabrields.cursoSpringReact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrields.cursoSpringReact.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
