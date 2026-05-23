package T02String_API.String_Demonstration;

public class code1_StringDemo1 {
    public static void main(String[] args) {
        //目标：掌握创建 String 对象，并封装要处理的字符串的两种方式。
        //1、直接双引号得到字符串对象，封装字符串数据

        String s = "abcde";
        System.out.println(s);

        //2、newString 创建字符串对象，并调用构造器初始化字符串
        String rs1 = new String();
        System.out.println(rs1);//空白字符串

        String rs2 = new String("czk");//不推荐
        System.out.println(rs2);

        char[] char1 = {'c','正','楷'};
        String rs3 = new String(char1);
        System.out.println(rs3);

        byte[] char2 = {97,98,99};
        String rs4 = new String(char2);
        System.out.println(rs4);
    }
}
