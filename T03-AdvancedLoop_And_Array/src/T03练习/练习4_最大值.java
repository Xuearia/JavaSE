package T03练习;

public class 练习4_最大值 {
    public static void main(String[] args) {
        //需求：求数组中的最大值
        int[] num = {12, 22, 43, 666, 3, 8, 15, 99};

        //假设第一个元素为最大值，初始化最大值变量
        int max = num[0];
        //遍历数组，寻找最大值
        for (int i = 1; i < num.length; i++) {
            //如果当前元素大于已知最大值，则更新最大值
            if (num[i] > max) {
                max = num[i];
            }
        }
        //输出最大值
        System.out.println("最大值为:" + max);
    }
}
