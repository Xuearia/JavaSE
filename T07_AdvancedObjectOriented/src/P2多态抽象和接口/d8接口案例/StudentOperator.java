package P2多态抽象和接口.d8接口案例;

import java.util.ArrayList;

/**
 * 定义学生信息操作的接口，规定了展示学生信息和展示平均成绩的方法
 * 不同的实现类将根据这个接口实现不同的业务逻辑
 */
public interface StudentOperator {
    /**
     * 展示全班学生信息的抽象方法
     * @param list 存储学生对象的 ArrayList
     */
    void showStudent(ArrayList<Student> list);

    /**
     * 展示全班学生平均成绩的抽象方法
     * @param list 存储学生对象的 ArrayList
     */
    void showAverageScore(ArrayList<Student> list);

}