package move;
import ru.ifmo.se.pokemon.*;
public final class Blizzard extends SpecialMove{
    public Blizzard(){
        super(Type.ICE,110,0.7);
    }
    @Override
    public String describe(){
        return "Использует Blizzard";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random()<0.1){
            Effect.freeze(p);
        }
    }
}
