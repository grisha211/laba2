package poke;
import move.*;
import ru.ifmo.se.pokemon.*;
public final class Trapinch extends Pokemon{
    public Trapinch(String name, int lvl){
        super(name,lvl);
        setType(Type.GROUND);
        setStats(45,100,45,45,45,10);
        addMove(new SkyUppercut());
        addMove(new Overheat());
        addMove(new FakeOut());
        addMove(new Meditate());
    }
}
