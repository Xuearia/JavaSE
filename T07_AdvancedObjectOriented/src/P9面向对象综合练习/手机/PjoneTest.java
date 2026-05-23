package P9面向对象综合练习.手机;

public class PjoneTest {
    public static void main(String[] args) {
        Phone2 p2 = new Phone2();
        Phone3 p3= new Phone3();

        usePhone(p2);
        usePhone(p3);
    }
    public static void usePhone(Phone p) {
        // 父类中定义的方法，无论是手机2还是手机3都可以直接调用
        p.call();
        p.sendMessage();

        // 使用 instanceof 判断传入的手机对象是否实现了 IPlay 接口
        if (p instanceof IPlay) {
            // 如果实现了，就向下转型为 IPlay 接口类型，调用玩游戏的方法
            IPlay pp = (IPlay) p;
            pp.play();
        }
    }
}