package LabTwo.moves;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class WillOWisp extends StatusMove {
    public WillOWisp() {
        super(Type.FIRE, 0, .85);
    }

    @Override
    protected String describe(){
        return "Атака огненного огня, поджигающая противника";
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.burn(p);
    }
}

