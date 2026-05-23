package test5_RegularExpression;

public class RegexTest2 {
    public static void main(String[] args) {
        // 1、字符类(只能匹配单个字符)
        System.out.println("===== 字符类测试 =====");
        // [abc] 只能匹配 a、b、c 中的任意一个字符
        System.out.println("测试 [abc] 匹配 'a': " + "a".matches("[abc]")); // 结果: true
        System.out.println("测试 [abcd] 匹配 'e': " + "e".matches("[abcd]")); // 结果: false

        // [^abc] 不能是 a、b、c 中的任意一个字符
        System.out.println("测试 [^abc] 匹配 'd': " + "d".matches("[^abc]")); // 结果: true
        System.out.println("测试 [^abc] 匹配 'a': " + "a".matches("[^abc]")); // 结果: false

        // [a-zA-Z] 只能是 a - z 或 A - Z 的字符
        System.out.println("测试 [a-zA-Z] 匹配 'b': " + "b".matches("[a-zA-Z]")); // 结果: true
        System.out.println("测试 [a-zA-Z] 匹配 '2': " + "2".matches("[a-zA-Z]")); // 结果: false

        // [a-z&&[^bc]] 是 a 到 z 的字符，但排除 b 和 c
        System.out.println("测试 [a-z&&[^bc]] 匹配 'k': " + "k".matches("[a-z&&[^bc]]")); // 结果: true
        System.out.println("测试 [a-z&&[^bc]] 匹配 'b': " + "b".matches("[a-z&&[^bc]]")); // 结果: false

        // 注意：以上带 [内容] 的规则都只能用于匹配单个字符
        System.out.println("测试 [a-zA-Z0-9] 匹配 'ab': " + "ab".matches("[a-zA-Z0-9]")); // 结果: false

        // 2、预定义字符(只能匹配单个字符)  .  \d  \D   \s  \S  \w  \W
        System.out.println("\n===== 预定义字符测试 =====");
        // . 可以匹配任意字符
        System.out.println("测试 . 匹配 '徐': " + "徐".matches(".")); // 结果: true
        System.out.println("测试 . 匹配 '徐徐': " + "徐徐".matches(".")); // 结果: false

        // \d: 匹配 0 - 9 的数字
        System.out.println("测试 \\d 匹配 '3': " + "3".matches("\\d")); // 结果: true
        System.out.println("测试 \\d 匹配 'a': " + "a".matches("\\d")); // 结果: false

        // \s: 代表一个空白字符
        System.out.println("测试 \\s 匹配 ' ': " + " ".matches("\\s")); // 结果: true
        System.out.println("测试 \\s 匹配 'a': " + "a".matches("\\s")); // 结果: false

        // \S: 代表一个非空白字符
        System.out.println("测试 \\S 匹配 'a': " + "a".matches("\\S")); // 结果: true
        System.out.println("测试 \\S 匹配 ' ': " + " ".matches("\\S")); // 结果: false

        // \w: 等价于 [a-zA-Z_0-9]
        System.out.println("测试 \\w 匹配 'a': " + "a".matches("\\w")); // 结果: true
        System.out.println("测试 \\w 匹配 '_': " + "_".matches("\\w")); // 结果: true
        System.out.println("测试 \\w 匹配 '徐': " + "徐".matches("\\w")); // 结果: false

        // \W: 等价于 [^\w]，不能是 a-zA-Z_0-9
        System.out.println("测试 \\W 匹配 '徐': " + "徐".matches("\\W")); // 结果: true
        System.out.println("测试 \\W 匹配 'a': " + "a".matches("\\W")); // 结果: false

        // 注意：以上预定义字符都只能匹配单个字符
        System.out.println("测试 \\d 匹配 '23232': " + "23232".matches("\\d")); // 结果: false

        // 3、数量词： ?   *   +   {n}   {n, }  {n, m}
        System.out.println("\n===== 数量词测试 =====");
        // ? 代表 0 次或 1 次
        System.out.println("测试 \\w? 匹配 'a': " + "a".matches("\\w?")); // 结果: true
        System.out.println("测试 \\w? 匹配 '': " + "".matches("\\w?")); // 结果: true
        System.out.println("测试 \\w? 匹配 'abc': " + "abc".matches("\\w?")); // 结果: false

        // * 代表 0 次或多次
        System.out.println("测试 \\w* 匹配 'abc12': " + "abc12".matches("\\w*")); // 结果: true
        System.out.println("测试 \\w* 匹配 '': " + "".matches("\\w*")); // 结果: true
        System.out.println("测试 \\w* 匹配 'abc12张': " + "abc12张".matches("\\w*")); // 结果: false

        // + 代表 1 次或多次
        System.out.println("测试 \\w+ 匹配 'abc12': " + "abc12".matches("\\w+")); // 结果: true
        System.out.println("测试 \\w+ 匹配 '': " + "".matches("\\w+")); // 结果: false
        System.out.println("测试 \\w+ 匹配 'abc12张': " + "abc12张".matches("\\w+")); // 结果: false

        // {3} 代表要正好是 3 次
        System.out.println("测试 \\w{3} 匹配 'a3c': " + "a3c".matches("\\w{3}")); // 结果: true
        System.out.println("测试 \\w{3} 匹配 'abcd': " + "abcd".matches("\\w{3}")); // 结果: false

        // {3,} 代表是 >=3 次
        System.out.println("测试 \\w{3,} 匹配 'abcd': " + "abcd".matches("\\w{3,}")); // 结果: true
        System.out.println("测试 \\w{3,} 匹配 'ab': " + "ab".matches("\\w{3,}")); // 结果: false
        System.out.println("测试 \\w{3,} 匹配 'abcde徐': " + "abcde徐".matches("\\w{3,}")); // 结果: false

        // {3, 9} 代表是  大于等于 3 次，小于等于 9 次
        System.out.println("测试 \\w{3,9} 匹配 'abc232d': " + "abc232d".matches("\\w{3,9}")); // 结果: true

        // 4、其他几个常用的符号：(?i)忽略大小写 、 或：| 、  分组：()
        System.out.println("\n===== 其他常用符号测试 =====");
        // (?i) 忽略大小写
        System.out.println("测试 (?i)abc 匹配 'abc': " + "abc".matches("(?i)abc")); // 结果: true
        System.out.println("测试 (?i)abc 匹配 'ABC': " + "ABC".matches("(?i)abc")); // 结果: true
        System.out.println("测试 a((?i)b)c 匹配 'aBc': " + "aBc".matches("a((?i)b)c")); // 结果: true
        System.out.println("测试 a((?i)b)c 匹配 'ABc': " + "ABc".matches("a((?i)b)c")); // 结果: false

        // 需求 1：要求要么是 3 个小写字母，要么是 3 个数字。
        System.out.println("测试 [a-z]{3}|\\d{3} 匹配 'abc': " + "abc".matches("[a-z]{3}|\\d{3}")); // 结果: true
        System.out.println("测试 [a-z]{3}|\\d{3} 匹配 'ABC': " + "ABC".matches("[a-z]{3}|\\d{3}")); // 结果: false
        System.out.println("测试 [a-z]{3}|\\d{3} 匹配 '123': " + "123".matches("[a-z]{3}|\\d{3}")); // 结果: true
        System.out.println("测试 [a-z]{3}|\\d{3} 匹配 'A12': " + "A12".matches("[a-z]{3}|\\d{3}")); // 结果: false

        // 需求 2：必须是”我爱“开头，中间可以是至少一个”编程“，最后至少是 1 个”666“
        System.out.println("测试 我爱(编程)+(666)+ 匹配 '我爱编程编程666666': " + "我爱编程编程666666".matches("我爱(编程)+(666)+")); // 结果: true
        System.out.println("测试 我爱(编程)+(666)+ 匹配 '我爱编程编程66666': " + "我爱编程编程66666".matches("我爱(编程)+(666)+")); // 结果: false
    }
}