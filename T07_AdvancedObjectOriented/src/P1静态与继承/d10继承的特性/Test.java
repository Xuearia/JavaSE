package P1静态与继承.d10继承的特性;

public class Test {
    public static void main(String[] args) {
// 目标：掌握维承的两个注意事项事项。
//1、Java 是单继承的：一个类只能继承一个直接父类：Java 中的类不支持多维承，但是支持多层继承。
//2、Object 类是 Java 中所有类的祖宗。
        A a = new A();
        B b = new B();
    }
}

class A {
}//默认继承Oject

//class C extends B extends A{} //报错不支持多继承
class B extends A {
}

class C extends B {
}


