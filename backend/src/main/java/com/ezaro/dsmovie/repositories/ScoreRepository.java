package com.ezaro.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ezaro.dsmovie.entities.Score;
import com.ezaro.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}

