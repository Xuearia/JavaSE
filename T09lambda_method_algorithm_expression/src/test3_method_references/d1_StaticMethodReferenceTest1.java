package test3_method_references;

import test1_Arrays.Student;

import java.util.Arrays;

public class d1_StaticMethodReferenceTest1 {
    public static void main(String[] args) {
        Student[] students = new Student[4];

        students[0] = new Student("张三", 170.3, 18);
        students[1] = new Student("李四", 180.3, 19);
        students[2] = new Student("王五", 190.3, 20);
        students[3] = new Student("赵六", 200.3, 21);

//        Arrays.sort(studnets, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();//对年龄升序
//            }
//        });

        //使用Lambda表达式简化
        // Arrays.sort(studnets, (o1, o2) -> o1.getAge() - o2.getAge());

        // Arrays.sort(studnets, (o1, o2) -> CompareByData.compareByAge(o1, o2));
        //使用静态方法引用
        Arrays.sort(students, CompareByData::compareByAge);

        //使用实例方法引用
        CompareByData compare = new CompareByData();
        //Arrays.sort(students, ((o1, o2) -> o2.getAge() - o1.getAge()));
        Arrays.sort(students, compare::compareByAgeDesc);
        System.out.println(Arrays.toString(students));

    }
}
