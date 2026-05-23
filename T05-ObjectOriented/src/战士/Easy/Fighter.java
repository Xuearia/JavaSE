package 战士.Easy;

import java.util.Random;

public class Fighter {
    private String name;
    private int health;

    public Fighter() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(Fighter opponent) {
        Random r = new Random();
        int damage = r.nextInt(20) + 1;
        opponent.health = opponent.health - damage;
        if (opponent.health < 0) {
            opponent.health = 0;
        }
        this.show(opponent, damage);
    }

    public void show(Fighter opponent, int damage) {
        System.out.printf("%s 攻击了 %s，造成了 %d 点伤害，%s 还剩下 %d 点血。\n", this.name, opponent.name, damage, opponent.name, opponent.health);
    }


    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        fighter1.setName("小楷");
        fighter1.setHealth(300);
        Fighter fighter2 = new Fighter();
        fighter2.setName("小瀚");
        fighter2.setHealth(200);

        int rount = 1;
        while (true) {
            System.out.printf("第%d回合:\n",rount);
            fighter1.attack(fighter2);
            if (fighter2.getHealth() <= 0) {
                System.out.printf("%sKO了%s,%s获胜!", fighter1.getName(), fighter2.getName(), fighter1.getName());
                break;
            }
            fighter2.attack(fighter1);
            if (fighter1.getHealth() <= 0) {
                System.out.printf("%sKO了%s,%s获胜!", fighter2.getName(), fighter1.getName(), fighter2.getName());
                break;

            }
            rount++;
        }

    }
}


