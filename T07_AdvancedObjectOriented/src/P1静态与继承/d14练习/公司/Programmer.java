package P1静态与继承.d14练习.公司;

// 定义程序员类Programmer，继承自公共属性类PublicAttribute
public class Programmer extends PublicAttribute {

    // 无参构造方法，目前为空，无实际初始化逻辑，可根据情况决定是否保留
    public Programmer() {
    }

    // 构造方法，用于初始化程序员对象，调用父类构造方法初始化继承的属性（姓名、工号、工资）
    public Programmer(String name, String jobNumber, double money) {
        super(name, jobNumber, money);
    }

    // 重写父类的work方法，实现程序员特有的工作描述输出
    @Override
    public void work() {
        // 使用格式化输出，展示程序员的工号、姓名、工资，以及工作状态
        System.out.printf("工号为%s的%s程序员,拿着%.0f的工资,正在苦逼的写代码\n",
                getJobNumber(), getName(), getMoney());
    }
}