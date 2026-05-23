package P2多态抽象和接口.d99练习.动物;

public abstract class Pets {
    public int age;

    public Pets() {
    }

    public Pets(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void drinkWater() {
        System.out.println("喝水");
    }

    //定义吃什么东西的抽象
    public abstract void dine();

}
