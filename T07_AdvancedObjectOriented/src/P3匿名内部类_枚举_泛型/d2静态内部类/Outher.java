package P3匿名内部类_枚举_泛型.d2静态内部类;

public class Outher {
    private int age;
    public static String schoolName;

    public static class Inner {
        private String name;
        public static int a;


        public static void test() {
            System.out.println("访问");
        }

        public void setName(String name) {
            this.name = name;
        }

        public static void setA(int a) {
            Inner.a = a;
        }

        public String getName() {
            return name;
        }

        public static int getA() {
            return a;
        }

        public static void test2() {
            System.out.println(schoolName);
            //System.out.println(age);用外部类才能访问

            System.out.println(Inner.a);
        }

    }
}
