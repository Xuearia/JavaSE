package T02Collections集合排序;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTest1 {
    public static void main(String[] args) {
        //1.public static <T> boolean addAll(Collection<? super T> c, T...e)
        //第一个数据要接一个集合,第二个数据是可变参数(数组)
        List<String> names = new ArrayList<>();
        //names.add("张三");
        //names.add("王五");
        //names.add("张三");//这样写如果有1000行会很麻烦
        //names.add("李四");
        Collections.addAll(names, "张三", "李四", "王五", "张麻子");//这样
        System.out.println(names);
        System.out.println("-----------------------------------");


        //2.public static void shuffle(List<?> list)：对集合打乱顺序(只支持List)
        System.out.println("打乱集合:");
        Collections.shuffle(names);
        System.out.println(names);
        System.out.println("-----------------------------------");

        //3.public static <T> void short(List<T list): 对List集合排序(只支持List)
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, 4, 2, 1, 3);
        System.out.println("对集合排序:");
        Collections.sort(list);//对集合排序
        System.out.println(list);


        List<Student> students = new ArrayList<>();
        students.add(new Student("喜羊羊", 45, 150.5));
        students.add(new Student("喜羊羊", 45, 150.5));
        students.add(new Student("美羊羊", 88, 148.0));
        students.add(new Student("暖羊羊", 18, 148.6));

        // Collections.sort(students);//对集合排序
        //System.out.println(students);

        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });
        System.out.println(students);
    }
}

