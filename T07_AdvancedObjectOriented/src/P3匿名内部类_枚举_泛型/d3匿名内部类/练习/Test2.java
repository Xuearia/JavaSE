package P3匿名内部类_枚举_泛型.d3匿名内部类.练习;

public class Test2 {
    //掌握匿名内部类
    public static void main(String[] args) {
//        call c = new cat();
//        c.cry();

        call c = new call() {
            @Override
            public void cry() {
                System.out.println("猫会喵喵叫~~");
            }
        };
        c.cry();
    }
}


//class cat extends call {
//    public void cry() {
//        System.out.println("猫会喵喵叫~~");
//
//    }
//}

//叫声抽象类
abstract class call {
    public abstract void cry();

}
