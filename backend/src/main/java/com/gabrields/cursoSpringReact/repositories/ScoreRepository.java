package com.gabrields.cursoSpringReact.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabrields.cursoSpringReact.entities.Score;
import com.gabrields.cursoSpringReact.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
