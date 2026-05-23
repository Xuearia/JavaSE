package test2_Lambda;

import test1_Arrays.Student;

import java.util.Arrays;

public class LambdaTest2 {
    public static void main(String[] args) {
        double[] proces = {99.3, 128, 100};
        //                  0     1    2
        // 把所有的价格都打八折，然后又存进去
//        Arrays.setAll(proces, new IntToDoubleFunction() {
//            @Override
//            public double applyAsDouble(int value) {
//
//                return proces[value] * 0.8;
//            }
//        });
//        System.out.println(Arrays.toString(proces));

        //简化
//        Arrays.setAll(proces, (int value) -> {
//            return proces[value] * 0.8;
//        });

        //在简化
//        Arrays.setAll(proces, (value) -> {
//            return proces[value] * 0.8;
//        });

        //继续简化
//        Arrays.setAll(proces, value -> {
//            return proces[value] * 0.8;
//        });

        //极致简化
        Arrays.setAll(proces, value -> proces[value] * 0.8);


        System.out.println(Arrays.toString(proces));

        //Lambda 表达式的省略写法 (进一步简化 Lambda 表达式的写法)
        //参数类型可以省略不写。
        //如果只有一个参数，参数类型可以省略，同时 () 也可以省略。
        //如果 Lambda 表达式中的方法体代码只有一行代码，可以省略大括号不写，同时要省略分号！
        //此时，如果这行代码是 return 语句，也必须去掉 return 不写。

        Student[] studnets = new Student[4];

        studnets[0] = new Student("张三", 170.3, 18);
        studnets[1] = new Student("李四", 180.3, 19);
        studnets[2] = new Student("王五", 190.3, 20);
        studnets[3] = new Student("赵六", 200.3, 21);

//        Arrays.sort(studnets, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return Double.compare(o1.getHeight(), o2.getHeight());//升序
//            }
//        });

        //简化
//        Arrays.sort(studnets, (Student o1, Student o2) -> {
//            return Double.compare(o1.getHeight(), o2.getHeight());//升序
//        });

        //在简化
//        Arrays.sort(studnets, (o1, o2) -> {
//            return Double.compare(o1.getHeight(), o2.getHeight());//升序
//        });

        //极致简化
        Arrays.sort(studnets, (o1, o2) -> Double.compare(o1.getHeight(), o2.getHeight()));//升序

       // Arrays.sort(studnets, (o1, o2) -> Double.compare(o2.getHeight(), o1.getHeight()));//降序

        System.out.println(Arrays.toString(studnets));
    }
}
