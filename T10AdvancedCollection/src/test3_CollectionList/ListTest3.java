package test3_CollectionList;

import java.util.LinkedList;

/**
 * ListTest3 类用于演示 LinkedList 的两种常见使用方式：
 * - 模拟队列（先进先出 FIFO）
 * - 模拟栈（后进先出 LIFO）
 *
 * 目标：掌握 LinkedList 集合的常用操作。
 */
public class ListTest3 {
    public static void main(String[] args) {

        // ================== 使用 LinkedList 模拟队列 ==================
        // 创建一个队列（使用 LinkedList 实现）
        LinkedList<String> line = new LinkedList<>();

        // 添加元素到队列尾部（使用 addLast 方法）
        line.addLast("第一号人");
        line.addLast("第二号人");
        line.addLast("第三号人");
        line.addLast("第四号人");
        line.addLast("第五号人");

        // 打印当前队列内容
        System.out.println(line);

        // 出队操作：先进先出（FIFO）
        System.out.println(line.removeFirst() + "出队了");
        System.out.println(line.removeFirst() + "出队了");
        System.out.println(line.removeFirst() + "出队了");

        // 打印剩余队列内容
        System.out.println(line);

        // 分隔线
        System.out.println("-----------------");


        // ================== 使用 LinkedList 模拟栈 ==================
        // 创建一个栈对象（也使用 LinkedList 实现）
        LinkedList<String> stack = new LinkedList<>();

        // 压栈操作：使用 push 方法（JDK 1.6+ 推荐用 push 提高代码逼格）
        stack.push("第一颗子弹");
        stack.push("第二颗子弹");
        stack.push("第三颗子弹");
        stack.push("第四颗子弹");
        stack.push("第五颗子弹");

        // 打印当前栈内容
        System.out.println(stack);

        // 出栈操作：后进先出（LIFO），使用 pop 方法
        System.out.println(stack.pop() + "打出去了");
        System.out.println(stack.pop() + "打出去了");
        System.out.println(stack.pop() + "打出去了");
        System.out.println(stack.pop() + "打出去了");

    }
}
