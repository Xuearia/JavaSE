package T07Stream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
/**
 * 目标：掌握Java Stream流的基本使用。
 * 学习内容：
 * 1. 使用Stream流进行条件过滤（filter）；
 * 2. 将Stream流结果收集为List（Collectors.toList()）；
 * 3. 对比传统集合遍历与Stream流式处理的区别；
 * 4. 理解函数式编程风格在集合操作中的优势；
 * 5. 掌握链式调用(filter + filter + collect)的使用方式。
 */
public class StreamTest1 {
    public static void main(String[] args) {
        // 初始化测试数据
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张无忌", "张三丰", "张翠", "赵敏", "周芷若");

        // 传统集合遍历方式
        System.out.println("-----------使用正常的集合遍历来完成-------------");
        List<String> names2 = new ArrayList<>();
        for (String s : names) {
            if (s.startsWith("张") && s.length() == 3) {
                names2.add(s);
            }
        }
        System.out.println(names2);

        // 使用Stream流方式
        System.out.println("-------------使用stream流来完成---------------");
        List<String> names3 = names.stream()
                .filter(s -> s.startsWith("张"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
        System.out.println(names3);
    }
}
