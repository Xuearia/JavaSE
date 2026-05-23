package 泛型.泛型接口.任意泛型;

public class ListTest {
    public static void main(String[] args) {
        /**
         * 泛型接口的两种使用方式:1.实现类给出具体的类型
         * 2.实现类延续泛型，创建实现类对象时再确定类型*/

       MyArryList ml = new MyArryList();
        ml.add("这是String类型");//不给予类型，默认为Object类型

        MyArryList<Integer> ml2 = new MyArryList<>();
        ml2.add(11);

    }
}
