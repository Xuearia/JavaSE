package P1静态与继承.d14练习.动物;

public class PetTest {
    public static void main(String[] args) {
        Cat cat = new Cat("旺财","棕色",1000);
        Dog dog = new Dog("波斯猫","花色",1000);

        cat.eat();
        cat.work();
        dog.eat();
        dog.work();
    }
}
