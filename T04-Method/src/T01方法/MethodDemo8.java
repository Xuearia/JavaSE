/**
 * MethodDemo8 类演示了基本数据类型的传递及其不可变性。
 * 该类包含一个 main 方法和一个 change 方法，展示了在方法内部对参数的修改不会影响方法外部的原始变量值。
 */
package T01方法;

public class MethodDemo8 {
    /**
     * 程序的入口点。
     * @param args 命令行参数，在本例中未使用。
     */
    public static void main(String[] args) {
        // 初始化整数变量 number 并赋值为 100
        int number = 100;
        // 调用 change 方法前打印 number 的值
        System.out.println("调用number前:" + number);
        // 调用 change 方法并传入 number
        change(number);
        // 调用 change 方法后打印 number 的值
        System.out.println("调用number后:" + number);
    }

    /**
     * 尝试修改传入的整数参数。
     * @param number 传入的整数值。
     */
    public static void change(int number) {
        // 修改传入的参数值
        number = 200;
    }
}
