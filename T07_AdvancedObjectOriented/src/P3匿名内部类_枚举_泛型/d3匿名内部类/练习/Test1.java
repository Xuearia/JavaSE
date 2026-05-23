package P3匿名内部类_枚举_泛型.d3匿名内部类.练习;

public class Test1 {
    public static void main(String[] args) {

        // 创建 cell 抽象类的匿名内部类实例
        call1 e = new call1("旺财") {
            @Override
            public void cry1() {
                System.out.println(name + "这只猫会喵喵叫");
            }
        };
        call1 f = new call1("团子") {
            @Override
            public void cry1() {
                System.out.println(name + "这只狗会汪汪叫");
            }
        };
        // 调用正确的方法
        e.cry1();
        f.cry1();
    }
}

//
abstract class call1 {
    String name;
    public call1(String name) {
        this.name = name;
    }

    public abstract void cry1();
}
