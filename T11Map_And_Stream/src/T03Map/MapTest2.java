package T03Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map接口常用方法演示类
 * 知识点：
 * 1. Map集合的特点：存储键值对（Key-Value），键不可重复，值可以重复。
 * 2. HashMap实现类特点：无序、允许一个null键和多个null值。
 * 3. 常用方法包括：put(), get(), remove(), containsKey(), containsValue(),
 * keySet(), values(), size(), clear(), isEmpty(), putAll()等。
 * 4. 键重复时会覆盖原有值。
 * 5. 可以遍历键集或值集进行操作。
 */
public class MapTest2 {
    public static void main(String[] args) {
        // 1.添加元素: 无序，不重复，无索引。
        Map<String, Integer> map = new HashMap<>();
        map.put("小米手机", 1888);
        map.put("小米手机", 4888);//键重复，值覆盖
        map.put("玩具手表", 55);
        map.put("苹果电脑", 8888);
        map.put("华为手机", 8888);
        map.put("蓝牙耳机", 200);

        System.out.println("---获取集合---");
        System.out.println(map);
        // map = {null=null, 手表=220, Java=2, 手机=2}

        // 2.public int size():获取集合的大小
        System.out.println("---获取集合大小---");
        System.out.println(map.size());

        // 3、public void clear():清空集合

        System.out.println("---清空集合---");
        //map.clear();
        //System.out.println(map);//{}
        System.out.println("{}");//清空后是{}


        // 4.public boolean isEmpty(): 判断集合是否为空，为空返回true ,反之！
        System.out.println("---判断集合是否为空---");
        System.out.println(map.isEmpty());

        // 5.public V get(Object key)：根据键获取对应值
        System.out.println("---根据键获取对应值---");
        System.out.println(map.get("小米手机"));

        // 6. public V remove(Object key)：根据键删除整个元素(删除键会返回键的值)
        System.out.println("---根据键删除整个元素---");
        System.out.println("返回的值:" + map.remove("玩具手表"));
        System.out.println("删除后的集合:" + map);

        // 7.public  boolean containsKey(Object key): 判断是否包含某个键 ，包含返回true ,反之
        System.out.println("---判断是否包含某个键---");
        System.out.println("是否包含玩具手表:" + map.containsKey("玩具手表"));
        System.out.println("是否包含小米手机:" + map.containsKey("小米手机"));

        // 8.public boolean containsValue(Object value): 判断是否包含某个值。
        System.out.println("---判断是否包含某个值---");
        System.out.println("是否包含8888:" + map.containsValue(8888));
        System.out.println("是否包含55:" + map.containsValue(55));

        // 9.public Set<K> keySet(): 获取Map集合的全部键。
        System.out.println("---获取Map集合的全部键---");
        Set<String> keys = map.keySet();
        System.out.println(keys);

        System.out.println(map.keySet());

        // 10.public Collection<V> values(); 获取Map集合的全部值。
        System.out.println("---获取Map集合的全部值---");
        Collection<Integer> values = map.values();
        System.out.println(values);

        System.out.println(map.values());

        // 11.把其他Map集合的数据倒入到自己集合中来。(拓展)
        System.out.println("---把其他Map集合的数据倒入到自己集合中来---");
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("游戏手柄", 89);
        map2.put("蓝牙音箱", 50);

        map.putAll(map2);
        System.out.println(map);
        System.out.println(map2);

    }
}
