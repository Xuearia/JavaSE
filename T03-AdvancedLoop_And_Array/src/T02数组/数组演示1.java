package T02数组;

public class 数组演示1 {
    public static void main(String[] args) {
        //数组的静态定义
        //格式一:数据类型 [] 数组名
        //范例 : int [] array

        //格式一:数据类型 数组名 []
        //范例 : int array []

        //定义数组存储5个学生的年龄。
        int[] age = {20, 18, 17, 22, 16, 18};

        //定义数组存储3个学生的姓名。
        String[] name = {"伍家伟", "陈正楷", "魏正瀚", "杨雨星"};

        //定义数组存储4个学生的身高。
        double[] height = {1.80, 1.7, 1.62, 1.83};
        //数组的遍历 可以输出数组中所有的元素
        for (int i = 0; i < height.length; i++) {
            System.out.println(height[i]);
            System.out.println(name[i]);
        }
    }
}
