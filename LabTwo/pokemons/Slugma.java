package LabTwo.pokemons;

import LabTwo.moves.RockThrow;
import LabTwo.moves.RockTomb;
import LabTwo.moves.WillOWisp;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Slugma extends Pokemon{
    public Slugma(String name, int level){
        super(name, level);
        this.addType(Type.FIRE);
        this.setStats(40, 40, 40, 70, 40, 20);
        this.addMove(new RockThrow());
        this.addMove(new WillOWisp());
        this.addMove(new RockTomb());
    }
}
