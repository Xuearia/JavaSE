package P2多态抽象和接口.d8接口案例;

import java.util.ArrayList;

/**
 * 班级管理类，负责学生数据的初始化和方案的选择
 */
public class ClassManager {
    // 存储学生对象的 ArrayList
    private ArrayList<Student> list = new ArrayList<>();
    // 学生信息操作接口的引用，用于实现不同方案的切换
    private StudentOperator studentOperator;

    /**
     * 构造方法，初始化学生列表并选择默认的方案
     */
    public ClassManager() {
        // 添加学生信息到列表中
        list.add(new Student("张三", '男', 80));
        list.add(new Student("李四", '女', 90));
        list.add(new Student("王五", '男', 70));
        list.add(new Student("赵六", '女', 85));
        // 默认选择 StudentRealization2 方案
        studentOperator = new StudentRealization2();
    }

    /**
     * 展示全班学生信息的方法，委托给 studentOperator 执行
     */
    public void showStudent() {
        studentOperator.showStudent(list);
    }

    /**
     * 展示全班学生平均成绩的方法，委托给 studentOperator 执行
     */
    public void showAverageScore() {
        studentOperator.showAverageScore(list);
    }
}