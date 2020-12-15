package LabTwo.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class SmartStrike extends PhysicalMove {
    public SmartStrike() {
        super(Type.STEEL, 70, 0);
    }

    @Override
    protected String describe(){
        return "Покемон наносит цели удар в спину острым рогом , никогда не промахивается";
    }
}