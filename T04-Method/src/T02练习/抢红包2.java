package T02练习;

import java.util.Random;

public class 抢红包2 {

        public static void main(String[] args) {
            // 假设奖金数组，这里简单用整数数组模拟
            int[] bonusArray = {100, 200, 300, 400, 500};
            shuffleArray(bonusArray);
            // 使用普通for循环遍历数组并输出元素
            for (int i = 0; i < bonusArray.length; i++) {
                System.out.print(bonusArray[i] + " ");
            }
        }

        public static void shuffleArray(int[] arr) {
            Random random = new Random();
            for (int i = 0; i < arr.length; i++) {
                // 生成一个随机索引，范围是当前索引到数组末尾
                int randomIndex = i + random.nextInt(arr.length - i);
                // 交换当前位置和随机索引位置的数据
                int temp = arr[i];
                arr[i] = arr[randomIndex];
                arr[randomIndex] = temp;
            }
        }
    }

