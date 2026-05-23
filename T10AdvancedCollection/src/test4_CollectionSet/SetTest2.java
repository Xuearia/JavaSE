package test4_CollectionSet;

import java.util.Collection;
/**
 * 目标：了解哈希值的基本概念和使用方式。
 * <p>
 * Java 中的所有对象都可以调用 Object 类提供的 hashCode() 方法，返回该对象的哈希值。
 * 哈希值是一个 32 位整数，由 JVM 根据对象的内容计算得出。
 * <p>
 * 特点：
 * - 同一个对象多次调用 hashCode() 返回的哈希值是相同的。
 * - 不同对象的哈希值一般不同，但也有可能相同（称为“哈希碰撞”）。
 */
public class SetTest2 {
    public static void main(String[] args) {
        // 创建两个 Student 对象
        Student s1 = new Student("喜羊羊", 18, 1.75);
        Student s2 = new Student("懒羊羊", 18, 1.75);

        // 调用 hashCode() 方法获取对象的哈希值
        System.out.println(s1.hashCode());     // 输出 s1 的哈希值
        System.out.println(s1.hashCode());     // 输出结果与上一行相同，因为是同一对象
        System.out.println(s2.hashCode());     // 输出 s2 的哈希值，通常与 s1 不同

        String str1 = new String("abc");
        String str2 = new String("abD");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());//
    }
}
