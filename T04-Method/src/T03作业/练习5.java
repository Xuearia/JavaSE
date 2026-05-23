package T03作业;

import java.util.Scanner;

public class 练习5 {
    public static void main(String[] args) {
        // 键盘录入一个正整数
        //
        // 定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
        //
        // 在main方法中打印该数字是几位数
        System.out.println("请输入一个整数:");
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong(); // 修改为 nextLong() 以读取 long 类型的输入
        System.out.println(counts(num));
    }

    public static int counts(long num) {
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        return count;
    }
}
