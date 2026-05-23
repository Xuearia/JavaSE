package test2_Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class StringLengthSorting {
    public static void main(String[] args) {
        String[] strs = {"aaa", "a", "aaaa","aaaaaa","aaaaa"};

        //Arrays.sort(strs, (o1, o2) -> o1.length() - o2.length());

        Arrays.sort(strs , new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(Arrays.toString(strs));

    }
}
