package test9_简单日期格式;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat_Demo {
    public static void main(String[] args) throws ParseException {
        //日期格式化
        //字母含义(横) yyyy(年) MM(月) dd(日) HH(24小时制) hh(12小时制) mm(分) ss(秒) S(毫秒) E(星期) a(上午/下午) w(周)

        //打印当前时间
        System.out.println("--------当前时间---------");
        Date date = new Date();
        System.out.println(date);

        //格式化日期
        System.out.println("--------格式化时间---------");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a w ");
        //format():将时间格式化成字符串
        String strDate = sdf.format(date);
        System.out.println(strDate);

        //将字符串转换为日期
        System.out.println("--------字符串转日期---------");
        String str = "2020-05-05 09:09:09 星期五 下午 5";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a w");
       //parse:将字符串解析成日期
        Date date1 = sdf1.parse(str);
        System.out.println(date1);

    }
}
