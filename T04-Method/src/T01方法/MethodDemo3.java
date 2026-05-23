package T01方法;

/**
 * MethodDemo3 类用于演示方法调用和参数传递
 */
public class MethodDemo3 {
    /**
     * 程序入口主方法
     *
     * @param args 命令行参数，未在此示例中使用
     */
    public static void main(String[] args) {
        //实参演示
        getsum(1, 2);
    }

    /**
     * 计算两个整数的和并打印结果
     * 此方法演示了如何定义一个简单的方法来执行特定的任务，在此案例中是计算两个整数的和
     *
     * @param num1 第一个加数
     * @param num2 第二个加数
     */
    public static void getsum(int num1, int num2) {
        int result = num1 + num2;
        System.out.println(result);
    }
}
