package T06Collection嵌套;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

/**
 * 目标：理解集合的嵌套。
 * 通过创建一个包含多个省份及其对应城市列表的Map，来展示如何在集合中嵌套集合。
 * 江苏省 = "南京市","扬州市","苏州市","无锡市","常州市"
 * 湖北省 = "武汉市","孝感市","十堰市","宜昌市","鄂州市"
 * 河北省 = "石家庄市","唐山市", "邢台市", "保定市", "张家口市"
 */
public class Test {
    public static void main(String[] args) {
        // 创建一个Map对象，键为省份名称，值为该省份的城市列表
        Map<String, List<String>> map = new HashMap<>();

        // 创建并填充江苏省的城市列表
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "南京市", "无锡市", "徐州市", "常州市", "南通市");
        map.put("江苏省", list);

        // 创建并填充湖北省的城市列表
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        map.put("湖北省", list2);

        // 创建并填充河北省的城市列表
        List<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "石家庄市", "唐山市", "邢台市", "保定市", "张家口市");
        map.put("河北省", list3);

        // 打印整个map，以查看所有省份及其城市列表
        System.out.println(map);

        // 获取并打印湖北省的所有城市
        List<String> cities = map.get("湖北省");
        for (String city : cities) {
            System.out.println(city);
        }

        // 遍历map中的每个键值对，并打印
        map.forEach((p, c) -> {
            System.out.println(p + "----->" + c);
        });
    }
}
