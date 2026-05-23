package P2多态抽象和接口.d9适配器设计模式;

public class InterImpl extends Implement{
    //需要用到哪个方法就重写哪个方法
    @Override
    public void m5() {
        System.out.println("只想用第五个方法");
    }
}
