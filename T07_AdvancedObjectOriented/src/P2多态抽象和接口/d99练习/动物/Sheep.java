package P2多态抽象和接口.d99练习.动物;

public class Sheep extends Pets{
    public Sheep() {
    }

    public Sheep(int age) {
        super(age);
    }

    @Override
    public void dine() {
        System.out.println("羊啃草");
    }
}
