package T03作业;

public class 测试5 {
    public static void main(String[] args) {
        //使用数组copyOfRange方法，将数组numbers中的前第4-10个元素拷贝到新数组中，并输出新数组。
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] arr1 = copyOfRange(numbers, 3, 7);
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newarr = new int[to - from];

        for (int i = from; i < to; i++) {
            newarr[i - from] = arr[i];
            System.out.println(newarr[i - from]);
        }
        return newarr;
    }
}
