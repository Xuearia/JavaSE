package P2多态抽象和接口.d5重写Override;

// 子类 Cat
class Cat extends Pet {
    // 请补充构造方法（调用父类构造器）
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }


    // 重写 speak() 方法（猫叫逻辑）
    @Override
    public void speak() {
        System.out.println("喵喵~");
    }

    // 重写 specialSkill() 方法（抓老鼠逻辑）
    @Override
    public void specialSkill() {
        System.out.println(name + " 正在抓老鼠");
    }
}
