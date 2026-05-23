package 泛型.综合练习;

public abstract class 动物 {
    private String name;
    private Integer age;

    public 动物() {
    }
    public 动物(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    //eat吃的方法
    public abstract void eat();
}
