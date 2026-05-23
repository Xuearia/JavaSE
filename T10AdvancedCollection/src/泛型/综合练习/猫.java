package 泛型.综合练习;
//波斯猫方法体打印:一只叫做XXX的，X岁的波斯猫，正在吃小饼干
// 狸花猫方法体打印:一只叫做XXX的，X岁的狸花猫，正在吃鱼
public abstract class 猫 extends 动物 {
    public 猫() {
    }

    public 猫(String name, Integer age) {
        super(name, age);
    }
}

class 波斯猫 extends 猫{
    public 波斯猫(String 笨比, int i) {
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "，" + getAge() + "岁的波斯猫，正在吃小饼干");
    }
}
class 狸花猫 extends 猫{
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "，" + getAge() + "岁的狸花猫，正在吃鱼");
    }
}
