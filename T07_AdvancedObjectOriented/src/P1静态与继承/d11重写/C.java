package P1静态与继承.d11重写;

public class C {
    private String name;
    private int age;

    public C() {
    }

    public C(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "C{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                '}';
    }
}
