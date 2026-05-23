package P2多态抽象和接口.d99练习.电视;

import java.util.Scanner;

public class RemoteControl {
    public void controlTV(TV tv) {
        System.out.println("遥控器控制电视");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电视节目:");
        String program = sc.next();
        tv.play(program);
    }
}
