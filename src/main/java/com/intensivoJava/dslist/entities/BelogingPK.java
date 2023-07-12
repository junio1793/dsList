package com.intensivoJava.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class BelogingPK {

    @ManyToOne
    @JoinColumn(name = "name_id")
    private Game game;
    @ManyToOne
    @JoinColumn(name = "list_id")
    private GameList list ;

    public BelogingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    public BelogingPK() {
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelogingPK beloging = (BelogingPK) o;
        return Objects.equals(game, beloging.game) && Objects.equals(list, beloging.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }


}
