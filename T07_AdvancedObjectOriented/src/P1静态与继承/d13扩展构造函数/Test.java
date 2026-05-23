package P1静态与继承.d13扩展构造函数;

public class Test {
    public static void main(String[] args) {
        // 目标：掌握子类中访问其他成员的特点：就近原则。
        Z z = new Z();
        z.showName();
        z.showMethod();
    }
}
