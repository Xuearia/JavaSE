package P1静态与继承.d9权限修饰符.test2_package;

import P1静态与继承.d9权限修饰符.Fu;

public class Demo2 extends Fu {
    public static void main(String[] args) {

        Fu f = new Fu();
        //  f.privateMethod(); //无法在外部类调用私有
        //f.method();//在同一个包下可以访问 缺省(这里包不同报错)
        //f.protectedMethod();//报错 子类不能通过父类对象调用 protected 方法，只能通过子类自身调用。
        f.publicMethod();//公开 随意访问

        Demo2 d = new Demo2();
        d.protectedMethod();//这样通过子类自身就可以调用了

    }

    //子类自身创建的方法
    public void test() {
        protectedMethod();//继承后可调用
        //privateMethod();//无法调用
        publicMethod();
        //method(); //无法调用
    }


/*
     //外部类中调用private
     public void callPrivate(){
     privateMethod();//外部类无法访问(报错)
    }
*/
}
