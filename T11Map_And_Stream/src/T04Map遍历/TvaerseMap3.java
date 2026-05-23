package T04Map遍历;

import java.util.HashMap;
import java.util.Map;

/**
 * map第3种遍历方式 Lambda表达式
 */
public class TvaerseMap3 {
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

//        map.forEach(new BiConsumer<String, Integer>() {
//            @Override
//            public void accept(String s, Integer integer) {
//                System.out.println(s + "-->" + integer);
//            }
//        });

        /*简化为lambda*/
        map.forEach((s, integer) -> {
            System.out.println(s + "-->" + integer);
        });
    }
}
