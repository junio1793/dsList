package com.intensivoJava.dslist.gameService;

import com.intensivoJava.dslist.DTO.GameMinDTO;
import com.intensivoJava.dslist.DTO.GaneDTO;
import com.intensivoJava.dslist.entities.Game;
import com.intensivoJava.dslist.projetions.GameMinProjection;
import com.intensivoJava.dslist.repository.Repositorio;
import org.apache.logging.log4j.util.ReadOnlyStringMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    Repositorio repository;

    @Transactional(readOnly = true)
    public GaneDTO findById(Long id){
        Game result = repository.findById(id).get();
        return new GaneDTO(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> game = repository.findAll();
        return game.stream().map(x -> new GameMinDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findgameList(Long listId){
        List<GameMinProjection> game = repository.searchByList(listId);
        return game.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
