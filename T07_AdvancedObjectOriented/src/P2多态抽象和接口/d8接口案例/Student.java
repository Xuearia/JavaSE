package P2多态抽象和接口.d8接口案例;

/**
 * 学生类，用于封装学生的基本信息
 */
public class Student {
    // 学生姓名，使用 private 修饰，保证数据封装性
    private String name;
    // 学生性别，使用 private 修饰，保证数据封装性
    private char sex;
    // 学生成绩，使用 private 修饰，保证数据封装性
    private int grade;

    /**
     * 构造方法，用于初始化学生对象的姓名、性别和成绩
     * @param name 学生姓名
     * @param sex 学生性别
     * @param grade 学生成绩
     */
    public Student(String name, char sex, int grade) {
        this.name = name;
        this.sex = sex;
        this.grade = grade;
    }

    /**
     * 获取学生姓名的方法
     * @return 学生姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学生姓名的方法
     * @param name 要设置的姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取学生性别的方法
     * @return 学生性别
     */
    public char getSex() {
        return sex;
    }

    /**
     * 设置学生性别的方法
     * @param sex 要设置的性别
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * 获取学生成绩的方法
     * @return 学生成绩
     */
    public int getGrade() {
        return grade;
    }

    /**
     * 设置学生成绩的方法
     * @param grade 要设置的成绩
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }
}