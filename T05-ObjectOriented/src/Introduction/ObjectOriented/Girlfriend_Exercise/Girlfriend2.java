package Introduction.ObjectOriented.Girlfriend_Exercise;
/*
这个类讲解了如果你用set方法来写有效性校验如何规范
1. 用set方法写有效性校验时，在有参构造方法里调用对应的set方法来设置属性值，
   这样可以复用set方法中的有效性校验逻辑，确保传入的参数符合要求。例如，在构造方法中调用setSex和setAge方法，
   对传入的性别和年龄参数进行校验和设置。
2. set方法中的有效性校验逻辑是独立且可复用的，当在其他地方（如对象创建后）需要修改属性值时，
   同样可以通过调用set方法来保证新设置的值是有效的。比如，当需要修改年龄时，调用setAge方法，
   该方法会检查传入的年龄是否在合理范围内（1到120之间），如果不符合要求会给出相应提示，
   符合要求则更新对象的年龄属性。
*/

public class Girlfriend2 {
    // 姓名属性
    private String name;
    // 性别属性
    private String sex;
    // 身高属性，单位为米
    private double height;
    // 体重属性，单位为千克
    private double weight;
    // 年龄属性
    private int age;

    /**
     * 默认构造方法
     */
    public Girlfriend2() {
    }

    /**
     * 有参构造方法，初始化女朋友对象，包含年龄参数
     *
     * @param name   女朋友的姓名
     * @param sex    女朋友的性别
     * @param height 女朋友的身高，单位为米
     * @param weight 女朋友的体重，单位为千克
     * @param age    女朋友的年龄
     */
    public Girlfriend2(String name, String sex, double height, double weight, int age) {
        this.name = name;
        setSex(sex);
        this.height = height;
        this.weight = weight;
        setAge(age);
    }

    // 获取姓名
    public String getName() {
        return name;
    }

    // 获取性别
    public String getSex() {
        return sex;
    }

    // 获取身高
    public double getHeight() {
        return height;
    }

    // 获取体重
    public double getWeight() {
        return weight;
    }

    // 获取年龄
    public int getAge() {
        return age;
    }

    // 设置性别，并进行有效性校验
    public void setSex(String sex) {
        if ("女".equals(sex)) {
            this.sex = sex;
        } else {
            System.out.println("性别只能是“女”");

        }
    }

    // 设置年龄，并进行有效性校验
    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄应在 1 到 120 之间");
        }
    }

    /**
     * 行为类: 洗衣服
     */
    public void wash() {
        System.out.println("女朋友在帮我洗衣服");
    }

    /**
     * 行为类: 做饭
     */
    public void cook() {
        System.out.println("女朋友在帮我做饭");
    }

    /**
     * 展示类: 展示四个属性
     */
    public void show() {
        System.out.printf("我女朋友性别%s,名字叫%s,身高%.1f厘米,体重%.1f斤,年龄%d岁\n", sex, name, height, weight, age);
    }

    public static void main(String[] args) {
        // 使用包含年龄参数的有参构造创建对象
        Girlfriend2 girlfriend = new Girlfriend2("小丽", "男", 1.60, 48.0, 999);
        girlfriend.show();
        girlfriend.wash();
        girlfriend.cook();
    }
}