package P9面向对象综合练习.手机;

public class Phone3 extends Phone implements IPlay{


    @Override
    public void call() {
        System.out.println("手机3打电话");
    }

    @Override
    public void sendMessage() {
        System.out.println("手机3发短信");
    }



    @Override
    public void play() {
        System.out.println("手机3打游戏");
    }
}
