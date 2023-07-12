package com.valle.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valle.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
