package T10练习.学生排序;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

//键:学生对象
//值:籍贯
//要求:按照学生年龄的升序排列，年龄一样按照姓名的字母排列，同姓名年龄视为同一个人。
public class Test {
    public static void main(String[] args) {
        TreeMap<Student, String> s = new TreeMap<>(new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge() - o1.getAge();
            }
        });

        s.put(new Student("小红",22),"湖北");
        s.put(new Student("小刚",23),"北京");
        s.put(new Student("小雪",16),"深圳");
        s.put(new Student("小明",19),"上海");
        s.put(new Student("小红",14),"湖北");


        Set<Student> set = s.keySet();
        for (Student student : set) {
            System.out.println(student + ":" + s.get(student));
        }

    }
}
