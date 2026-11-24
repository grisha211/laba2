import poke.*;
import ru.ifmo.se.pokemon.*;
public class Main{
    public static void main(String[] args){
    Battle battle = new Battle();
    Carracosta p1 = new Carracosta("Пчелка",1);
    Slakoth p2 = new Slakoth("Ballcraker",1);
    Mismagius p3 = new Mismagius("Thundercock",1);
    Seel p4 = new Seel("Diarrhoea",1);
    Jolteon p5 = new Jolteon("Ballcramps",1);
    Trapinch p6 = new Trapinch("PMS",1);
    battle.addAlly(p1);
    battle.addFoe(p2);
    battle.addAlly(p3);
    battle.addAlly(p5);
    battle.addFoe(p6);
    battle.addFoe(p4);
    battle.go();
    }
}

