/**
 * MethodDemo4 类展示了如何计算矩形的周长。
 */
package T01方法;

public class MethodDemo4 {
    /**
     * 程序的入口方法。
     * 调用 playGame 方法并传入两个参数。
     *
     */
    public static void main(String[] args) {
        double perimeter = playGame(5, 10);
        System.out.println("周长为:"+perimeter);
    }

    /**
     * 计算矩形的周长。
     * 此方法接收两个参数，分别代表矩形的长度和宽度，并计算其周长。
     *
     * @param longs 矩形的长度。
     * @param wide  矩形的宽度。
     */
    public static double playGame(double longs, double wide) {
        // 计算矩形的周长
        double circumference =   2*(longs * wide);
        // 输出周长
        return circumference;
    }
}
