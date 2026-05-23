package P1静态与继承.d14练习.公司;

// 定义项目经理类Manager，继承自公共属性类PublicAttribute
public class Manager extends PublicAttribute {
    private double bonus;// 表示项目经理的奖金

    // 构造方法，仅初始化奖金属性，可能存在问题，一般建议同时初始化从父类继承的属性
    public Manager(double bonus) {
        this.bonus = bonus;
    }

    // 构造方法，用于初始化项目经理对象，调用父类构造方法初始化继承的属性（姓名、工号、工资），并初始化自身的奖金属性
    public Manager(String name, String jobNumber, double money, double bonus) {
        super(name, jobNumber, money);
        this.bonus = bonus;
    }

    // 重写父类的work方法，实现项目经理特有的工作描述输出
    @Override
    public void work() {
        // 使用格式化输出，展示项目经理的工号、姓名、工资和奖金，以及工作状态
        System.out.printf("工号为%s的%s项目经理,拿着%.0f的工资和%.0f的奖金,正在盯着程序员写代码\n",
                getJobNumber(), getName(), getMoney(), this.bonus);
    }
}