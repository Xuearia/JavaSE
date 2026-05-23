package P1静态与继承.d2静态方法;

public class Student {
    Double grade;

    //类方法(静态方法)
    public static void printHelloWord() {
        System.out.println("HelloWord~~");
        System.out.println("HelloWord~~");
    }

    //实例方法(对象的方法)
    public void PassGrade() {
        System.out.println("成绩" + (grade >= 60 ? "及格" : "不及格"));
    }
}
