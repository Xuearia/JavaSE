package test4_CollectionSet;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/**
 * SetTest1 类演示了 Java 中 Set 接口的三种常见实现类：
 * - HashSet：无序不重复集合
 * - LinkedHashSet：有序（插入顺序）不重复集合
 * - TreeSet：可排序的不重复集合
 */
public class SetTest1 {
    public static void main(String[] args) {

        // ================== HashSet 示例 ==================
        // 创建一个 HashSet 集合，存储 Integer 类型元素
        Set<Integer> set = new HashSet<>();

        // 添加多个元素，包含重复值 666
        set.add(666);
        set.add(777);
        set.add(888);
        set.add(999);
        set.add(111);
        set.add(555);
        set.add(666); // 重复元素会被自动忽略

        // 输出结果验证：无序且去重
        System.out.println(set + " —— HashSet：无序不重复");


        // ================== LinkedHashSet 示例 ==================
        // 创建一个 LinkedHashSet 集合，保持插入顺序(双向链表结构)
        Set<Integer> set1 = new LinkedHashSet<>();

        // 添加多个元素，包含重复值 666
        set1.add(666);
        set1.add(777);
        set1.add(888);
        set1.add(999);
        set1.add(111);
        set1.add(555);
        set1.add(666); // 重复元素会被自动忽略

        // 输出结果验证：有序且去重
        System.out.println(set1 + " —— LinkedHashSet：有序不重复");


        // ================== TreeSet 示例 ==================
        // 创建一个 TreeSet 集合，默认按升序排列(升序) - 基于 红黑树结构
        Set<Integer> set2 = new TreeSet<>();

        // 添加多个元素，包含重复值 666
        set2.add(666);
        set2.add(777);
        set2.add(888);
        set2.add(999);
        set2.add(111);
        set2.add(555);
        set2.add(666); // 重复元素会被自动忽略

        // 输出结果验证：升序排序且去重
        System.out.println(set2 + " —— TreeSet：可排序");


        /* 红黑树结构:
            [666B]
           /      \
       [111R]    [777R]
         /   \        \
     [nilB] [555B]  [888R]
                      \
                     [999R]
*/

    }
}
