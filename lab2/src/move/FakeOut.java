package move;
import ru.ifmo.se.pokemon.*;
public final class FakeOut extends PhysicalMove{
    public FakeOut(){
        super(Type.NORMAL,40,1.0,3,1);
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect.flinch(p);
    }
    @Override
    public String describe(){
        return "Использует Fake Out";
    }
}
