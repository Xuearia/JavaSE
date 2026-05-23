package Homework.FightingGame;

public class Test {
    public static void main(String[] args) {
        Fight p1 = new Fight("楷楷", 120);
        Fight p2 = new Fight("小涵", 100);

        while (true) {
            p1.grapple(p2);
            if (p2.getHP() == 0) {
                System.out.println(p1.getName() + "KO了" + p2.getName());
                break;
            }


            p2.grapple(p1);
            if (p1.getHP() == 0) {
                System.out.println(p2.getName() + "KO了" + p1.getName());
                break;
            }
        }
    }
}

