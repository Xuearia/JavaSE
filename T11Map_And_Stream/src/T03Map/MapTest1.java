package T03Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *  * Map 是一种键值对（Key-Value）结构，适合用于通过键快速查找对应的值。
 * HashMap：基于哈希表实现，键无序且唯一，适用于大多数快速查找场景。
 * TreeMap：基于红黑树实现，键按自然顺序或自定义顺序排列，适用于需要排序的场景。
 * LinkedHashMap：保留插入顺序或访问顺序，适用于需记忆顺序的场景。
 *
 */
public class MapTest1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();//一行经典代码
        map.put("小米手机", 1888);
        map.put("玩具手表", 55);
        map.put("苹果电脑", 8888);
        map.put("华为手机", 8888);
        map.put("小米手机", 4888);//键重复，值覆盖

        System.out.println(map);

        Map<Integer, String> map2 = new TreeMap<>();//可以排序
        map2.put(4, "小张");
        map2.put(2, "小王");
        map2.put(3, "小李");
        map2.put(1, "小明");

        //排序
        System.out.println(map2);

    }
}
