package P2多态抽象和接口.d4抽象abstract;

public abstract class A {
    private String name;
    public static int age;

    //抽象方法
    public abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        A.age = age;
    }
}
