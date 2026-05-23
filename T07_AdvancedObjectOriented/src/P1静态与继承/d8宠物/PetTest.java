package P1静态与继承.d8宠物;

/**
 * 测试类，用于验证 Cat 和 Dog 类对象的属性和方法。
 */
public class PetTest {
    public static void main(String[] args) {
        // 创建猫对象并输出其信息
        Cat cat = new Cat("咪咪", 2, "白色");
        System.out.println("===== 猫的信息 =====");
        System.out.println("姓名：" + cat.getName());
        System.out.println("年龄：" + cat.getAge());
        System.out.println("颜色：" + cat.getColor());
        cat.speak();
        cat.eat();
        cat.catchMouse();

        // 创建狗对象并输出其信息
        Dog dog = new Dog("旺财", 3, "黄色");
        System.out.println("\n===== 狗的信息 =====");
        System.out.println("姓名：" + dog.getName());
        System.out.println("年龄：" + dog.getAge());
        System.out.println("颜色：" + dog.getColor());
        dog.speak();
        dog.eat();
        dog.guardHouse();
    }
}    