package 战士.Hard;


import java.util.Random;

public class Fighter {

    private String name;// 姓名
    private int health;// 健康值
    private String gender;// 性别
    private String appearance;// 外貌

    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //attack 攻击描述：
    String[] attacks_desc = {"%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。", "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。", "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。", "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。", "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。", "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"};

    //injured 受伤描述：
    String[] injureds_desc = {"结果%s退了半步，毫发无损", "结果给%s造成一处瘀伤", "结果一击命中，%s痛得弯下腰", "结果%s痛苦地闷哼了一声，显然受了点内伤", "结果%s摇摇晃晃，一跤摔倒在地", "结果%s脸色一下变得惨白，连退了好几步", "结果『轰』的一声，%s口中鲜血狂喷而出", "结果%s一声惨叫，像滩软泥般塌了下去"};

    Random r = new Random();

    public Fighter() {
    }

    public Fighter(String name, int health, String gender, String appearance) {
        this.name = name;
        this.health = health;
        this.gender = gender;
        setAppearance(appearance);
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public void looks() {
        if ("男".equals(gender)) {
            //随机男生长相的索引
            int randomboyfaces = r.nextInt(boyfaces.length);
            this.appearance =  boyfaces[randomboyfaces];
        } else if ("女".equals(gender)) {
            //随机女生长相的索引
            int randomgirlfaces = r.nextInt(girlfaces.length);
            //获取女生长相元素
            this.appearance = girlfaces[randomgirlfaces];
        } else {
            this.appearance = "面目狰狞";
        }

    }

    public void attack(Fighter opponent) {
        //随机招式的索引
        int randomkungFu = r.nextInt(attacks_desc.length);
        //根据随机索引获取随机招式描述
        String kungFu = attacks_desc[randomkungFu];


        int damage = r.nextInt(10) + 1;
        opponent.setHealth(opponent.getHealth() - damage);
        if (opponent.getHealth() <= 0) {
            opponent.setHealth(0);
        }
        System.out.printf(kungFu, this.name, opponent.getName());
        System.out.printf("对%s造成了%d点伤害\n", opponent.getName(), damage);


        //受伤的描述
        //血量> 90 0索引的描述
        //80 ~  90  1索引的描述
        //70 ~  80  2索引的描述
        //60 ~  70  3索引的描述
        //40 ~  60  4索引的描述
        //20 ~  40  5索引的描述
        //10 ~  20  6索引的描述
        //小于10的   7索引的描述

        int opponentHealth = opponent.getHealth();
        if (opponentHealth > 90) {
            System.out.printf(injureds_desc[0], opponent.getName());
            System.out.printf(",还剩下%d点血\n", opponentHealth);

        } else if (opponentHealth > 80) {
            System.out.printf(injureds_desc[1], opponent.getName());
            System.out.printf(",还剩下%d点血\n", opponentHealth);

        } else if (opponentHealth > 70) {
            System.out.printf(injureds_desc[2], opponent.getName());
            System.out.printf(",还剩下%d点血\n", opponentHealth);

        } else if (opponentHealth > 60) {
            System.out.printf(injureds_desc[3], opponent.getName());
            System.out.printf(",还剩下%d点血\n", opponentHealth);

        } else if (opponentHealth > 40) {
            System.out.printf(injureds_desc[4], opponent.getName());
            System.out.printf(",还剩下%d点血\n", opponentHealth);

        } else if (opponentHealth > 20) {
            System.out.printf(injureds_desc[5], opponent.getName());
            System.out.printf(",还剩下%d点血\n", opponentHealth);

        } else if (opponentHealth > 10) {
            System.out.printf(injureds_desc[6], opponent.getName());
            System.out.printf(",还剩下%d点血\n", opponentHealth);

        } else {
            System.out.printf(injureds_desc[7], opponent.getName());
            System.out.printf(",还剩下%d点血\n", opponentHealth);

        }
        System.out.println();
    }

    public void showRoleInfo() {
        System.out.println("姓名为：" + getName());
        System.out.println("血量为：" + getHealth());
        System.out.println("性别为：" + getGender());
        System.out.println("长相为：" + getAppearance());
    }

}