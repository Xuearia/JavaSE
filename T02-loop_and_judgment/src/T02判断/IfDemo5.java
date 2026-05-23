package T02判断;

import java.util.Scanner;

public class IfDemo5 {
    public static void main(String[] args) {
        //判断回文数 //用户输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个五位数来判断是否为回文数");
        int input = sc.nextInt();
        //拆分数值
        int ge = input % 10;
        int shi = input / 10 % 10;
        int bai = input / 100 % 10;
        int qian = input / 1000 % 10;
        int wan = input / 10000 % 10;
        //判断
        int results = ge * 10000 + shi * 1000 + bai * 100 + qian * 10 + wan;

        if (input == results) {
            //输出结果
            System.out.println("是回文数");
        } else {
            System.out.println("不是回文数");
        }
    }
}