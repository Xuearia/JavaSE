package T03作业;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // 创建Scanner对象以从控制台读取输入
        Scanner sc = new Scanner(System.in);

        // 提示用户输入顾客类别（0表示普通顾客，1表示会员）
        System.out.println("请问是否是会员0(否)/1(是) :");
        int classification = sc.nextInt();

        // 检查输入的顾客类别是否有效（只能是0或1）
        if (classification != 0 && classification != 1) {
            System.out.println("输入错误!");
            return; // 如果输入无效，结束程序
        }

        // 提示用户输入购物金额
        System.out.println("您的购物金额是:");
        double money = sc.nextDouble();

        double sum = 0; // 初始化应付金额为0

        // 根据顾客类别和购物金额计算应付金额
        if (classification == 0) { // 普通顾客
            if (money >= 100) {
                sum = money * 0.9; // 满100元打9折
            } else {
                sum = money; // 不满100元不打折
            }
        } else if (classification == 1) { // 会员
            if (money >= 200) {
                sum = money * 0.75; // 满200元打7.5折
            } else {
                sum = money * 0.8; // 不满200元打8折
            }
        }

        // 输出应付金额，保留两位小数
        System.out.printf("您应付的金额为: %.2f\n", sum);
    }
}
