package test5_RegularExpression;

import java.util.Arrays;

public class RegexTest5 {
    public static void main(String[] args) {
/**
 * 目标：掌握使用正则表达式做搜索替换，内容分割。
 * 这里以动漫人物相关字符串为例，演示正则表达式在字符串处理中的应用。
 */

        // 1、public String replaceAll(String regex, String newStr)：按照正则表达式匹配的内容进行替换
        // 需求1：请把下面字符串中的不是动漫人物名字相关字符的部分替换为 “-”
        String s1 = "漩涡鸣人abc123宇智波佐助xyz666春野樱def999";
        // 使用正则表达式 \\W+ 匹配非单词字符（即不是字母、数字、下划线的字符），并替换为 “-”
        String replacedS1 = s1.replaceAll("\\w+", "-");
        System.out.println("将非动漫人物名字相关字符替换后的字符串: " + replacedS1);

        // 需求2(拓展)：某语音系统，收到一个口吃的人说的“我我我喜欢编编编编编编编编编编编编程程程！”，需要优化成“我喜欢编程！”。
        String s2 = "我我我喜欢编编编编编编编编编编编编程程程";
       /* *
       * (.)一组:.匹配任意字符的。
       * 1:为这个组声明一个组号:1号
       * +:声明必须是重复的字
       * $1可以去到第1组代表的那个重复的字
        */
        String replacedS2 = s2.replaceAll("(.)\\1+", "$1");
        System.out.println("优化后的字符串: " + replacedS2);

        // 2、public String[] split(String regex)：按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组。
        // 需求1：请把下面字符串中的动漫人物名字取出来，使用切割来做
        String s3 = "蒙奇fsfasf路飞abc8888宇智波鼬xyz7777我爱罗def5555";
        // 使用正则表达式 \\W+ 匹配非单词字符（即不是字母、数字、下划线的字符），以此来分割字符串提取动漫人物名字
        String[] names = s3.split("\\w+");
        System.out.println("提取出的动漫人物名字数组: " + Arrays.toString(names));
    }
}

