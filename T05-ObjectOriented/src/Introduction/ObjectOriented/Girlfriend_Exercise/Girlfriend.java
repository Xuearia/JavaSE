package Introduction.ObjectOriented.Girlfriend_Exercise;

/**
 * 定义一个女朋友类。女朋友的属性包含：姓名，性别，身高，体重。行为包含：洗衣服wash()，做饭cook()。
 * 另外定义一个用于展示四个属性值的show()方法。请在测试类中通过有参构造方法创建对象并赋值，
 * 然后分别调用展示方法、洗衣服方法和做饭方法。打印效果如下：
 * -------------------------------------------------
 * 我女朋友叫凤姐,身高155.0厘米,体重130.0斤
 * 女朋友帮我洗衣服
 * 女朋友给我做饭
 * -------------------------------------------------
 */
public class Girlfriend {
    // 姓名属性
    private String name;

    // 性别属性
    private String sex;

    // 身高属性，单位为米
    private double height;

    // 体重属性，单位为千克
    private double weight;

    /**
     * 默认构造方法
     */
    public Girlfriend() {
    }

    /**
     * 有参构造方法，初始化女朋友对象
     *
     * @param name   女朋友的姓名
     * @param sex    女朋友的性别
     * @param height 女朋友的身高，单位为米
     * @param weight 女朋友的体重，单位为千克
     */
    public Girlfriend(String name, String sex, double height, double weight) {
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }

    //获取姓名
    public String getName() {
        return name;
    }

    //获取性别
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
        System.out.printf("我女朋友性别%s,名字叫%s,身高%.1f厘米,体重%.1f斤\n", sex, name, height, weight);
    }
}
