package test4_CollectionSet;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Student 类表示一个学生实体，包含姓名、年龄和身高等属性。
 * 此类用于演示如何在集合中存储自定义对象，并支持根据对象内容进行去重。
 * <p>
 * 学习目标：
 * 1. 掌握如何正确重写 equals(Object o) 方法以定义对象相等性。
 * 2. 掌握如何正确重写 hashCode() 方法以确保与 equals 的一致性。
 * 3. 理解 Double.compare(double a, double b) 在比较浮点数时的作用。
 * 4. 使用 Objects.equals(Object a, Object b) 安全比较字符串，避免空指针异常。
 * 5. 理解 HashSet 是如何利用 hashCode 和 equals 实现元素唯一性的。
 */
//需要实现Comparable接口 才能排序
public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double height;

    public Student() {
    }

    //输入com 快速生成
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;//升序
    }

//alt+ins选择equals() 和 hashCode()快速生成

    /**
     * 重写equals方法，用于比较两个对象是否相等
     * 这个方法被设计用于比较两个Student对象是否相等
     *
     * @param o 被比较的对象
     * @return 如果两个对象相等返回true，否则返回false
     */
    @Override
    public boolean equals(Object o) {
        // 自反性：同一对象必相等
        if (this == o) return true;
        // 空对象或类型不一致则不相等
        if (o == null || getClass() != o.getClass()) return false;
        // 转为Student并比较字段
        Student student = (Student) o;
        // 比较基本类型字段（int、double）和引用类型字段（String）
        return age == student.age// 基本类型字段比较
                && Double.compare(height, student.height) == 0 && Objects.equals(name, student.name);
    }

    /**
     * 重写hashCode方法，生成对象的哈希码
     * 这个方法被设计用于配合equals方法，用于集合操作（如在HashMap或HashSet中作为键）
     *
     * @return 对象的哈希码
     */
    @Override
    public int hashCode() {
        // 根据equals中使用的字段生成哈希码,一样的内容 生成相同的哈希码
        return Objects.hash(name, age, height);
    }

    //自定义排序规则


    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", age=" + age + ", height=" + height + '}';
    }
}

