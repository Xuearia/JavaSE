package T03作业;

import java.util.Scanner;

public class 作业 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入起始整数 m:");
        int m = sc.nextInt();
        System.out.println("请输入结束整数 n:");
        int n = sc.nextInt();
        //计数累加
        int count = 0;//个数
        int sum = 0;//和

        for (int i = m; i <= n; i++) {
            if (num1(i)) {
                count++;//找到素数便加一
                sum += i;//累加素数的和
            }
        }

        System.out.println("素数的个数是: " + count);
        System.out.println("素数的和是: " + sum);
    }

    // 检查一个数是否为素数
    public static boolean num1(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
