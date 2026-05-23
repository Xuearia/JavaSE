package test3_method_references;

import java.util.Arrays;

public class d2_SpecificTypeOfMethodApplicationTest2 {
    public static void main(String[] args) {
        String[] names = {"boby", "angela", "Andy", "dlei", "caocao", "Babo", "jack", "Cici"};

        Arrays.sort(names);
        // 要求忽略首字符大小写进行排序。
//        Arrays.sort(names, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                // 制定比较规则。o1 = "Andy"  o2 = "angela"
//                return o1.compareToIgnoreCase(o2);//compareToIgnoreCase: 忽略大小写比较
//            }
//        });

        //简化
        // Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));

        //特定类型的引用方法
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));

    }
}
