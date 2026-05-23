package P3匿名内部类_枚举_泛型.d1成员内部类;

public class Test {
    public static void main(String[] args) {
        //目标了解成员内部类的特点
        Outer.Inner in = new Outer().new Inner();
        in.test();
    }
}
