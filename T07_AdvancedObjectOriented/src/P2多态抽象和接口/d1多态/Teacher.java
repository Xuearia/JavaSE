package P2多态抽象和接口.d1多态;

public class Teacher extends People {
    public String name = "这是子类Teacher的名称";

    @Override
    public void run() {
        System.out.println("老师跑的气喘吁吁");
    }
}
