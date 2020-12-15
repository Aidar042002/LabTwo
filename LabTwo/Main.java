package LabTwo;
import LabTwo.pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args){
        Battle field = new Battle();
        field.addAlly(new Cosmog("Ronaldo", 2));
        field.addAlly(new Slugma("Messi", 2));
        field.addAlly(new Magcargo("Zidan", 1));
        field.addFoe(new Porygon("Habib", 2));
        field.addFoe(new Porygon2("Casillas", 1));
        field.addFoe(new PorygonZ("Dzyba", 3));
        field.go();
    }
}

