package T10练习.景点统计;

import java.util.*;

//某个班级80名学生，现在需要组成秋游活动，班长提供了四个景点依次是(A、B、C、D)，
// 每个学生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
public class Test {
    public static void main(String[] args) {
        
        String[] s = {"A", "B", "C", "D"};
        
        // 创建Map用于统计每个景点的票数
        Map<String, Integer> countMap = new HashMap<>();
        for (String s1 : s){
            countMap.put(s1, 0);//将s1的数据装进countMap
            System.out.println(s1+":"+countMap.get(s1));
        }
        Random r = new Random(s.length);
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(s.length);
            System.out.println(s[index]);
        }
        for (int i = 0; i < 80; i++) {
            int index = r.nextInt(s.length);
            String key = s[index];
            Integer value = countMap.get(key);
            countMap.put(key, value + 1);
        }
        System.out.println(countMap);

        Set<Map.Entry<String, Integer>> entries = countMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue() == Collections.max(countMap.values())){
                System.out.println(entry.getKey() + "想去的景点人数最多");
            }
            System.out.println(entry.getKey() + "想去的景点人数为：" + entry.getValue());
        }
    }

}
