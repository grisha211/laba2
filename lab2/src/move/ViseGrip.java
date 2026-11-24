package move;
import ru.ifmo.se.pokemon.*;
public final class ViseGrip extends PhysicalMove{
    public ViseGrip(){
        super(Type.NORMAL,55,1.0);
    }
    @Override
    public String describe(){
        return "Использует ViseGrip";
    }
}
