package T03练习;

import java.util.Random;

public class 练习7_扰乱 {
    public static void main(String[] args) {
        //需求：定义一个数组，存入1~5。要求打乱数组中所有数据的顺序。
        //1.定义数组存储1~5
        int[] arr = {1, 2, 3, 4, 5};

        Random x = new Random();

        for (int i = 0; i < arr.length; i++) {
            int randomint = x.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[randomint];
            arr[randomint] = temp;

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}

