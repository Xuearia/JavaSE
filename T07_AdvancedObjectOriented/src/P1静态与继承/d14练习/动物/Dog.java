package P1静态与继承.d14练习.动物;

public class Dog extends Pet {
    public Dog() {
    }

    public Dog(String name, String color, double price) {
        super(name, color, price);
    }

    @Override
    public void eat() {
        System.out.println(name+"正在吃饭");
    }

    @Override
    public void work(){
        System.out.println(name+"正在看家");
    }
}
