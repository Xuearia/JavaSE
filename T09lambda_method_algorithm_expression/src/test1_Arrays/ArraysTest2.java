package test1_Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysTest2 {
    public static void main(String[] args) {
        Student[] studnets = new Student[4];

        studnets[0] = new Student("张三", 170.3, 18);
        studnets[1] = new Student("李四", 180.3, 19);
        studnets[2] = new Student("王五", 190.3, 20);
        studnets[3] = new Student("赵六", 200.3, 21);

        // 1、public static void sort(类型[] arr)：对数组进行排序。
//        Arrays.sort(studnets);
//        System.out.println(Arrays.toString(studnets));

        // 2、public static <T> void sort(T[] arr, Comparator<? super T> c)
        // 参数一：需要排序的数组
        // 参数二：Comparator比较器对象（用来制定对象的比较规则）
        Arrays.sort(studnets, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 制定比较规则了：左边对象 o1   右边对象 o2
                // 约定1：认为左边对象 大于 右边对象 请您返回正整数
                // 约定2：认为左边对象 小于 右边对象 请您返回负整数
                // 约定3：认为左边对象 等于 右边对象 请您一定返回0
                //比较身高double类型老老实实写if
                //不可以return o1.studen - o2.studen 因为o1.studen - o2.studen是int类型，不能直接return
//                if (o1.getHeight() > o2.getHeight()) {
//                    return 1;
//                } else if (o1.getHeight() < o2.getHeight()) {
//                    return -1;
//                }
//                return 0;
                //简写
                return Double.compare(o1.getHeight(), o2.getHeight());//升序
                //return Double.compare(o2.getHeight(), o1.getHeight());//降序
            }
        });
        System.out.println(Arrays.toString(studnets));
    }
}
