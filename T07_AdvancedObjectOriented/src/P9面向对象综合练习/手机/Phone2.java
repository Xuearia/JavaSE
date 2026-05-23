package P9面向对象综合练习.手机;

public class Phone2 extends Phone{
    @Override
    public void call() {
        System.out.println("手机2打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("手机2发短信");
    }
}
