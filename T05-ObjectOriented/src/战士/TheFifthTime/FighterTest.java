package 战士.TheFifthTime;

public class FighterTest {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("乔峰",100,"男");
        Fighter fighter2 = new Fighter("鸠摩智",100,"女");
    fighter1.show();
    fighter2.show();
    while(true){
        fighter1.attack(fighter2);
        if (fighter2.getHealth()<=0){
            System.out.println(fighter1.getName()+"获胜");
            break;

        } fighter2.attack(fighter1);
        if (fighter1.getHealth()<=0){
            System.out.println(fighter2.getName()+"获胜");
            break;
        }
    }
    }
}
