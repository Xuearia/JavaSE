package P9面向对象综合练习.输出helloword;

interface Inter {
    void show();
}
class Outer {
    public static Inter method() {
// 使用 Lambda 表达式直接返回 Inter 接口的实现类对象
        return () -> System.out.println("HelloWorld");
    }
}
public class OuterDemo {
    public static void main(String[] args) {
        Outer.method().show();
    }
}