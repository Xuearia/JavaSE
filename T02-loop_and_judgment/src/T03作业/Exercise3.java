package T03作业;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入存入的金额(至少1000):");
        int money = sc.nextInt();
        System.out.println("请输入存入的年限(1/2/3/5):");
        int years = sc.nextInt();

        double totalAmount = 0;

        if (money >= 1000) {
            if (years == 1) {
                totalAmount = money + money * 0.0225 * 1;
            } else if (years == 2) {
                totalAmount = money + money * 0.027 * 2;
            } else if (years == 3) {
                totalAmount = money + money * 0.0325 * 3;
            } else if (years == 5) {
                totalAmount = money + money * 0.036 * 5;
            } else {
                System.out.println("输入错误! 存期分为一年、两年、三年、五年");
                return;
            }
        } else {
            System.out.println("请存入>=1000的金额!");
            return;
        }

        System.out.println("存入金额: " + money);
        System.out.println("存期: " + years + "年");
        System.out.println("到期后, 总金额为: " + totalAmount + "元");
    }
}
