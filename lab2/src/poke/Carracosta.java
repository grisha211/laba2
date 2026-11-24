package poke;
import ru.ifmo.se.pokemon.*;
import move.*;
public final class Carracosta extends Pokemon {
    public Carracosta(String name, int lvl){
        super(name,lvl);
        setType(Type.WATER, Type.ROCK);
        setStats(74,108,133,83,65,32);
        addMove(new WaterGun());
        addMove(new Blizzard());
        addMove(new SwordsDance());
        addMove(new TakeDown());
    }
}
