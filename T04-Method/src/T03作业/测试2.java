package T03作业;

public class 测试2 {

    public static void main(String[] args) {
        // 初始化一个整数数组
        int[] numbers = {12, 1, 55, 22, 21, 88, 123, 55, 876, 321};
        // 调用arrmax方法获取数组最大值并打印
        System.out.println(arrmax(numbers));
    }

    /**
     * 寻找数组中的最大值
     *
     * @param arr 输入的整数数组
     * @return 数组中的最大值
     */
    public static int arrmax(int[] arr) {
        // 假设数组的第一个元素为最大值
        int max = arr[0];
        // 遍历数组，比较找出最大值
        for (int i = 1; i < arr.length; i++) {
            // 如果当前元素大于max，则更新max
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        // 返回最大值
        return max;
    }
}
