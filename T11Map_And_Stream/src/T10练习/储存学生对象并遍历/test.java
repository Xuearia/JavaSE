package T10练习.储存学生对象并遍历;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/*
需求:创建一个HashMap集合，键是学生对象(Student)，值是籍贯(String)存储三个键值对元素，并遍历
要求:同姓名，同年龄认为是同一个学生
核心点:
HashMap的键位置如果存储的是自定义对象，需要重写hashCode和equals方法。
*/

public class test {
    public static void main(String[] args) {

        Map<Student, String> map = new HashMap<>();

        map.put(new Student("张三", 18), "北京");
        map.put(new Student("小王", 19), "上海");
        map.put(new Student("小李", 20), "广州");
        map.put(new Student("小张", 21), "深圳");

      //遍历
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            String value = map.get(key);
            System.out.println(key + "->" + value);
        }

        System.out.println("------------------");
        //遍历
        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for(Map.Entry<Student, String> s : entries){
            System.out.println(s.getKey() +"-->"+ s.getValue());
        }
        System.out.println("------------------");
        map.forEach((key, value) -> System.out.println(key+"-->"+value));

    }
}
