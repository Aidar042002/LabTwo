package LabTwo.pokemons;

import LabTwo.moves.Discharge;
import LabTwo.moves.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Porygon extends Pokemon{
    public Porygon(String name, int level){
        super(name, level);
        this.addType(Type.NORMAL);
        this.setStats(65, 60, 70, 85, 75, 40);
        this.addMove(new Discharge());
        this.addMove(new DoubleTeam());
    }
}
