package T10练习;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class 使用entries遍历 {
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

        //感觉有点小麻烦
        Set<Map.Entry<String, Integer>> e = map.entrySet();
        for (Map.Entry<String, Integer> entry : e){
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key+"--->"+value);
        }
    }
}
