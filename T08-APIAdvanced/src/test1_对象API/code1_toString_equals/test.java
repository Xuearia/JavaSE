package test1_对象API.code1_toString_equals;

public class test {
    public static void main(String[] args) {
        //目标:掌握Object类提供的常用方法
        Student s1 = new Student("楷楷", 23);
        //System.out.println(s1.toString());
        System.out.println(s1);//会自动省略Object的toString

        //equals(object o)判断两个对象是否相等
        Student s2 = new Student("楷楷",23);
        //意义让子类重写去比较内容是否相等
        System.out.println(s2.equals(s1));
        System.out.println(s1 == s2);

    }
}
