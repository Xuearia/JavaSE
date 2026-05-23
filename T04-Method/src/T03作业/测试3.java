package T03作业;

import java.util.Scanner;

public class 测试3 {
    public static void main(String[] args) {
        // 定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个数: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("请输入第二个数: ");
        double secondNumber = scanner.nextDouble();

        System.out.println("较小的数是: " + getMin(firstNumber, secondNumber));
    }

    public static double getMin(double num1, double num2) {
        double min = 0;
        if (num1 > num2) {
            min = num2;
        } else {
            min = num1;
        }
        return min;
    }
}
