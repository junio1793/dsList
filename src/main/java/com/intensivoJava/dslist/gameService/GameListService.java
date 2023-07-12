package com.intensivoJava.dslist.gameService;

import com.intensivoJava.dslist.DTO.GameListDto;
import com.intensivoJava.dslist.DTO.GameMinDTO;
import com.intensivoJava.dslist.entities.Game;
import com.intensivoJava.dslist.entities.GameList;
import com.intensivoJava.dslist.repository.GameListRepository;
import com.intensivoJava.dslist.repository.Repositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {


    @Autowired
    GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDto> findAll(){
        List<GameList> game = gameListRepository.findAll();
        return game.stream().map(x -> new GameListDto(x)).toList();
    }
}

