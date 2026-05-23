package T05Map实现;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//掌握treemap集合的实现类
public class Test3_TreeMap {
    public static void main(String[] args) {

        Map<Student, String> map = new TreeMap<>(Comparator.comparingInt(Student::getAg));

        //这种自定义对象键类型不支持自动排序,因为它不知道如何比较,所以需要重写compareTo方法
        map.put(new Student("小明", 14, 167.6), "二班");
        map.put(new Student("小明", 14, 167.6), "二班");
        map.put(new Student("小李", 17, 170.6), "四班");
        map.put(new Student("小红", 15, 168.6), "一班");
        map.put(new Student("小王", 16, 169.6), "三班");
        map.put(new Student("小张", 18, 171.6), "二班");


        System.out.println(map);

    }
}
