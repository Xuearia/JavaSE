package P1静态与继承.d14练习.动物;

public class Pet {
    protected String name;
    protected String Color;
    protected double price;

    public Pet() {
    }

    public Pet(String name, String color, double price) {
        this.name = name;
        Color = color;
        this.price = price;
    }

    public void eat() {
        System.out.println("在吃饭");
    }

    public void work() {
        System.out.println("正在工作");
    }
}
