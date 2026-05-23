package P2多态抽象和接口.d7接口Interface;

//一旦实现B,C就必须重写玩接口里所有的抽象方法,或者自己也是个抽象类
// Class 类实现接口 B 和 C
class Class implements B, C {
    @Override
    public void testb1() {
        System.out.println("执行 testb1 方法");
    }

    @Override
    public void testb2() {
        System.out.println("执行 testb2 方法");
    }

    @Override
    public void testc1() {
        System.out.println("执行 testc1 方法");
    }

    @Override
    public void testc2() {
        System.out.println("执行 testc2 方法");
    }
}