package move;
import ru.ifmo.se.pokemon.*;
public final class Meditate extends StatusMove{
    public Meditate(){
        super(Type.PSYCHIC,0,1.0);
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK,1);
    }
    @Override
    public String describe(){
        return "Использует Meditate";
    }
}
