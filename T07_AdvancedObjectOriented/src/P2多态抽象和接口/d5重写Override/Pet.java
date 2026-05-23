package P2多态抽象和接口.d5重写Override;

// 抽象类 Pet
abstract class Pet {
    protected String name;
    protected int age;
    protected String color;

    public Pet(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // 抽象方法：发出声音
    public abstract void speak();

    // 抽象方法：特殊技能
    public abstract void specialSkill();

    // 非抽象方法：显示信息
    public void showInfo() {
        System.out.printf("姓名:%s,年龄:%d,颜色:%s\n", name, age, color);
    }
}

