package P2多态抽象和接口.d99练习.动物;

public class Dog extends Pets implements Swimming {

    public Dog() {
    }

    public Dog(int age) {
        super(age);
    }

    @Override
    public void dine() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void swimming() {
        System.out.println("狗刨式游泳");
    }
}
