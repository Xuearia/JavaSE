package P2多态抽象和接口.d8接口案例;

import java.util.ArrayList;

/**
 * 实现 StudentOperator 接口，提供基础的学生信息展示和平均成绩计算功能
 */
public class StudentRealization1 implements StudentOperator {
    /**
     * 重写 showStudent 方法，展示全班学生信息
     * @param list 存储学生对象的 ArrayList
     */
    @Override
    public void showStudent(ArrayList<Student> list) {
        // 遍历学生列表
        for (Student student : list) {
            // 打印每个学生的姓名、性别和成绩
            System.out.println("姓名：" + student.getName() + "，性别：" + student.getSex() + "，成绩：" + student.getGrade());
        }
    }

    /**
     * 重写 showAverageScore 方法，展示全班学生平均成绩
     * @param list 存储学生对象的 ArrayList
     */
    @Override
    public void showAverageScore(ArrayList<Student> list) {
        // 用于存储所有学生成绩的总和
        int sum = 0;
        // 用于存储平均成绩
        int avg = 0;
        // 遍历学生列表
        for (Student student : list) {
            // 累加每个学生的成绩到总和中
            sum += student.getGrade();
        }
        // 计算平均成绩
        avg = sum / list.size();
        // 打印平均成绩
        System.out.println("平均成绩为:" + avg);
    }
}