package T04switch循环;

import java.util.Scanner;

public class SwitchDemo2 {
    public static void main(String[] args) {
        /*
         * 键盘输入:
         * 星期一 ~ 星期五 输出为"工作日"
         * 星期六 ~ 星期天 输出为"休息日"
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期一~星期日:");
        String week = sc.next();

        switch (week) {
            case "星期一":
            case "星期二":
            case "星期三":
            case "星期四":
            case "星期五":
                // 当输入为星期一到星期五时，输出"工作日"
                System.out.println("工作日");
                break;
            case "星期六":
            case "星期日":
                // 当输入为星期六到星期天时，输出"休息日"
                System.out.println("工作日");
                break;
            default:
                // 当输入不符合预期时，输出错误提示
                System.out.println("输入错误!");
                break;
        }
    }
}
