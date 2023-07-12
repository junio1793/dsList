package com.intensivoJava.dslist.controller;

import com.intensivoJava.dslist.DTO.GameMinDTO;
import com.intensivoJava.dslist.DTO.GaneDTO;
import com.intensivoJava.dslist.gameService.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GaneDTO getGameById(@PathVariable Long id){
        GaneDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> getGameMin(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

}
