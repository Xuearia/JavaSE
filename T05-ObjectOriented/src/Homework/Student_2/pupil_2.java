package Homework.Student_2;

public class pupil_2 {
    // 内部类 Student，用于表示学生信息
    class Student {
        // 私有成员变量，存储学生的姓名
        private String name;
        // 私有成员变量，存储学生的年龄
        private int age;
        // 私有成员变量，存储学生的成绩
        private double grade;

        // 构造方法，用于初始化学生对象的姓名、年龄和成绩
        public Student(String name, int age, double grade) {
            // 将传入的姓名赋值给成员变量 name
            this.name = name; // 这里的 this.name 指的是类的成员变量 name，等号右边的 name 是构造方法的参数
            // 通过 this.name = name; 就把传递进来的构造方法参数 name 的值赋值给了类的成员变量 name
            this.age = age;
            // 检查年龄是否在合法范围（1 - 120）内
            if (age > 0 && age <= 120) {
                // 若合法，将传入的年龄赋值给成员变量 age
                this.age = age;
            } else {
                // 若不合法，输出提示信息
                System.out.println("年龄不合法,请输入1 - 120之间的年龄!");
            }
            // 检查成绩是否在合法范围（0 - 100）内
            if (grade >= 0 && grade <= 100) {
                // 若合法，将传入的成绩赋值给成员变量 grade
                this.grade = grade;
            } else {
                // 若不合法，输出提示信息
                System.out.println("成绩不合法,请输入0 - 100之间的成绩!");
            }
        }

        // 公共方法，用于获取学生的姓名
        public String getName() {
            // 返回成员变量 name 的值
            return name;
        }

        // 公共方法，用于获取学生的年龄
        public int getAge() {
            // 返回成员变量 age 的值
            return age;
        }

        // 公共方法，用于获取学生的成绩
        public double getGrade() {
            // 返回成员变量 grade 的值
            return grade;
        }

        // 公共方法，用于展示学生的信息
        public void show() {
            // 格式化输出学生的姓名、年龄和成绩
            System.out.printf("姓名:%s,年龄:%d,成绩:%.2f", name, age, grade);
        }
    }

    public static void main(String[] args) {
        // 创建 pupil_2 类的实例
        pupil_2 message = new pupil_2();
        // 通过 pupil_2 类的实例创建 Student 类的实例，并传入姓名、年龄和成绩进行初始化
        Student student = message.new Student("kaikai", 18, 100);
        // 调用 show 方法展示学生信息
        student.show();
    }
}