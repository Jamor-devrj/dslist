package com.estudojavaspring.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudojavaspring.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {	

}
