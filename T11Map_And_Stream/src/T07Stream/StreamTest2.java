package T07Stream;
import java.util.*;
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
public class StreamTest2 {
    public static void main(String[] args) {
        // 1、如何获取List集合的Stream流？
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "张三丰", "张无忌", "周芷若", "赵敏", "张强");
        Stream<String> stream = names.stream();

        // 2、如何获取Set集合的Stream流？
        Set<String> set = new HashSet<>();
        Collections.addAll(set, "刘德华", "张曼玉", "蜘蛛精", "马德", "德玛西亚");
        Stream<String> stream1 = set.stream();
        stream1.filter(s -> s.contains("德")).forEach(s -> System.out.println(s));

        // 3、如何获取Map集合的Stream流？
        Map<String, Double> map = new HashMap<>();
        map.put("古力娜扎", 172.3);
        map.put("迪丽热巴", 168.3);
        map.put("马尔扎哈", 166.3);
        map.put("卡尔扎巴", 168.3);

        Set<String> keys = map.keySet();//创建键的集合
        Stream<String> ks = keys.stream();//在创建键的集合的Stream流

        Collection<Double> values = map.values();//创建值的集合
        Stream<Double> vs = values.stream();//在创建值的集合的Stream流

        //通过键值对创建键值对集合的Stream流 来操控键和值
        Set<Map.Entry<String, Double>> entries = map.entrySet();
        Stream<Map.Entry<String, Double>> stream2 = entries.stream();
        stream2.filter(e -> e.getKey().contains("巴"))
                .forEach(e -> System.out.println());

        //简化
        map.entrySet().stream()
                .filter(e -> e.getKey().contains("巴"))
                .forEach(System.out::println);


        // 4、如何获取数组的Stream流？
        String[] names2 = {"张翠山", "东方不败", "唐大山", "独孤求败"};

        Stream<String> s1 = Arrays.stream(names2);
        s1.forEach(System.out::println);

        //也可以使用Stream.of(s1)来创建steam流

        Stream<String> s2 = Stream.of(names2);
    }
}
