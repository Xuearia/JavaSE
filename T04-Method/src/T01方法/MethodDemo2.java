package T01方法;

/**
 * MethodDemo2 类用于演示方法调用的顺序和流程
 */
public class MethodDemo2 {
    /**
     * 程序的入口点
     *
     * @param args 命令行参数，未在此示例中使用
     */
    public static void main(String[] args) {
        // 程序开始执行，首先打印字符 'a'
        System.out.println("a");
        // 调用 method1 方法
        method1();
        // method1 调用完成后，打印字符 'b'
        System.out.println("b");
    }

    /**
     * method1 方法，用于演示方法内部的调用和执行流程
     */
    public static void method1() {
        // 调用 method2 方法
        method2();
        // method2 调用完成后，打印字符 'c'
        System.out.println("c");
    }

    /**
     * method2 方法，用于演示多个打印语句的执行顺序
     */
    public static void method2() {
        // 首先打印字符 'd'
        System.out.println("d");
        // 然后打印字符 'e'
        System.out.println("e");
    }
}
