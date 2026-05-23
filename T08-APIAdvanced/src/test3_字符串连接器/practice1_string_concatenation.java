package test3_字符串连接器;

import java.util.StringJoiner;

public class practice1_string_concatenation {
    public static void main(String[] args) {
        int[] a = {12, 13, 14, 15};
        System.out.println(splicing(a));
    }

    public static String splicing(int[] arr) {
        if (arr == null) {
            return null;
        }
        StringJoiner s = new StringJoiner(",", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            //s.add(String.valueOf(arr[i]));//添加数据并转成字符串
            s.add((arr[i] + ""));
        }

        return s.toString();

    }
}
