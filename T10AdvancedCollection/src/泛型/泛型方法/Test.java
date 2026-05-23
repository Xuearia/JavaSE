package 泛型.泛型方法;

import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void main(String[] args) {

// 1. 准备第一个集合 c1 (目标集合)
        Collection<String> list1 = new ArrayList<>();
        list1.add("苹果");
        list1.add("香蕉");
        list1.add("橘子");
        list1.add("荔枝");
        list1.add("菠萝");
        list1.add("橘子");
        System.out.println("合并前 list1: " + list1);

        // 2. 准备第二个集合 c2 (数据源集合)
        Collection<String> list2 = new ArrayList<>();
        list2.add("橘子");
        list2.add("西瓜");
        System.out.println("合并前 list2: " + list2);

        // 3. 调用你写的静态泛型方法！
        // 在这里，编译器会根据 list1 和 list2 的泛型 <String>，
        // 自动推断出你方法签名上的泛型 <E> 具体类型就是 String。
        ListUtil.addAll(list1, list2);

        // 4. 打印合并后的结果
        System.out.println("合并后 list1: " + list1);

    }
}
