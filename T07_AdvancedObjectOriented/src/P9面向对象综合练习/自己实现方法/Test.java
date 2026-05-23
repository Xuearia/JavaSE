package P9面向对象综合练习.自己实现方法;
//	在测试类Test中创建A的对象a并调用成员方法methodA(),要求用两种方式实现
public class Test {
    public static void main(String[] args) {
        A a = new A();
        // 方式1：使用匿名内部类
  /*      InterA a = new InterA() {
            @Override
            public void showA() {
                System.out.println("已经实现");
            }
        };*/

        // 方式2：使用原始类实现
        class Impl implements InterA{
            @Override
            public void showA(){
                System.out.println("已经实现");
            }
        }

        // 创建实现类的对象，并将其作为参数传给 methodA
        InterA implObj = new Impl();
        a.methodA(implObj);
    }
}

//定义接口
interface InterA {
    void showA();
}

class A {
    public void methodA(InterA a) {
        a.showA();
    }
}