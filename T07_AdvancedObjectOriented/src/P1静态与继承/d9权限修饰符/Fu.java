package P1静态与继承.d9权限修饰符;

public class Fu {
    //private私有:只能在本类中访问
    private void privateMethod() {
        System.out.println("==private==");
    }

    //2.缺省:本类,同一个包下的类可以访问
    void method() {
        System.out.println("==缺省==");
    }

    //3.protected:本类,同一个包下的类,任意包下继承父类的子类可以访问
    protected void protectedMethod() {
        System.out.println("==protected==");
    }

    //public公开:本类,任何包和任何包下的子类都可以访问
    public void publicMethod() {
        System.out.println("== public==");
    }

    //本类中调用private
    public void callPrivate(){
        privateMethod();//本部类可以访问合法
    }
}
