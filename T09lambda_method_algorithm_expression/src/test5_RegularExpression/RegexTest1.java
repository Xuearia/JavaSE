package test5_RegularExpression;

public class RegexTest1 {
    public static void main(String[] args) {
        //目标：体验一下使用正则表达式来校验数据格式的合法性。
        //需求：校验 QQ 号码是否正确，要求全部是数字，长度是 (6-20) 之间，不能以 0 开头。

        //1.自己写程序校验
        System.out.println(RegexQQ(""));
        System.out.println(RegexQQ("2rt1h48g19"));
        System.out.println(checkQQ("2316048519"));

        //2.正则表达式
        System.out.println(RegexQQ(""));
        System.out.println(RegexQQ("2rt1h48g19"));
        System.out.println(RegexQQ("2316048519"));

    }

    public static boolean RegexQQ(String qq) {
        return qq != null && qq.matches("[1-9]\\d{5,19}");
    }

    public static boolean checkQQ(String qq) {
        //1.判断qq号码是否为null
        if (qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20) {
            return false;
        }
        //2.qq至少是不是null,不是以0开头的,满足6-20之间的长度。
        //判断是否都为数字
        for (int i = 0; i < qq.length(); i++) {
            //根据索引提取当前位置的字符
            char c = qq.charAt(i);
            //判断字符是否为数字,如果不是数字就返回false
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
