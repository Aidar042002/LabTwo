package LabTwo.pokemons;
import LabTwo.moves.Discharge;
import ru.ifmo.se.pokemon.Type;
public class PorygonZ extends Porygon2 {
    public PorygonZ(String name, int level){
        super(name, level);
        this.addType(Type.NORMAL);
        this.setStats(85, 80, 70, 135, 75, 90);
        this.addMove(new Discharge());
    }
}
