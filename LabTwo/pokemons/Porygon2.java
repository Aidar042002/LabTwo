package LabTwo.pokemons;

import LabTwo.moves.DefenseCurl;
import ru.ifmo.se.pokemon.Type;

public class Porygon2 extends Porygon {
    public Porygon2(String name, int level){
        super(name, level);
        this.addType(Type.NORMAL);
        this.setStats(85, 80, 90, 105, 95, 60);
        this.addMove(new DefenseCurl());
    }
}
