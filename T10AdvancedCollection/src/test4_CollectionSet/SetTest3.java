package test4_CollectionSet;


import java.util.HashSet;
import java.util.Set;

/**
 * SetTest3 类用于演示 Java 中 Set 集合（如 HashSet）如何存储自定义对象，
 * 并展示通过重写 hashCode() 和 equals() 方法实现对象去重的原理。
 *
 * 学习目标：
 * 1. 理解 Set 集合的特点：元素不可重复。
 * 2. 掌握 HashSet 判断元素重复的机制：依赖于 hashCode() 和 equals() 方法。
 * 3. 理解为什么需要同时重写 hashCode() 和 equals() 方法。
 * 4. 掌握如何使用 Objects.hash(...) 快速生成哈希值。
 * 5. 了解如何通过自定义逻辑判断两个对象是否“逻辑相等”。
 */

public class SetTest3 {
    public static void main(String[] args) {
        // 创建一个 Set 集合用于存储 Student 对象
        Set<Student> students = new HashSet<>();

        // 创建四个 Student 对象
        Student s1 = new Student("喜羊羊", 10, 150.5);
        Student s2 = new Student("美羊羊", 10, 148.0);
        // s3 与 s2 内容相同，用于测试 Set 集合去重特性
        Student s3 = new Student("美羊羊", 10, 148.0);
        Student s4 = new Student("灰太狼", 35, 170.0);

        // 将 Student 对象添加到 Set 集合中
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        // 打印每个 Student 对象的哈希值
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());

        // 提示：在没有重写 Student 类的 hashCode 和 equals 方法的情况下，
        // 即使 s2 和 s3 内容相同，它们的哈希值可能不同，因此 HashSet 无法正确去重
        // 为了正确处理重复元素，我们应该重写 Student 类的 hashCode 和 equals 方法
        // 使用 equals 方法来判断两个对象是否相同
        System.out.println(students);
    }
}
