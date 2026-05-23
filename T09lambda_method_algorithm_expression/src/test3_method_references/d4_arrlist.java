package test3_method_references;

import test1_Arrays.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class d4_arrlist {
    public static void main(String[] args) {
        ArrayList<Student> s1 = new ArrayList<>();

        s1.add(new Student("张三", 170.3, 18));
        s1.add(new Student("李四", 160.3, 17));
        s1.add(new Student("王五", 150.3, 16));
        s1.add(new Student("赵六", 140.3, 15));
        s1.add(new Student("孙七", 130.3, 14));
        s1.add(new Student("周八", 120.3, 13));

        System.out.println("排序前");
        s1.forEach(System.out::println);

/*        Collections.sort(s1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();//对年龄升序
            }
        });*/
        Collections.sort(s1,(o1,o2)-> o1.getAge() - o2.getAge());//对年龄升序
        System.out.println("\n方式1排序后（按年龄升序）：");
        s1.forEach(System.out::println);

        Collections.sort(s1,(o1,o2)-> (int)(o1.getHeight() - o2.getHeight()));//对身高升序
        System.out.println("\n方式1排序后（按身高升序）：");
        s1.forEach(System.out::println);

        //Collections.sort(s1, (o1, o2) -> o1.getAge() - o2.getAge());


    }

}

