package T05Map实现;


import java.util.LinkedHashMap;
import java.util.Map;

public class Test2_LinkedHashMap {
    public static void main(String[] args) {
        //基于双链表保证键值对 的顺序
        Map<String, Integer> map = new LinkedHashMap<>();//按照键 有序 不重复 无索引


        map.put("小王", 12);
        map.put("小魏", 19);
        map.put("小王", 13);
        map.put("小李", 22);
        map.put("小张", 18);

        System.out.println(map);
    }
}
