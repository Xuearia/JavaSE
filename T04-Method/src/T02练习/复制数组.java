package T02练习;

public class 复制数组 {
    public static void main(String[] args) {
        /*需求
        请把一个整型数组，例如存了数据：11,22,33, 拷贝成一个一一模一样的新数组出来。*/
        int[] arr = {12, 22, 33};
        int[] arr2 = copy(arr);
        print(arr2);
    }

    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");


    }

    public static int[] copy(int[] arr) {
        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
