package com.example.demo.repositories;

import com.example.demo.entities.GameList;
import com.example.demo.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameListRepository extends JpaRepository<GameList, Long> {



}
