package poke;
import move.*;
import ru.ifmo.se.pokemon.*;
public final class Seel extends Pokemon{
    public Seel(String name, int lvl){
        super(name,lvl);
        setType(Type.WATER);
        setStats(65,45,55,45,70,45);
        addMove(new SkyUppercut());
        addMove(new Overheat());
        addMove(new FakeOut());
    }
}
