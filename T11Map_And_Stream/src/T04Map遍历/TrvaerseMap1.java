package T04Map遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * map第一种遍历方式 键找值
 * */
public class TrvaerseMap1 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("小米手机", 1888);
        map.put("玩具手表", 55);
        map.put("苹果电脑", 8888);
        map.put("华为手机", 1988);
        map.put("小米手机", 4888);
        map.put("蓝牙音箱", 50);

        //第一种遍历方式(推荐 清晰 易拓展)
        //1.获取map集合的全部键
        Set<String> set = map.keySet();
        System.out.println(set);

        //2.遍历全部的键,根据键获取全部的值
        for (String s : set) {
            int value = map.get(s);
            System.out.println(s + "-->" + value);
        }

        //3.第二种遍历方式(不推荐 简洁但牺牲拓展性)
//        for (String s : map.keySet()) {
//            System.out.println(s);//遍历键
//            System.out.println(map.get(s));//根据键获取值
//        }
    }
}
