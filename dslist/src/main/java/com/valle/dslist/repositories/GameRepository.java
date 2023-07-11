package com.valle.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valle.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
