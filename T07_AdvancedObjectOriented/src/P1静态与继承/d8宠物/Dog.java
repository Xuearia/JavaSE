package P1静态与继承.d8宠物;

/**
 * 狗类继承自 Pet 类，除了继承的属性和方法外，还新增了看家的功能。
 */
public class Dog extends Pet {
    /**
     * 构造方法，调用父类的构造方法来初始化狗的基本信息。
     * @param name 狗的姓名
     * @param age 狗的年龄
     * @param color 狗的颜色
     */
    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    /**
     * 重写父类的 speak 方法，输出狗叫的信息。
     */
    @Override
    public void speak() {
        System.out.println("汪！我是 " + color + " 的 " + name + "，今年 " + age + " 岁");
    }

    /**
     * 狗特有的看家方法。
     */
    public void guardHouse() {
        System.out.println(name + " 正在看家");
    }
}    