package 战士.thirdExercise;


public class RoleTest {
    public static void main(String[] args) {
        Role r1 = new Role("楷楷", 100, "男");
        r1.showrole();


        Role r2 = new Role("小涵", 100, "男");
        r2.showrole();


        while (true) {
            r1.attack(r2);
            if (r2.getHp() <= 0) {
                System.out.println(r1.getName() + "获胜!");
                break;
            }
            r2.attack(r1);
            if (r1.getHp() <= 0) {
                System.out.println(r2.getName() + "获胜!");
                break;
            }
        }
    }
}