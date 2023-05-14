package com.example.demo.controllers;

import com.example.demo.DTO.GameDTO;
import com.example.demo.DTO.GameMinDTO;
import com.example.demo.entities.Game;
import com.example.demo.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return service.findAll();

    }
    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable long id){
        return service.findById(id);
    }

}


