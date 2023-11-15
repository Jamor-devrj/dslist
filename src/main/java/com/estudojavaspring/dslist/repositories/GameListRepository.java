package com.estudojavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojavaspring.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {	

}
