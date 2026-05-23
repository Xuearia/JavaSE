package T03作业;

import java.util.Random;

public class 练习6 {
    public static void main(String[] args) {
        // 定义一个示例数组
        int[] array = {10, 20, 30, 40, 50};

        // 创建 Random 对象
        Random random = new Random();

        // 获取数组的长度
        int length = array.length;

        // 生成一个随机索引
        int randomIndex = random.nextInt(length);

        // 打印随机索引及其对应的数组元素
        System.out.println("随机索引: " + randomIndex);
        System.out.println("对应元素: " + array[randomIndex]);
    }
}
