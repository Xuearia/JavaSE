package P1静态与继承.d1静态;

public class Test {
    //目标:掌握有无static修饰成员变量的用法,特点.
    public static void main(String[] args) {
        //1.类变量的用法
        //类名.类变量 (推荐) - 高效
        Student.name = "楷楷";

        //对象.类变量 (不推荐) -费劲还要创建对象
        Student s1 = new Student();
        s1.name = "xiaokai";

        Student s2 = new Student();
        s2.name = "kaikai";

        System.out.println(s1.name);//kaikai
        System.out.println(Student.name);//kaikai

        //2.实例变量的用法,属于每个对象的变量
        //对象,实例变量
        s1.age=21;
        s2.age=20;
        System.out.println(s1.age);
        System.out.println(s2.age);

        //System.out.println(Student.age); //报错
    }
}
