package T02String_API.String_Demonstration;

public class code2_StringDemo2 {
    public static void main(String[] args) {

        String re = "xiao楷真帅";
        //1.快速获取字符串长度
        System.out.println(re.length());//返回7表示有7个字符

        System.out.println("----------------------");

        // 2、提取字符串中某个索引位置处的字符
        //比如我想把re里的"楷"提取,索引为4
        char c = re.charAt(4);
        System.out.println(c);

        System.out.println("----------------------");

        //字符串的遍历
        for (int i = 0; i < re.length(); i++) {
            //i = 0 1 2 3 4 5 6
            char ch = re.charAt(i);
            System.out.println(ch);
        }
        System.out.println("");

        //3.把字符串转换成字符数组,在进行遍历
        char[] chars = re.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();

        //4.判断字符串与另一个字符串是否相等,相等则返回true
        String s1 = new String("楷楷");
        String s2 = new String("楷楷");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

        System.out.println("----------------------");

        //5.忽略大小写判断当前字符串是否与另一个字符串内容是否一样
        String c1 = new String("czk");
        String c2 = new String("Czk");
        System.out.println(c1.equals(c2));//false
        System.out.println(c1.equalsIgnoreCase(c2));//true

        System.out.println("----------------------");

        //6.从传入的索引处截取字符串内容(包前不包后)
        String s3 = "Java是世界上最好的编程语言之一";
        String rs1 = s3.substring(0, 8);//0 - 8个字符,不包括8
        String rs2 = s3.substring(9, 17);
        System.out.println(rs1);
        System.out.println(rs2);

        //7.从传入的索引直接截取到末尾字符串返回
        String rs3 = s3.substring(5);
        System.out.println(rs3);
        System.out.println("----------------------");

        //8.把字符串的内容替换成新内容,并返回新的字符串对象给我们
        String info = "这个电影简直是个垃圾,垃圾电影!!";
        String rs4 = info.replace("垃圾", "**");
        System.out.println(info);
        System.out.println(rs4);

        System.out.println("----------------------");

        //9.判断字符串好中是否包含了某个字符串
        // String font1=  "世界";
        boolean rs5 = s3.contains("Java");
        System.out.println(s3.contains("Java"));
        System.out.println(s3.contains("Java1"));
        System.out.println(rs5);
        System.out.println("----------------------");

        // 10、判断字符串是否以某个字符串开头。
        String rs6 = "Java,你好";
        System.out.println(rs6.startsWith("J"));
        System.out.println(rs6.startsWith("Java"));
        System.out.println(rs6.startsWith("你好"));
        System.out.println(rs6.startsWith("你好", 5));
        System.out.println("----------------------");

        //11.把字符串按照某个字符串内容分割,并返回字符串数组回来
        String str1 = "小瀚,阿伟,小楷";
        String[] split = str1.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        //12,反转字符串并1返回
        String number = "12345";
        //根据参数字符串对象s创建一个新的StringBuilder对象sb
        StringBuilder sb = new StringBuilder(number);
        //把StringBuilder对象中的内容反转
        sb.reverse();
        //把StringBuilder对象中的内容再转换成一个新的字符串
        String newStr = sb.toString();
        System.out.println(newStr);

    }
}

