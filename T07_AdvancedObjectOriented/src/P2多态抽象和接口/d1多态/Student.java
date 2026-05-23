package P2多态抽象和接口.d1多态;

public class Student extends People {
    public String name = "这是子类Student的名称";

    @Override
    public void run() {
        System.out.println("学生跑的贼快~~");
    }
}
