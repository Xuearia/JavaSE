package test5_系统;

public class System_Demo {
    public static void main(String[] args) {


        //目标：了解下 System 类的常见方法。
        //exit (int status):
        // 1、public static void exit(int status)

        //System.exit(0);//人为终止虚拟机(不要使用)

        //终止当前运行的 Java 虚拟机。
        //该参数用作状态代码；按照惯例，非零状态代码表示异常终止。
        //// 2、public static long currentTimeMillis (): 获
        //取当前系统的时间
        //返回的是 Long 类型的时间毫秒值：指的是从 1970-1-1 0:0:0:0 开始走到此刻的总的毫秒值，1s=1000ms

        long time = System.currentTimeMillis();
        System.out.println(time);

        for (int i = 0; i <= 1000000; i++) {
            System.out.println(i);
        }

        //用time2 - time就是程序运行所花的时间
        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time) / 1000 + "s");//1000ms = 1s

    }
}
