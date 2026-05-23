package T03练习;

/**
 * Exercise6_Exchange 类用于演示如何通过交换数组中的元素来反转数组，并将反转后的结果存入新数组
 */
public class 练习6_交换 {
    /**
     * main 方法是程序的入口点
     * 它创建一个数组，然后按照相反的顺序交换数组中的元素，将交换后的结果存入新数组，并分别打印交换前和交换后的数组
     *
     * @param args 命令行参数，未使用
     */
    public static void main(String[] args) {
        /*需求：定义一个数组，存入1,2,3,4,5。按照要求交换索引对应的元素,并放入新数组里。

        交换前：1,2,3,4,5

        交换后：5,4,3,2,1*/

        // 初始化原数组，存入初始数据 1, 2, 3, 4, 5
        int[] arr = {1, 2, 3, 4, 5};
        // 创建一个与原数组长度相同的新数组，用于存储反转后的数组元素
        int[] newarr = new int[arr.length];

        // 通过首尾指针交换数组中的元素，直到所有元素都被交换，实现数组元素的反转
        // i 从数组的起始位置开始，j 从数组的末尾位置开始
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            // 交换元素，使用临时变量 temp 暂存 arr[j] 的值
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }

        // 将反转后的原数组元素赋值给新数组
        for (int i = 0; i < newarr.length; i++) {
            newarr[i] = arr[i];
        }

        // 打印交换前的数组
        System.out.print("交换前:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            // 在元素间添加逗号作为分隔符，最后一个元素后不加
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        // 换行，使输出格式更清晰
        System.out.println();
        // 打印交换后的数组
        System.out.print("交换后:");

        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]);
            // 在元素间添加逗号作为分隔符，最后一个元素后不加
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }

    }
}