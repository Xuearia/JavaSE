package T03作业;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
//        需求：给你一个整数 x 。
//
//        如果 x 是一个回文整数，打印 true ，否则，返回 false 。
//
//        解释：回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

//        例如，121 是回文，而 123 不是。

        // 判断回文数
        // 用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数来判断是否为回文数:");
        int input = sc.nextInt(); // 获取用户输入的整数

        // 初始化变量
        int num = 0; // 用于存储倒序拼接后的数字
        int results = input; // 保存原始输入的数字，用于后续比较

        // 使用 while 循环将输入的数字倒序拼接
        while (input != 0) {
            int ge = input % 10; // 获取当前数字的最后一位
            input = input / 10; // 去掉当前数字的最后一位
            num = num * 10 + ge; // 将最后一位添加到倒序拼接的数字中
        }

        // 判断倒序拼接后的数字是否与原始数字相同
        if (num == results) {
            // 输出结果
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}
