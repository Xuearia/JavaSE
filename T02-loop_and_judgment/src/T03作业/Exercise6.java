package T03作业;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        // 使用键盘录入三个整数，其中前两个整数参与运算，第三个整数决定运算类型
        Scanner sc = new Scanner(System.in);
        // 提示用户输入第一个整数
        System.out.println("请输入第一个整数:");
        int num1 = sc.nextInt();
        // 提示用户输入第二个整数
        System.out.println("请输入第二个整数:");
        int num2 = sc.nextInt();
        // 提示用户选择运算类型
        System.out.println("请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法):");
        int arithmetic = sc.nextInt();
        // 初始化结果变量
        int sum = 0;
        // 根据用户选择的运算类型执行相应的运算
        switch (arithmetic) {
            case 1:
                // 执行加法运算并输出结果
                sum = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + sum);
                break;
            case 2:
                // 执行减法运算并输出结果
                sum = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + sum);
                break;
            case 3:
                // 执行乘法运算并输出结果
                sum = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + sum);
                break;
            case 4:
                // 执行除法运算并输出结果
                sum = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + sum);
                break;
            default:
                // 当输入的运算类型不正确时，输出错误提示信息
                System.out.println("输入错误!");
                break;
        }
    }
}
