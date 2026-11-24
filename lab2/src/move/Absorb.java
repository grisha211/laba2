package move;
import ru.ifmo.se.pokemon.*;
public final class Absorb extends SpecialMove{
    public Absorb(){
        super(Type.GRASS,20,1.0);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        if (damage>0) {
            att.setMod(Stat.HP, (int) -Math.max(1, Math.round(damage / 2.0)));
        }
    }
    @Override
    public String describe(){
        return "Использует Absorb";
    }
}
