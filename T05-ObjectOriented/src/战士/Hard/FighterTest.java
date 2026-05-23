package 战士.Hard;

class FighterTest {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter();
        Fighter fighter2 = new Fighter();
        fighter1.setName("乔峰");
        fighter1.setHealth(100);
        fighter1.setGender("男");
        fighter1.looks();
        fighter1.showRoleInfo() ;

        fighter2.setName("鸠摩智");
        fighter2.setHealth(100);
        fighter2.setGender("");
        fighter2.looks();

        fighter2.showRoleInfo() ;

        int count = 1;//回合数
        while (true) {
            System.out.println("第" + count + "回合");
            fighter1.attack(fighter2);
            if (fighter2.getHealth() <= 0) {
                System.out.printf("%sKO了%s,%s获胜\n", fighter1.getName(), fighter2.getName(), fighter1.getName());
                break;
            }
            fighter2.attack(fighter1);
            if (fighter1.getHealth() <= 0) {
                System.out.printf("%sKO了%s,%s获胜\n", fighter2.getName(), fighter1.getName(), fighter2.getName());
                break;
            }
            count++;
        }
    }
}
