package P1静态与继承.d8宠物;

/**
 * 宠物类作为父类，包含了猫和狗共有的属性和方法。
 */
public class Pet {
    // 宠物的姓名，使用 protected 修饰，只允许子类直接访问
    protected String name;
    // 宠物的年龄
    protected int age;
    // 宠物的颜色
    protected String color;

    /**
     * 构造方法，用于初始化宠物的基本信息。
     * @param name 宠物的姓名
     * @param age 宠物的年龄
     * @param color 宠物的颜色
     */
    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * 获取宠物的姓名。
     * @return 宠物的姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 获取宠物的年龄。
     * @return 宠物的年龄
     */
    public int getAge() {
        return age;
    }

    /**
     * 获取宠物的颜色。
     * @return 宠物的颜色
     */
    public String getColor() {
        return color;
    }

    /**
     * 宠物发出声音的方法，会被子类重写。
     */
    public void speak() {
        System.out.println("宠物发出声音");
    }

    /**
     * 宠物吃饭的方法。
     */
    public void eat() {
        System.out.println(name + " 正在吃饭");
    }
}    