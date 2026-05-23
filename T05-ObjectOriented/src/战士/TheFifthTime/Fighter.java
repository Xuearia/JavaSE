package 战士.TheFifthTime;

import java.util.Random;

public class Fighter {
    private String name;
    private int health;
    private String gender;
    private String appearance;

    // 男生长相数组
    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    // 女生长相数组
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};
    // 武功招式描述数组
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };
    // 受伤描述数组
    String[] injureds_desc = {
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Fighter() {
    }

    public Fighter(String name, int health, String gender) {
        this.name = name;
        this.health = health;
        this.gender = gender;

        Random random = new Random();
        if ("男".equals(gender)) {
            int index = random.nextInt(boyfaces.length);
            this.appearance = boyfaces[index];
        } else if ("女".equals(gender)) {
            int index = random.nextInt(girlfaces.length);
            this.appearance = girlfaces[index];
        } else {
            this.appearance = "面目狰狞";
        }
    }

    public void attack(Fighter opponent) {
        Random random = new Random();
        //随机伤害
        int damage = random.nextInt(10) + 1;
        //攻击后剩余血量
        opponent.setHealth(opponent.getHealth() - damage);
        if (opponent.getHealth() <= 0) {
            opponent.setHealth(0);
        }

        //随机攻击招式
        int index = random.nextInt(attacks_desc.length);
        String kungFu = attacks_desc[index];

        System.out.printf(kungFu, this.name, opponent.getName());
        System.out.printf("造成了%d点伤害",damage);
        System.out.println();

        //根据血量显示状态

        if (opponent.getHealth() >= 90) {
            System.out.printf(injureds_desc[0], opponent.getName());
        } else if (opponent.getHealth() >= 80) {
            System.out.printf(injureds_desc[1], opponent.getName());
        } else if (opponent.getHealth() >= 70) {
            System.out.printf(injureds_desc[2], opponent.getName());
        } else if (opponent.getHealth() >= 50) {
            System.out.printf(injureds_desc[3], opponent.getName());
        }else if (opponent.getHealth() >= 30) {
            System.out.printf(injureds_desc[4], opponent.getName());
        }else if (opponent.getHealth() >= 20) {
            System.out.printf(injureds_desc[5], opponent.getName());
        }else if (opponent.getHealth() > 0) {
            System.out.printf(injureds_desc[6], opponent.getName());
        }else{
            System.out.printf(injureds_desc[7], opponent.getName());

        }
        //换行
        System.out.println();
        System.out.printf("%s剩余血量:%d",opponent.getName(),opponent.health);
        System.out.println();

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

    public void show() {
        System.out.println("姓名:" + getName());
        System.out.println("血量:" + getHealth());
        System.out.println("性别:" + getGender());
        System.out.println("长相:" + getAppearance());
    }
}
