
package T01高级循环;

import java.util.Scanner;

public class 跳过循环演示3 {
    public static void main(String[] args) {
        // 键盘录入一个大于等于2的整数 x ，计算并返回 x 的 平方根 。结果只保留整数部分 ，小数部分将被舍去 。
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个大于等于2的整数: ");
        int number = sc.nextInt();

        if (number < 2) {
            System.out.println("输入的数字必须大于等于2");
            return;
        }

        int sqrt = (int) Math.sqrt(number);
        System.out.println(number + "的平方根是" + sqrt);
    }
}