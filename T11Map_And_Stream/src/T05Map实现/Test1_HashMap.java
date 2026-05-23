package T05Map实现;


import java.util.HashMap;
import java.util.Map;

//掌握map集合的实现类
public class Test1_HashMap {
    public static void main(String[] args) {

        Map<Student, String> map = new HashMap<>();
        map.put(new Student("小明", 14, 167.6), "二班");
        map.put(new Student("小明", 14, 167.6), "二班");
        map.put(new Student("小李", 17, 170.6), "四班");
        map.put(new Student("小红", 15, 168.6), "一班");
        map.put(new Student("小王", 16, 169.6), "三班");
        map.put(new Student("小张", 18, 171.6), "二班");

        System.out.println(map);

    }
}
