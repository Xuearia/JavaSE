package P2多态抽象和接口.d99练习.动物;

public class Frog extends Pets implements Swimming {
    public Frog() {
    }

    public Frog(int age) {
        super(age);
    }

    @Override
    public void dine() {
        System.out.println("青蛙在吃虫子");
    }

    @Override
    public void swimming() {
        System.out.println("蛙泳");
    }
}
