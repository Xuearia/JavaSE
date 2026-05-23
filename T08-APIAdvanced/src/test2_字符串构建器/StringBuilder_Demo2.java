package test2_字符串构建器;

public class StringBuilder_Demo2 {
    public static void main(String[] args) {
        //目标:掌握StringBuilder的好处
        //需求:拼接100万次abc
/*

       String s = "";
        for (int i = 1; i <= 1000000; i++) {
            s += "abc";

        }
        System.out.println(s); //效率非常非常慢全部运行完大概3~ 5分钟
*/


        //用tringBuilder
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 1000000; i++) {
            sb.append("abc");
        }
        System.out.println(sb);//效率非常快,运行完1~3秒内;
    }
}
