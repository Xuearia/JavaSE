package T03练习;

public class 练习2_计数 {
    public static void main(String[] args) {
/*        需求：定义一个数组，存储1,2,3,4,5,6,7,8,9,10

        遍历数组得到每一个元素，统计数组里面一共有多少个能被3整除的数字*/

        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("数组里面一共有  " + count + "  个能被3整除的数字");
    }
}
