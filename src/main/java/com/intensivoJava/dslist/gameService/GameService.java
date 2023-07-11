package com.intensivoJava.dslist.gameService;

import com.intensivoJava.dslist.entities.Game;
import com.intensivoJava.dslist.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    Repositorio repository;

    public List<Game> findAll(){
        List<Game> game = repository.findAll();
        return game;
    }
}
