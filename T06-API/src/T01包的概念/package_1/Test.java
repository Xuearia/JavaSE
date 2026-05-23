package T01包的概念.package_1;

import T01包的概念.package_2.Demo1;

import java.util.Scanner;

/**
 * Test类用于演示不同包之间类的访问方式
 */
public class Test {
    public static void main(String[] args) {
        //1.同一个包的程序,可以直接访问
        Demo d = new Demo();
        d.het();

        //2.调用其他包下的程序,必须导包才能访问
        Demo1 d2 = new Demo1();
        d2.het();

        //3、自己的程序中调用 Java 提供的程序，也需要先导包才可以使用：注意：Java.Lang 包下的程序是不需要我们导包的，可以直接使用
        Scanner sc = new Scanner(System.in);
        String s = "楷楷";

        //4、访问多个其他包下的程序，这些程序名又一样的情况下，默认只能导入一个程序，另一个程序必须带包名和类名来访问
        //package_2和package_3底下的类名一样,但是上面已经导入过了package_2的包,所以不能在导入package_3的类包,只能这样带包和类名
        T01包的概念.package_3.Demo1 d3 = new T01包的概念.package_3.Demo1();
        d3.het();
    }
}
