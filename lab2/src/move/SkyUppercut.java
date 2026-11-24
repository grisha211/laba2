package move;
import ru.ifmo.se.pokemon.*;
public final class SkyUppercut extends PhysicalMove {
    public SkyUppercut(){
        super(Type.FIGHTING,85,0.9);
    }
    @Override
    public String describe(){
        return "Использует Sky Uppercut";
    }
}
