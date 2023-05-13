package com.example.demo.services;

import com.example.demo.DTO.GameDTO;
import com.example.demo.DTO.GameMinDTO;
import com.example.demo.entities.Game;
import com.example.demo.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {

        List<Game> result = repository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }
    @Transactional(readOnly = true)
    public GameDTO findById( Long id){
        Game game = repository.findById(id).get();

        return new GameDTO(game);

    }

}
