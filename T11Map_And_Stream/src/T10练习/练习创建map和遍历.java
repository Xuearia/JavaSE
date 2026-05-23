package T10练习;

import java.util.*;

public class 练习创建map和遍历 {
    public static void main(String[] args) {
        //创建集合
        Map<String, Integer> m = new HashMap<>();
        m.put("小王", 18);
        m.put("小李", 19);
        m.put("小张", 20);
        m.put("小王", 21);//覆盖小王的21
        m.put("小赵", 22);
        m.put("小雪", 23);
        System.out.println(m);//键值
        System.out.println(m.keySet());//键
        System.out.println("========判断是否包含键========");
        System.out.println(m.containsKey("小王"));
        System.out.println("========判断是否包含值========");
        System.out.println(m.containsValue(55));
        System.out.println("========判断是否为空========");
        System.out.println(m.isEmpty());
        System.out.println("========获取大小========");
        System.out.println(m.size());

        System.out.println("========遍历========");

        /*
    m.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s + " " + integer);
            }
        });
        */
        //m.forEach((s, integer)->System.out.println(s + " " + integer));

        //使用for循环遍历
        for (String s : m.keySet())
            System.out.println(s);

        //使用forEach遍历
        m.forEach((k, v) -> System.out.println(k + "-> " + v));

        System.out.println("========按照年龄降序========");
       List<Map.Entry<String, Integer>> ages = new ArrayList<>(m.entrySet());
        //转化list集合 并简化
        ages.sort((o1,o2) -> Integer.compare(o1.getValue(), o2.getValue()));
        for (Map.Entry<String, Integer> age : ages) {
            System.out.println(age.getKey() + "-> " + age.getValue());
        }

    }
}
