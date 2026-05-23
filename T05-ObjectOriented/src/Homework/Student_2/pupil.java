package Homework.Student_2;

public class pupil {
    //构建一个学生类，学生具备姓名、年龄和成绩这些属性。为了保证数据的安全性，我们会把这些属性设为私有，并且提供公共的访问和修改方法。
    class Student {
        private String name;//姓名
        private int age;//年龄
        private double grade;//成绩

        //公共的获取姓名的方法
        public String getName() {
            return getName();
        }

        //公共设置姓名的方法
        public void setName(String name) {
            this.name = name;
        }

        //公共获取年龄的方法
        public int getAge() {
            return age;
        }

        //公共设置年龄的 方法,并添加有效性检测
        public void setAge(int a) {
            if (a > 0 && a <= 120) {
                this.age = a;
            } else {
                System.out.println("年龄不合法,请输入1-120之间的年龄!");
            }
        }

        //公共获取成绩的方法
        public double getGrade() {
            return grade;
        }

        //公共设置成绩的方法
        public void setGrade(double grade1) {
            if (grade1 >= 0 && grade1 <= 100) {
                this.grade = grade1;
            } else {
                System.out.println("成绩不合法,请输入0-100之间的成绩!");
            }
        }



        //展示学生信息的方法
        public void show() {
            System.out.printf("姓名:%s,年龄:%d,成绩:%.2f", name, age, grade);
        }
    }

    public static void main(String[] args) {
        //创建学生的信息对象
        pupil message = new pupil();
        Student student = message.new Student();
        //设置学生姓名
        student.setName("楷楷");
        //设置学生年龄
        student.setAge(20);
        //设置学生成绩
        student.setGrade(67.2);
        //展示学生信息
        student.show();
    }
}
