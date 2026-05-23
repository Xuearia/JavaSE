package T03练习;

public class 练习1_求和 {
    public static void main(String[] args) {
        /*
         * 需求：定义一个数组，存储1,2,3,4,5
         * 遍历数组得到每一个元素，求数组里面所有的数据和
         */

        // 定义一个整型数组，并初始化为 {1, 2, 3, 4, 5}
        int value[] = {1, 2, 3, 4, 5};

        // 初始化一个变量 sum 为 0，用于存储数组元素的和
        int sum = 0;

        // 使用 for 循环遍历数组 value
        for (int i = 0; i < value.length; i++) {
            // 将当前元素 value[i] 累加到 sum 中
            sum += value[i];
        }

        // 输出 sum 的值，即数组所有元素的和
        System.out.println(sum);
        System.out.println(value[1]);
    }
}
