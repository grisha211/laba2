package move;
import ru.ifmo.se.pokemon.*;
public final class Swagger extends StatusMove{
    public Swagger(){
        super(Type.NORMAL,0,0.85);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        p.confuse();
        p.setMod(Stat.ATTACK,2);
    }
    @Override
    public String describe(){
        return "Использует Swagger";
    }
}
