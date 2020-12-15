package LabTwo.moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Discharge extends SpecialMove {
    public Discharge() {
        super(Type.ELECTRIC, 80, 1.);
    }

    @Override
    protected String describe(){
        return "наносит урон";
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) Math.round(-damage/2));
    }

}

