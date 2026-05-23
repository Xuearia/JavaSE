package T03练习;

import java.util.Random;
import java.util.Scanner;

public class 练习9_洗牌数组 {
    public static void main(String[] args) {
       /* 需求
        某公司开发部 5 名开发人员，要进行项目进展汇报演讲，现在采取随机排名后进行汇报。请先依次录入 5
        名员工的工号，然后展示出一组随机的排名顺序。
        */

        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"名员工:");
            int id = sc.nextInt();
            arr[i] = id;
        }
        //随机排名
        Random random = new Random(arr.length);
        for (int i = 0; i < arr.length; i++) {
            int index = random.nextInt(arr.length);
            int temp = arr[index];
            arr[index]= arr[i];
            arr[i]= temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }
}
