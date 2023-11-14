package com.estudojavaspring.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudojavaspring.dslist.dto.GameMinDTO;
import com.estudojavaspring.dslist.entities.Game;
import com.estudojavaspring.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRpository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRpository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	
	}
	
	

}
