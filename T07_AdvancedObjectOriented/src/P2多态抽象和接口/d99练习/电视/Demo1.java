package P2多态抽象和接口.d99练习.电视;

public class Demo1 {
    public static void main(String[] args) {
        TV tv = new TV("东方卫视");
        RemoteControl rc = new RemoteControl();
        rc.controlTV(tv);
    }
}
