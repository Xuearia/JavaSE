package P1静态与继承.d2静态方法;

public class Test {
    public static void main(String[] args) {
        //目标掌握有无static修饰方法的用法
        //1.类方法的用法
        //类名.类方法(推荐)
        Student.printHelloWord();

        //对象.类方法(不推荐)
        Student s1 = new Student();
        s1.printHelloWord();

        //2.实例方法的用法
        //对象.实例方法
        s1.PassGrade();
    }
}
