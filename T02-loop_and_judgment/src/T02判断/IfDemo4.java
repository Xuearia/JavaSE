package T02判断;

import java.util.Scanner;

public class IfDemo4 {
    public static void main(String[] args) {
        //95~100 自行车一辆
        //90~94   游乐场玩一天
        //80 ~ 89 变形金刚一个
        //80 以下  胖揍一顿

        //1.键盘录入一个值表示小明的分数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明的成绩");
        int score = sc.nextInt();
        //2.对分数的有效性进行判断
        if (score >= 0 && score <= 100) {
            //有效的分数
            //3.对小明的分数进行判断，不同情况执行不同的代码
            if (score >= 95 && score <= 100) {
                System.out.println("送自行车一辆");
            } else if (score >= 90 && score <= 94) {
                System.out.println("游乐场玩一天");
            } else if (score >= 80 && score <= 89) {
                System.out.println("变形金刚一个");
            } else {
                System.out.println("胖揍一顿");
            }
        } else {
            //无效的分数
            System.out.println("分数不合法");
        }
    }
}
