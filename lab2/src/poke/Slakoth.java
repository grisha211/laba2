package poke;
import move.*;
import ru.ifmo.se.pokemon.*;
public final class Slakoth extends Pokemon{
    public Slakoth(String name, int lvl){
        super(name,lvl);
        setType(Type.NORMAL);
        setStats(60,60,60,35,35,30);
        addMove(new Overheat());
        addMove(new Swagger());
        addMove(new ViseGrip());
    }
}
