package T04Map遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 * map第2种遍历方式 键值对
 */
public class TrvaerseMap2 {
    public static void main(String[] args) {
        // 创建一个HashMap实例，存储商品名称和价格
        Map<String, Integer> map = new HashMap<>();
        // 添加商品和对应价格到map中
        map.put("小米手机", 1888);
        map.put("玩具手表", 55);
        map.put("苹果电脑", 8888);
        map.put("华为手机", 1988);
        // 重复添加“小米手机”，更新其价格
        map.put("小米手机", 4888);
        map.put("蓝牙音箱", 50);

        // 获取map中所有键值对的集合
        //快捷输入:map.entrySet() + ctrl+alt +v
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        // 遍历键值对集合，打印每个键值对的键和值
        //快捷输入:entries.for
        for (Map.Entry<String, Integer> entry : entries) {
            // 然后我们可以通过键值对的键获取对应的值，并打印出来。
            System.out.println(entry.getKey() + "-->" + entry.getValue());
        }

        //更简单
        for(String s : map.keySet()){
            System.out.println(s + "-->" + map.get(s));
        }
    }
}
