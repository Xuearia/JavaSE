package P2多态抽象和接口.d1多态;

public class Test {
    public static void main(String[] args) {
        //目标:认识多态,对象多态和行为多态;

        //1.对象多态
        People p1 =new Teacher();
        p1.run();// 识别技巧,编译看左边,运行看右边
        System.out.println(p1.name);// 注意:对于变量,编译看左边运行看左边

        People p2 =new Student();
        p2.run();// 识别技巧,编译看左边,运行看右边
        System.out.println(p2.name);// 注意:对于变量,编译看左边运行看左边

    }
}
