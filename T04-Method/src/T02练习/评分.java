package T02练习;

import java.util.Scanner;

public class 评分 {
    public static void main(String[] args) {
        /*需求
        在唱歌比赛中，可能有多名评委要给选手打分，分数是 [0-100] 之间的整数。选手最后得分为：去掉
        最高分、最低分后剩余分数的平均分，请编写程序能够录入多名评委的分数，并算出选手的最终得分*/
        System.out.println("选手的最终分数为: " + score());
    }

    public static double score() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入有几位评委:");
        // 输入有几位评委
        int Quantity = scanner.nextInt();

        // 检查评委数量是否至少为3
        if (Quantity < 3) {
            System.out.println("不合法，至少要有3名评委");
            return 0; // 返回0或其他合理的值
        }

        // 动态初始化数组
        int[] arr = new int[Quantity];

        // 遍历数组将分数存入数组
        for (int i = 0; i < arr.length; i++) {
            while (true) {
                System.out.println("第" + (i + 1) + "位评委打分:");
                // 评委打分
                int grade = scanner.nextInt();
                // 检查分数是否在 [0, 100] 范围内
                if (grade >= 0 && grade <= 100) {
                    arr[i] = grade;
                    break;
                } else {
                    System.out.println("分数不合法，请输入0到100之间的整数:");
                }
            }
        }

        // 最大值
        int max = arr[0];
        // 最小值
        int min = arr[0];
        // 和
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i] > max ? arr[i] : max;
            min = arr[i] < min ? arr[i] : min;
            sum += arr[i];
        }

        // 平均分
        double avg = (double) (sum - (max + min)) / (arr.length - 2);

        return avg;
    }
}
