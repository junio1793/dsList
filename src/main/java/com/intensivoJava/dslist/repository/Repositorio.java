package com.intensivoJava.dslist.repository;

import com.intensivoJava.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositorio extends JpaRepository<Game,Long> {
}
