package P1静态与继承.d14练习.公司;

// 定义公共属性类，用于抽取经理和程序员共有的属性和方法
public class PublicAttribute {
    private String name;// 表示姓名
    private String jobNumber;// 表示工号
    private double money;// 表示工资

    // 无参构造方法，默认初始化对象
    public PublicAttribute() {
    }

    // 构造方法，用于初始化对象的姓名、工号和工资属性
    public PublicAttribute(String name, String jobNumber, double money) {
        this.name = name;
        this.jobNumber = jobNumber;
        this.money = money;
    }

    // 获取姓名的方法
    public String getName() {
        return name;
    }

    // 设置姓名的方法
    public void setName(String name) {
        this.name = name;
    }

    // 获取工号的方法
    public String getJobNumber() {
        return jobNumber;
    }

    // 设置工号的方法
    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    // 获取工资的方法
    public double getMoney() {
        return money;
    }

    // 设置工资的方法
    public void setMoney(double money) {
        this.money = money;
    }

    // 定义通用的工作方法，被子类重写以实现具体工作描述
    public void work() {
        System.out.println("正在工作");
    }
}