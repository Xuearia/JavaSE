package 泛型.综合练习;
//使用泛型
//一只叫做XXX的，X岁的泰迪，正在吃骨头，边吃边蹭
//一只叫做XXX的，X岁的哈士奇，正在吃骨头，边吃边拆家
import java.util.ArrayList;

public abstract class 狗 extends 动物 {
    public 狗() {
    }

    public 狗(String name, Integer age) {
        super(name, age);
    }

}
class 泰迪 extends 狗 {
    public 泰迪(String teddy, int i) {
    }

    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的泰迪，正在吃骨头，边吃边蹭");
    }
 }
 class 哈士奇 extends 狗 {
    @Override
    public void eat() {
        System.out.println("一只叫做" + getName() + "的，" + getAge() + "岁的哈士奇，正在吃骨头，边吃边拆家");
    }
 }
