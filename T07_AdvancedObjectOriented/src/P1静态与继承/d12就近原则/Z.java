package P1静态与继承.d12就近原则;

public class Z extends F {
    String name = "子类名称";

    public void printf2() {
        String name = "局部名称";
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    @Override
    public void printf1() {
        System.out.println("重写后的子类printf1方法");
    }
}
