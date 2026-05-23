package P2多态抽象和接口.d5重写Override;

// 测试类
public class PetTest {
    public static void main(String[] args) {
        // 创建 Cat 对象并测试
        Pet cat = new Cat("咪咪", 2, "白色");
        cat.showInfo();
        cat.speak();
        cat.specialSkill();

        System.out.println("-----------");

        // 创建 Dog 对象并测试
        Pet dog = new Dog("旺财", 3, "黄色");
        dog.showInfo();
        dog.speak();
        dog.specialSkill();
    }
}
