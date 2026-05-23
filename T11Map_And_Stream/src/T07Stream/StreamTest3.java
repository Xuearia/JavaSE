package T07Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;
/**
 * 目标：掌握Stream流的创建。
 * 学习内容：
 * 1. 从List集合创建Stream流；
 * 2. 从Set集合创建Stream流；
 * 3. 从Map集合创建Stream流（按键、按值、按键值对）；
 * 4. 从数组创建Stream流；
 * 5. 使用Stream API进行简单的过滤和遍历操作。
 */
public class StreamTest3 {
    public static void main(String[] args) {
        List<Double> scores = new ArrayList<>();
        Collections.addAll(scores, 88.5, 100.0, 60.0, 99.0, 9.5, 99.6, 25.0);
        // 需求1：找出成绩大于等于60分的数据，并升序后，再输出。
        System.out.println("------------------数据升序排序-----------------------------");
        scores.stream().filter(s -> s >= 60).sorted().forEach(System.out::println);

        List<Student> students = new ArrayList<>();
        Student s1 = new Student("蜘蛛精", 26, 172.5);
        Student s2 = new Student("蜘蛛精", 26, 172.5);
        Student s3 = new Student("紫霞", 23, 167.6);
        Student s4 = new Student("白晶晶", 25, 169.0);
        Student s5 = new Student("牛魔王", 35, 183.3);
        Student s6 = new Student("牛夫人", 34, 168.5);
        Collections.addAll(students, s1, s2, s3, s4, s5, s6);
        // 需求2：找出年龄大于等于23,且年龄小于等于30岁的学生，并按照年龄降序输出.
        //sorted((o1, o2) -> o2.getAg() - o1.getAg())自定义排序
        System.out.println("------------------自定义降序排序-----------------------------");
        students.stream().filter(s -> s.getAg() >= 23 && s.getAg() <= 30).sorted((o1, o2) -> o2.getAg() - o1.getAg()).forEach(System.out::println);


        System.out.println("------------------获取前几个元素-----------------------------");
        // 需求3：取出身高最高的前3名学生，并输出。
        // limit(n)  获取前几个元素(限制输出的个数)
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight())).limit(3).forEach(System.out::println);


        System.out.println("------------------跳过前几个元素-----------------------------");
        // 需求4：取出身高倒数的2名学生，并输出。   s1 s2 s3 s4 s5 s6
        students.stream().sorted((o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight())).skip(4).forEach(System.out::println);


        System.out.println("------------------去除重复的元素-----------------------------");
        // 需求5：找出身高超过170的学生叫什么名字，要求去除重复的名字，再输出。
        //map()  将元素转换成其他形式或提取信息 (这里我单独提取姓名).map(s->getName)

        students.stream().filter(s -> s.getHeight() > 170).map(Student::getName).distinct().forEach(System.out::println);

        // distinct去重复，自定义类型的对象（希望内容一样就认为重复，重写hashCode,equals）/
        students.stream().filter(s -> s.getHeight() > 170).distinct().forEach(System.out::println);


        //concat  合并  可以将两个流合并成一个流
        System.out.println("------------------合并a和b两个流-----------------------------");
        //直接通过 Stream.of() 方法创建包含指定元素的 Stream。
        Stream<Integer> a = Stream.of(1, 2, 3);
        Stream<Integer> b = Stream.of(4, 5, 6);
        Stream<Integer> concat = Stream.concat(a, b);
        concat.forEach(System.out::println);


    }
}
