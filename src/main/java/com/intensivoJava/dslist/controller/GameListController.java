package com.intensivoJava.dslist.controller;

import com.intensivoJava.dslist.DTO.GameListDto;
import com.intensivoJava.dslist.DTO.GameMinDTO;
import com.intensivoJava.dslist.entities.GameList;
import com.intensivoJava.dslist.gameService.GameListService;
import com.intensivoJava.dslist.repository.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/list")
public class GameListController {

    @Autowired
    GameListService gameListService;

    @GetMapping
    public List<GameListDto> getGameList(){
        List<GameListDto> result = gameListService.findAll();
        return result;
    }

}
