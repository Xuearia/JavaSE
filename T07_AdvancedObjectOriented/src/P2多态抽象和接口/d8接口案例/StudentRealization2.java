package P2多态抽象和接口.d8接口案例;

import java.util.ArrayList;

/**
 * 实现 StudentOperator 接口，在基础功能上进行扩展，增加男女人数统计和去掉最高分最低分计算平均分功能
 */
public class StudentRealization2 implements StudentOperator {
    /**
     * 重写 showStudent 方法，展示全班学生信息并统计男女人数
     * @param list 存储学生对象的 ArrayList
     */
    @Override
    public void showStudent(ArrayList<Student> list) {
        // 用于统计男生人数
        int maleCount = 0;
        // 用于统计女生人数
        int femaleCount = 0;
        // 遍历学生列表
        for (Student student : list) {
            // 打印每个学生的姓名、性别和成绩
            System.out.println("姓名：" + student.getName() + "，性别：" + student.getSex() + "，成绩：" + student.getGrade());
            // 根据学生性别统计男女生人数
            if (student.getSex() == '男') {
                maleCount++;
            } else {
                femaleCount++;
            }
        }
        // 打印男生人数、女生人数和班级总人数
        System.out.println("男生人数：" + maleCount + "，女生人数：" + femaleCount + "，班级总人数：" + list.size());
    }

    /**
     * 重写 showAverageScore 方法，展示去掉最高分和最低分后的全班学生平均成绩
     * @param list 存储学生对象的 ArrayList
     */
    @Override
    public void showAverageScore(ArrayList<Student> list) {
        // 用于存储所有学生成绩的总和
        int sum = 0;
        // 用于存储平均成绩
        int avg = 0;
        // 初始化最低分，先取列表中第一个学生的成绩
        int min = list.get(0).getGrade();
        // 初始化最高分，先取列表中第一个学生的成绩
        int max = list.get(0).getGrade();
        // 遍历学生列表
        for (Student student : list) {
            // 累加每个学生的成绩到总和中
            sum += student.getGrade();
            // 比较当前学生成绩和最高分，更新最高分
            if (student.getGrade() > max) {
                max = student.getGrade();
            }
            // 比较当前学生成绩和最低分，更新最低分
            if (student.getGrade() < min) {
                min = student.getGrade();
            }
        }
        // 计算去掉最高分和最低分后的平均成绩
        avg = (sum - min - max) / (list.size() - 2);
        // 打印去掉最高分和最低分后的平均成绩
        System.out.println("去掉最高分和最低分后的平均成绩为:" + avg);
    }
}