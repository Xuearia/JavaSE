package T03ArrayList_API.数组列表演示;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.stream.IntStream;

public class code2_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("张三");
        list.add("王五");
        list.add("赵六");
        list.add("孙七");
        System.out.println(list);

        // 方式1: 传统for循环
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------------------------");
        
        // 方式2: 增强for循环（foreach）
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("----------------------------------");
        
        // 方式3: forEach方法 + 方法引用
        list.forEach(System.out::println);
        System.out.println("----------------------------------");
        
        // 方式4: Iterator迭代器遍历
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("----------------------------------");
        
        // 方式5: ListIterator列表迭代器（支持双向遍历）
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        System.out.println("----------------------------------");
        
        // 方式6: Stream API遍历
        list.stream().forEach(System.out::println);
        System.out.println("----------------------------------");
        
        // 方式7: IntStream.range生成索引流
        IntStream.range(0, list.size()).forEach(i -> System.out.println(list.get(i)));
        System.out.println("----------------------------------");
        
        // 方式8: parallelStream并行流遍历（大数据量时可能更快）
        list.parallelStream().forEach(System.out::println);
    }
}
