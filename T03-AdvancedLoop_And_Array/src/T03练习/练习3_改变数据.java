package T03练习;

public class 练习3_改变数据 {
    public static void main(String[] args) {
        /*需求：
        定义一个数组，存储1,2,3,4,5,6,7,8,9,10
        遍历数组得到每一个元素。

        要求：
        1，如果是奇数，则将当前数字扩大两倍
        2，如果是偶数，则将当前数字变成二分之一*/

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                num[i] /= 2;
                System.out.print("偶数 ");
            } else {
                num[i] *= 2;
                System.out.print("奇数 ");
            }
            System.out.print(num[i] + " ");
        }
    }
}
