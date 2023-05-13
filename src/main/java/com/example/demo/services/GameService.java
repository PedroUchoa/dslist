package com.example.demo.services;

import com.example.demo.DTO.GameMinDTO;
import com.example.demo.entities.Game;
import com.example.demo.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    public List<GameMinDTO> findAll() {

        List<Game> result = repository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

}
