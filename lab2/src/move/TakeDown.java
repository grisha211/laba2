package move;
import ru.ifmo.se.pokemon.*;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public final class TakeDown extends PhysicalMove {
    public TakeDown(){
        super(Type.NORMAL,90,0.85);
    }
    @Override
    public String describe(){
        return "Использует Take Down";
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        att.setMod(Stat.HP, (int) Math.max(1,Math.round(damage/4.0)));
    }
}
