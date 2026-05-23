package P1静态与继承.d14练习.公司;

// 测试类，用于测试Manager类和Programmer类的功能
public class Test {
    public static void main(String[] args) {
        // 创建Manager对象，传入姓名、工号、工资和奖金
        Manager m1 = new Manager("张三", "001", 13000, 2000);
        // 创建Programmer对象，传入姓名、工号和工资
        Programmer p1 = new Programmer("李四", "003", 15000);

        // 调用程序员对象的work方法，输出程序员工作描述
        p1.work();
        // 调用项目经理对象的work方法，输出项目经理工作描述
        m1.work();
    }
}