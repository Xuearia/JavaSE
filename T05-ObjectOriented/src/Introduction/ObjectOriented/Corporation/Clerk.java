package Introduction.ObjectOriented.Corporation;

/*
 * 定义项目经理类Manager。属性：姓名name，工号id，工资salary，奖金bonus。行为：工作work()
 *定义程序员类Coder。属性：姓名name，工号id，工资salary。行为：工作work()
 *
 *工号为123基本工资为15000奖金为6000的项目经理张三正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....
 *工号为135基本工资为10000的程序员李四正在努力的写着代码......
 */
public class Clerk {
    class Manager {
        private String name;
        private String id;
        private double salary;
        private double bonus;

        public Manager() {
        }

        public Manager(String name, String id, double salary, double bonus) {
            this.name = name;
            this.id = id;
            this.salary = salary;
            this.bonus = bonus;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public double getSalary() {
            return salary;
        }

        public double getBonus() {
            return bonus;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }

        //经理的工作类
        public void work() {
            System.out.printf("工号为%s基本工资为%.1f奖金为%.1f的项目经理%s正在努力的做着管理工作,分配任务,检查员工提交上来的代码.....\n", id, bonus, salary, name);
        }
    }
    class Coder{
        private String name;
        private String id;
        private double salary;

        public Coder(){
            
        }
        public Coder(String name, String id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public double getSalary() {
            return salary;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void work(){
            System.out.printf("工号为%s基本工资为%.1f的程序员%s正在努力的写着代码......\n",id,salary,name);
        }
    }

    public static void main(String[] args) {
        Clerk c = new Clerk();
        Manager manager = c.new Manager("张三","123",15000,6000);
        manager.work();
        Coder coder=c.new Coder("李四","135",10000);
        coder.work();
    }
}

