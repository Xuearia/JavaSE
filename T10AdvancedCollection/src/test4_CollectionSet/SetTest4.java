package test4_CollectionSet;


import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
/**
 * 本类演示了 Java 中 TreeSet 集合的使用方式，主要功能包括：
 * 1. 使用 TreeSet 对基本类型封装类（如 Integer）进行自动排序和去重；
 * 2. 使用自定义比较器（Comparator）对自定义对象（如 Student）按照指定属性（如 height）排序；
 * 3. 展示了 Lambda 表达式简化匿名内部类写法的应用；
 * 4. 最后一行注释提示需要完成一个按年龄升序排列数组元素的任务。
 *
 * 类的作用：
 * - 掌握 TreeSet 的基本用法；
 * - 学习如何通过 Comparator 接口自定义排序规则；
 * - 理解集合与对象排序之间的关系；
 * - 练习 Lambda 表达式的应用；
 */
//掌握treeSet集合的使用
public class SetTest4 {
    public static void main(String[] args) {

        // ================== TreeSet 示例 ==================
        Set<Integer> set2 = new TreeSet<>();

        // 添加多个元素，包含重复值 666
        set2.add(6);
        set2.add(7);
        set2.add(7);
        set2.add(9);
        set2.add(1);
        set2.add(5);
        set2.add(6);

        // 输出结果验证：升序排序且去重
        System.out.println(set2 + " —— TreeSet：可排序");

        // ================== TreeSet添加对象 示例 ==================

//        Set<Student> students = new TreeSet<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //按照身高
//                return Double.compare(o1.getHeight(), o2.getHeight());
//            }
//        });
        Set<Student> students = new TreeSet<>((Student o1, Student o2) -> Double.compare(o1.getHeight(), o2.getHeight()));

        //Set<Student> students = new TreeSet<>(Comparator.comparingDouble(Student::getHeight));//升序
        //Set<Student> students = new TreeSet<>(Comparator.comparingDouble(Student::getHeight).reversed());//降序


        Student s1 = new Student("喜羊羊", 45, 150.5);
        Student s2 = new Student("美羊羊", 88, 148.0);
        Student s3 = new Student("暖羊羊", 18, 148.6);
        Student s4 = new Student("灰太狼", 35, 170.0);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        for (Student student : students) {
            System.out.println(student);
        }

        //3.对数组中的元素按照年龄升序排列: 先用匿名内部类写法


    }
}
