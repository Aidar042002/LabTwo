package LabTwo.pokemons;

import LabTwo.moves.DoubleTeam;
import LabTwo.moves.SmartStrike;
import LabTwo.moves.WaterPulse;
import LabTwo.moves.Waterfall;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Cosmog extends Pokemon{
    public Cosmog(String name, int level){
        super(name, level);
        this.addType(Type.PSYCHIC);
        this.setStats(43, 29, 31, 29, 31, 37);
        this.addMove(new Waterfall());
        this.addMove(new WaterPulse());
        this.addMove(new DoubleTeam());
        this.addMove(new SmartStrike());
    }
}