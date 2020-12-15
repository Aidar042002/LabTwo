package LabTwo.moves;

import ru.ifmo.se.pokemon.*;

public class WaterPulse extends PhysicalMove {
    public WaterPulse() {
        super(Type.WATER, 80, 1.);
    }

    @Override
    protected String describe() {
        return "Сбивает с толку";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.2) Effect.confuse(p);
        p.setMod(Stat.ACCURACY, 0);
    }
}
