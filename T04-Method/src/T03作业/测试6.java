package T03作业;
public class 测试6 {
    /**
     * 需求分析：
     * 1. 方法是否需要接收数据进行处理？需要接收一个int类型的数组，因此形参声明为 int[] arr。
     * 2. 方法是否需要返回数据？方法内部直接输出数组内容即可，无需返回，因此返回值类型声明为 void。
     * 内部逻辑：遍历数组，并按照指定格式输出其内容。
     */
    public static void main(String[] args) {
        // 定义一个int类型的数组
        int[] arr = {11, 22, 33, 44, 55};
        // 调用Array方法输出数组内容
        Array(arr);
    }

    public static void Array(int[] arr) {
        // 打印左中括号作为数组输出的开始
        System.out.print("[");
        // 遍历数组中的每个元素
        for (int i = 0; i < arr.length; i++) {
            // 打印当前数组元素
            System.out.print(arr[i]);

            // 如果当前元素不是最后一个元素，则打印逗号分隔符
            System.out.print(i != arr.length - 1 ? "," : "");
        }
        // 打印右中括号作为数组输出的结束
        System.out.print("]");
    }
}
