package test3_method_references;

import java.util.ArrayList;

public class d5_toString {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三", 17, "101"));
    }
}

class Student {
    private String name;
    private Integer age;
    private String classroom;

    public Student() {
    }
    public Student(String name, Integer age, String classroom) {
        this.name = name;
        this.age = age;
        this.classroom = classroom;
    }
    public String getClassroom() {
        return classroom;
    }
    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


}
