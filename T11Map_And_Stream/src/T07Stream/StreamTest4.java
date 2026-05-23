package T07Stream;

import java.util.*;
import java.util.stream.Collectors;
/**
 * 目标：掌握 Stream 流的常见操作与使用场景。
 * 学习内容：
 * 1. 使用 Stream 流进行数据统计（如 count() 方法）；
 * 2. 使用 Stream 流获取集合中的最大值（max()）和最小值（min()）；
 * 3. 使用 filter() 方法对集合数据进行过滤；
 * 4. 将 Stream 流处理后的数据收集到 List、Set、Map 等集合中；
 * 5. 使用 Collectors.toMap() 将对象属性映射为键值对；
 * 6. 将 Stream 流结果转换为数组（Object[] 和自定义类型数组 Student[]）；
 * 7. 处理 Optional 对象以避免空指针异常；
 * 8. 使用 distinct() 去除重复元素；
 * 9. 结合 Lambda 表达式简化比较逻辑（如 Double.compare）。
 */

public class StreamTest4 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("蜘蛛精", 26, 172.5);
        Student s3 = new Student("紫霞", 23, 167.6);
        Student s4 = new Student("白晶晶", 25, 169.0);
        Student s5 = new Student("牛魔王", 35, 183.3);
        Student s6 = new Student("牛夫人", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);
        // 需求1：请计算出身高超过168的学生有几人。
        //System.out.println(students.stream().filter(s -> s.getHeight() > 168).count());
        System.out.println("----------count()统计人数--------------");
        long count = students.stream().filter(s -> s.getHeight() > 168).count();
        System.out.println(count);

        // 需求2：请找出身高最高的学生对象，并输出。
        System.out.println("----------max()获取最大值--------------");
        Student max = students.stream().max((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())).get();
        System.out.println(max);

        Optional<Student> max1 = students.stream().max((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()));
        System.out.println(max1);

        // 需求3：请找出身高最矮的学生对象，并输出。
        System.out.println("----------min()获取最小值--------------");
        Student min = students.stream().min((o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight())).get();
        System.out.println(min);

        // 需求4：请找出身高超过170的学生对象，并放到一个新集合中去返回。
        // 流只能收集一次。
        System.out.println("----------将对象存入新集合--------------");
        List<Student> collect = students.stream().filter(a -> a.getHeight() > 170).collect(Collectors.toList());
        System.out.println(collect);

        Set<Student> collect1 = students.stream().filter(a -> a.getHeight() > 170).collect(Collectors.toSet());
        System.out.println(collect1);

        // 需求5：请找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个Map集合返回。
        System.out.println("----------将对象存入Map集合--------------");
        Map<String, Double> collect2 = students.stream().filter(a -> a.getHeight() > 170).distinct().collect(Collectors.toMap(a -> a.getName(), a -> a.getHeight()));
        System.out.println(collect2);

        // 需求6：请找出身高超过170的学生对象，并把学生对象的名字和身高，存入到一个数组返回。
        System.out.println("----------将对象存入数组--------------");
        Object[] array = students.stream().filter(a -> a.getHeight() > 170).toArray();

        //如果你想要创建一个对象数组，而不是对象元素组成的数组，那么你需要使用toArray(IntFunction)方法。
        Student[] array1 = students.stream().filter(a -> a.getHeight() > 170).toArray(b -> new Student[b]);
        System.out.println(Arrays.toString(array1));


    }
}
