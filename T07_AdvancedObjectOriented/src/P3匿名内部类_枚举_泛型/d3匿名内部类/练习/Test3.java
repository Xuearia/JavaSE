package P3匿名内部类_枚举_泛型.d3匿名内部类.练习;

public class Test3 {
    public static void main(String[] args) {
        //目标:掌握匿名内部类的常见使用场景
 /*       show s1 = new show() {
            @Override
            public void swim() {
                System.out.println("狗刨的很快");
            }
        };
        go(s1);*/
        go(new show() {
            @Override
            public void swim() {
                System.out.println("狗刨的很快");
            }
        });
    }

    public static void go(show s) {
        System.out.println("开始--------------");
        s.swim();
    }
}


interface show {
    void swim();
}
