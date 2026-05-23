package T03练习;

public class 测试5 {
    public static void main(String[] args) {
        /*
        * 需求:
	请使用静态初始化的方式,创建一个长度为5的整数数组,并为数组中的元素赋值,
	遍历数组,在同一行打印所有元素,元素之间用","隔开,
	比如1:如果数组为{1,2,3,4,5}打印结果:1 2 3 4 5
    比如2:如果数组为{1,2,3,4,5}打印结果:[1, 2, 3, 4, 5]*/
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            int leng = arr[i];
            System.out.print(leng);
            if (i != arr.length - 1) {
                System.out.print(",");
            }
        }
    }
}
