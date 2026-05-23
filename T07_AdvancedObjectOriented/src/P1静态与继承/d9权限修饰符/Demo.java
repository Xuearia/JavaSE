package P1静态与继承.d9权限修饰符;

public class Demo {
    public static void main(String[] args) {

        Fu f = new Fu();
        //  f.privateMethod(); //无法在外部类调用私有
        f.method();//在同一个包下可以访问 缺省
        f.protectedMethod();//在同一个包下可以访问 protected
        f.publicMethod();//公开 随意访问

    }



/*
     //外部类中调用private
     public void callPrivate(){
     privateMethod();//外部类无法访问(报错)
    }
*/
}
