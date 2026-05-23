package P2多态抽象和接口.d7接口Interface;

public class Test {
    public static void main(String[] args) {
        System.out.println(A.NAME);

        // 接口不能用于创建对象
        // A a = new A();

        // 创建实现了接口 B 和 C 的 Class 类的对象
        Class c = new Class();
        c.testc1();
        c.testc2();
        c.testb1();
        c.testb2();
    }
}
