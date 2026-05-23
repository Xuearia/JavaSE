package test6_Practice;

import java.util.Arrays;
import java.util.Comparator;

public class 排序 {

    /*
    * 定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
    * 要求1:属性有姓名、年龄、身高。
    要求2:按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
* (姓名中不要有中文或特殊字符，会涉及到后面的知识)*/
    public static void main(String[] args) {
        Girlfriends[] gfs = new Girlfriends[4];
        gfs[0] = new Girlfriends("张三", 18, 170.3);
        gfs[1] = new Girlfriends("李四", 19, 165.5);
        gfs[2] = new Girlfriends("王五", 17, 155.2);
        gfs[3] = new Girlfriends("赵六", 18, 175.7);

            Arrays.sort(gfs, (o1, o2)-> {
            // 第一步：比较年龄
            int compareAge = o1.getAge() - o2.getAge();
            if (compareAge != 0) return compareAge;
            // 第二步：年龄相同，比较身高
            int compareHeight = (int) (o1.getHeight() - o2.getHeight());
            if (compareHeight != 0) return compareHeight;
            // 第三步：年龄和身高都相同，比较姓名
            return o1.getName().compareTo(o2.getName());
        });

       /* for (Girlfriends gf : gfs) {
            System.out.println(gf);
        }*/
        Arrays.stream(gfs).forEach(System.out::println);



    }
    static class Girlfriends {
        private String name;
        private int age;
        private double height;

        @Override
        public String toString() {
            return "Girlfriends{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", height=" + height +
                    '}';
        }
        public Girlfriends() {
        }
        public Girlfriends(String name, int age, double height) {
            this.name = name;
            this.age = age;
            this.height = height;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public double getHeight() {
            return height;
        }
        public void setHeight(double height) {
            this.height = height;
        }

    }
}