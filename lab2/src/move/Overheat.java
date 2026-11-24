package move;
import ru.ifmo.se.pokemon.*;
public final class Overheat extends SpecialMove{
    public Overheat(){
        super(Type.FIRE,130,0.9);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.SPECIAL_ATTACK,-2);
    }
    @Override
    public String describe(){
        return "Использует Overheat";
    }
}
