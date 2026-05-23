package P1静态与继承.d8宠物;

/**
 * 猫类继承自 Pet 类，除了继承的属性和方法外，还新增了抓老鼠的功能。
 */
public class Cat extends Pet {
    /**
     * 构造方法，调用父类的构造方法来初始化猫的基本信息。
     * @param name 猫的姓名
     * @param age 猫的年龄
     * @param color 猫的颜色
     */
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    /**
     * 重写父类的 speak 方法，输出猫叫的信息。
     */
    @Override
    public void speak() {
        System.out.println("喵~ 我是 " + color + " 的 " + name + "，今年 " + age + " 岁");
    }

    /**
     * 猫特有的抓老鼠方法。
     */
    public void catchMouse() {
        System.out.println(name + " 正在抓老鼠");
    }
}    