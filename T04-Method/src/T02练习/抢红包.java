package T02练习;

import java.util.Random;
import java.util.Scanner;

public class 抢红包 {
    public static void main(String[] args) {
        /*一个大 V 直播时发起了抢红包活动，分别有：9、666、188、520、9999 五个红包。请模拟粉丝来抽奖，按照先来先得，
         随机抽取，抽完即止，注意：一个红包只能被抽一次，先抽或后抽曲哪一个红包是随机的，示例如下 (不一定是下面的顺序):*/
        int[] arr = {9, 666, 188, 520, 9999};
        rob(arr);
    }

    public static void rob(int[] arr) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        for (int i = 1; i <= 5; i++) {
            System.out.println("请您输入任意内容抽奖");
            sc.next();
            while (true) {
                int index = random.nextInt(arr.length);
                int moneys = arr[index];

                if (moneys != 0) {
                    System.out.println("恭喜您,您抽中了:" + moneys);
                    arr[index] = 0;
                    break;
                }
            }

        }
        System.out.println("活动结束");
    }
}