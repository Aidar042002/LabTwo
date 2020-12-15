package LabTwo.pokemons;

import LabTwo.moves.StoneEdge;
import ru.ifmo.se.pokemon.Type;

public class Magcargo extends Slugma {
    public Magcargo(String name, int level){
        super(name, level);
        this.addType(Type.ROCK);
        this.addType(Type.FIRE);
        this.setStats(60, 50, 120, 90, 80, 30);
        this.addMove(new StoneEdge());
    }
}