package poke;
import move.*;
import ru.ifmo.se.pokemon.*;
public final class Jolteon extends Pokemon{
    public Jolteon(String name, int lvl){
        super(name, lvl);
        setType(Type.ELECTRIC);
        setStats(65,65,60,110,95,130);
        addMove(new Overheat());
        addMove(new FakeOut());
    }
}
