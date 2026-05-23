package Homework.FightingGame;

import java.util.Random;

public class Fight {

    private String name;
    private int HP;

    public Fight() {
    }

    public Fight(String name, int HP) {
        this.name = name;
        this.HP = HP;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

public void grapple(Fight fight){
    //伤害1-20
    Random r = new Random();
    int attack = r.nextInt(20)+1;
    //判断到零后的
    int residualBlood = fight.getHP() - attack;
    if (residualBlood < 0){
        residualBlood = 0;
    }
    fight.setHP(residualBlood);
    System.out.println(this.getName()+"举起了拳头打了,"+fight.getName()+"一下,造成了"+attack+"点伤害," +
            fight.getName()+"还剩下"+ residualBlood +"点血");

}
}


