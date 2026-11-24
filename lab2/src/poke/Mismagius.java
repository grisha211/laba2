package poke;
import move.*;
import ru.ifmo.se.pokemon.*;
public final class Mismagius extends Pokemon{
    public Mismagius(String name, int lvl){
        super(name, lvl);
        setType(Type.GHOST);
        setStats(60,60,60,105,105,105);
        addMove(new Overheat());
        addMove(new Swagger());
        addMove(new ViseGrip());
        addMove(new Absorb());
    }
}
