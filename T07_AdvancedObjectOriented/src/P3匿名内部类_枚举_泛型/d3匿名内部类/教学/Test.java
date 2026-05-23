package P3匿名内部类_枚举_泛型.d3匿名内部类.教学;

import P3匿名内部类_枚举_泛型.d2静态内部类.test;

public class Test {
    public static void main(String[] args) {
        // 方式1：完整的匿名内部类
        Swim s1 = new Swim() {
            @Override
            public void swim() {
                System.out.println("游泳健将正在游泳...");
            }
        };
        s1.swim();

        // 方式2：Lambda表达式（推荐）
        Swim s2 = () -> System.out.println("游泳高手正在游泳...");
        s2.swim();

        // 方式3：直接作为参数传递（最简洁）
        testSwim(() -> System.out.println("初学者正在学习游泳..."));

        test();
    }

    public static void testSwim(Swim swim) {
        swim.swim();
    }

    public static void test(){
        Running r =() ->System.out.println("运动健将在跑步");
        r.run();
    }

}
