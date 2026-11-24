package move;
import ru.ifmo.se.pokemon.*;
public final class WaterGun extends SpecialMove{
    public WaterGun(){
        super(Type.WATER,40,1.0);
    }
    @Override
    public String describe(){
        return "Использует Water Gun";
    }
}
