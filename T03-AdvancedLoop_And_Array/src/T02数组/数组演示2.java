package T02数组;

public class 数组演示2 {
    public static void main(String[] args) {
        /*

        数组中元素访问的格式：
                数组名[索引];

         作用：
            1.获取指定索引上对应的元素
            2.修改指定索引上对应的元素
    */
        int[] arr = {1, 2, 3, 4, 5};
        //需求1：获取arr数组中，3索引上的值
        int number = arr[3];
        System.out.println(number);
        System.out.println(arr[3]);

        //需求2：将arr数组中，3索引上的值修改为10
        arr[3] = 10;
        System.out.println("修改之后为:" + arr[3]);

    }
}

