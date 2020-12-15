package LabTwo.moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, .8);
    }

    @Override
    protected String describe (){
        return "Наносит удар";
    }
}

