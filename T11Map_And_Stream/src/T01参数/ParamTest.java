package T01参数;

import java.util.Arrays;

/**
 * 测试方法，演示可变参数的使用。
 * <p>
 * 可变参数在调用时可以传入零个或多个值，方法内部将其当作数组处理。
 *
 * @create 2020-05-05 14:04
 * //*  @param a可变参数列表，实际为 int[] 类型数组
 */
public class ParamTest {
    public static void main(String[] args) {
        test();//不传数据
        test(12);//可传一个数据
        test(1, 2, 3, 4);//可传多个数据
        test(new int[]{10, 20, 30, 40});//传输一个数组给可变参数

        test2(10, 20, 30, 40);//传入多个数据
    }

    //可变参数对外是多个参数, 对内实际上是个数组
    public static void test(int... a) {
        System.out.println(a.length);
        System.out.println(Arrays.toString(a));
        System.out.println("--------------------");
    }

    //传入多个数据
    //1.一个形参列表可以有多个形参，但只能有一个可变参数
    //2.可变参数必须放在形参列表的后面
    public static void test2(int a, int... b) {
        System.out.println(a);
        System.out.println(Arrays.toString(b));
        System.out.println("--------------------");
    }
}
