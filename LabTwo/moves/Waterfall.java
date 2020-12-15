package LabTwo.moves;

import ru.ifmo.se.pokemon.*;

public class Waterfall extends PhysicalMove {
    public Waterfall() {
        super(Type.WATER, 80, 1.);
    }

    @Override
    protected String describe() {
        return "Заставляет вздрогнуть ";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2) Effect.flinch(p);
        p.setMod(Stat.ACCURACY, 0);
    }
}
