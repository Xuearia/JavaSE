package 战士.thirdExercise;

import java.util.Random;

public class Role {
    private String name;//姓名
    private int hp;//血量
    private String sex;//性别
    private String face;//面貌

    String[] boyfaces = {"风流俊雅", "气宇轩昂", "相貌英俊", "五官端正", "相貌平平", "一塌糊涂", "面目狰狞"};
    String[] girlfaces = {"美奂绝伦", "沉鱼落雁", "婷婷玉立", "身材娇好", "相貌平平", "相貌简陋", "惨不忍睹"};

    //attack 攻击描述：
    String[] attacks_desc = {
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
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


    public Role() {
    }

    public Role(String name, int hp, String sex) {
        this.name = name;
        this.hp = hp;
        this.sex = sex;
        setFace(sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getFace() {
        return face;
    }

    //根据性别随机面貌
    public void setFace(String sex) {
        Random random = new Random();
        if ("男".equals(sex)) {
            int indom = random.nextInt(boyfaces.length);
            this.face = boyfaces[indom];
        } else if ("女".equals(sex)) {
            int indom = random.nextInt(boyfaces.length);
            this.face = girlfaces[indom];
        } else {
            this.face = "面目狰狞";
        }
    }

    //攻击
    public void attack(Role opponent) {
        Random random = new Random();
        //随机数组索引
        int index = random.nextInt(attacks_desc.length);
        String kungFu = attacks_desc[index];

        //生成随机攻击伤害
        int damage = random.nextInt(10) + 1;
        //攻击后的血量
        int Blood = opponent.getHp() - damage;
        if (Blood <= 0) {
            opponent.setHp(0);
            Blood = 0;
        }
        //更新血量
        opponent.setHp(Blood);

        System.out.printf(kungFu, this.name, opponent.getName());
        System.out.println();
        System.out.printf("对%s造成了%d点伤害,还剩%d点血\n", opponent.getName(), damage, opponent.hp);
        if (Blood == 0) {
            System.out.printf(injureds_desc[7],opponent.getName());
        } else if (Blood <= 20) {
            System.out.printf(injureds_desc[6],opponent.getName());
        } else if (Blood <= 40) {
            System.out.printf(injureds_desc[5],opponent.getName());
        } else if (Blood <= 60) {
            System.out.printf(injureds_desc[4],opponent.getName());
        } else if (Blood <= 70) {
            System.out.printf(injureds_desc[3],opponent.getName());
        } else if (Blood <= 80) {
            System.out.printf(injureds_desc[2],opponent.getName());
        } else if (Blood <= 90) {
            System.out.printf(injureds_desc[1],opponent.getName());
        } else {
            System.out.printf(injureds_desc[0],opponent.getName());
        }
        System.out.println();
    }

    public void showrole() {
        System.out.println("姓名为:" + getName());
        System.out.println("血量为:" + getHp());
        System.out.println("性别为:" + getSex());
        System.out.println("长相为:" + getFace());
        System.out.println();
    }
}

