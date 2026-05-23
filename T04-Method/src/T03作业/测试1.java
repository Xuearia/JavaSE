package T03作业;

public class 测试1 {

    public static void main(String[] args) {
        // 需求: 设计一个方法用于遍历数组中的每个元素, 要求遍历结果输出为: [11,22,33,44,55]
        int[] numbers = {11, 22, 33, 44, 55};
        // 调用 lents 方法遍历并打印数组
        lents(numbers);
    }

    public static void lents(int[] arr) {
        // 打印数组的起始括号
        System.out.print("[");
        // 遍历数组中的每个元素
        for (int i = 0; i < arr.length; i++) {
            // 如果是最后一个元素，打印元素后不加逗号
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                // 否则打印元素后加逗号
                System.out.print(arr[i] + ",");
            }
        }
        // 打印数组的结束括号并换行
        System.out.println("]");
    }
}
