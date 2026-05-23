package T03作业;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        // 键盘录入两个数字number1和number2表示一个范围，求这个范围之内的数字和。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个范围:");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个范围:");
        int num2 = sc.nextInt();

        // 初始化数字和为0
        int sum = 0;
        // 判断最小值和最大值
        int min = (num1 < num2) ? num1 : num2;
        int max = (num1 > num2) ? num1 : num2;
        // 计算范围内的数字和
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        // 输出范围内的数字之和
        System.out.println(min + "~" + max + "之间的数字之和为:" + sum);
    }
}
