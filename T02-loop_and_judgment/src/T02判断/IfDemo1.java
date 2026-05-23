package T02判断;

import java.util.Scanner;

public class IfDemo1 {
    public static void main(String[] args) {
        //键盘录入体重,大于等于180斤,则输出“体重偏重”,否则没有任何回应。

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的体重:");
        int weight = sc.nextInt();

        if (weight >= 180) {

            System.out.println("体重偏重");
        }

    }
}
