package T01高级循环;

import java.util.Scanner;

public class 跳过循环演示4 {

    public static void main(String[] args) {

        // 键盘录入一个正整数 x ，判断该整数是否为一个质数
        //质数：
        //如果一个整数只能被1和本身整除，那么这个数就是质数。否则这个数叫做合数
        //7 = 1 * 7 质数
        //8 = 1 * 8  2 * 4 合数

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        // 初始化标志变量 primeNumber 为 true，用于标记 x 是否为质数
        boolean primeNumber = true;
        // 从 2 开始到 x-1，检查是否有能整除 x 的数
        for (int i = 2; i < x; i++) {
            // 如果找到能整除 x 的数，则 x 不是质数，设置 primeNumber 为 false 并跳出循环
            if (x % i == 0) {
                primeNumber = false;
                break;
            }
        }
        // 根据 primeNumber 的值判断并输出 x 是否为质数
        if (primeNumber) {
            System.out.println(x + "是质数");
        } else {
            System.out.println(x + "不是质数");
        }
    }
}
