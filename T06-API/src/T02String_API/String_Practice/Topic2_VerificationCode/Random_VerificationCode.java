package T02String_API.String_Practice.Topic2_VerificationCode;

import java.util.Random;

/**
 * 生成随机验证码的类
 */
public class Random_VerificationCode {
    /**
     * 主函数入口
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 实现随机产生验证码，验证码的每位可能是数字、大写字母、小写字母
        System.out.println(RandomNumber(10));
    }

    /**
     * 生成指定长度的随机验证码
     *
     * @param input 验证码的长度
     * @return 生成的验证码字符串
     */
    public static String RandomNumber(int input) {
        // 初始化验证码字符串
        String codes = "";
        // 定义验证码字符集，包括数字、大写字母、小写字母
        String value = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        // 创建Random对象用于生成随机数
        Random index = new Random();
        // 循环生成验证码的每一位
        for (int i = 0; i < input; i++) {
            // 生成随机索引以选择字符集中的字符
            int res = index.nextInt(value.length());
            // 将选中的字符添加到验证码字符串中
            codes += value.charAt(res);
        }
        // 返回生成的验证码字符串
        return codes;
    }
}
