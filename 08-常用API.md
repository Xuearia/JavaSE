# 一. 什么是 API

API 即应用程序接口（Application Programming Interface） ，是一些预先定义的函数、类、接口等的集合。它就像是不同软件组件之间沟通的桥梁，通过规定好的方式让开发者可以调用已有的功能，而无需了解其内部具体实现细节。比如在开发一个打车软件时，调用地图 API 就能直接使用地图相关功能，而不用自己去开发地图绘制、定位等底层功能。

### 1. 为什么要学 API

- **提高开发效率**：避免重复造轮子。像前面提到的，很多常见功能已经有成熟的解决方案，使用 API 直接调用，无需自己重新编写复杂代码。例如开发一个文件上传功能，使用 Java 提供的相关文件操作 API，能快速实现，而不用从底层字节读写等开始编写。
- **保证代码质量**：官方或成熟的第三方 API 经过大量测试和优化，稳定性和可靠性有保障。比如数据库连接 API，其对数据库连接的管理、异常处理等都经过精心设计，比自己编写更安全可靠。
- **促进代码复用和协作**：不同开发者可以基于相同的 API 进行开发，方便代码的复用和团队协作。比如在大型项目中，前端和后端开发人员可以基于统一的接口 API 进行开发，各自专注于自己的模块。



------


# 二- Java String 类常用 API 详解

## (1)、为什么必须学习 String?

#### 字符串是数据交互的核心载体**

- 用户输入与系统输出

  ：几乎所有需要和用户交互的场景都离不开字符串，例如：

  - 登录注册时的用户名、邮箱、密码（需校验格式、长度等）。
  - 电商系统中的商品名称、地址、订单编号（需拼接、格式化）。
  - 日志系统中的文本记录（需解析、过滤关键词）。

- **案例**：
  某电商平台需要校验用户输入的邮箱是否合法，可通过 `String` 的 `contains("@")` 和 `endsWith(".com")` 等 API 快速判断格式是否正确。
  
  编辑太卡了![]()

#### 1.字符串是数据存储的基础格式**

- **数据库与文件存储**：数据库中的文本字段（如 `VARCHAR`）、配置文件（如 `properties`、`json`）、日志文件等，本质上都是字符串。
- **案例**：
  从数据库查询用户信息后，需要将结果拼接成 JSON 格式返回给前端，此时会用到 `String` 的 `concat()` 或 `StringBuilder` 的高效拼接能力。

#### 2. **字符串是算法与业务逻辑的基石**

- 文本处理需求

  ：开发中常需对字符串进行切割、替换、截取、加密等操作，例如：

  - 论坛系统过滤敏感词（`replaceAll()` 替换关键词）。
  - 金融系统对卡号进行脱敏处理（截取前几位和后几位，中间用 `*` 替代）。
  - 日志分析时按时间戳拆分日志条目（`split()` 按分隔符切割）。

- **案例**：
  某社交平台需要将用户输入的文本中的脏话替换为 `***`，可通过 `String` 的 `replaceAll("脏话关键词", "***")` 实现。

![](img/08/1662605396550. png)



## (2). 开发中常用到的Sring

| **方法名**                | **方法签名**                                                        | **功能描述**               |
| ---------------------- | --------------------------------------------------------------- | ---------------------- |
| **`length`**           | `int length()`                                                  | 返回字符串的字符数量             |
| **`charAt`**           | `char charAt(int index)`                                        | 获取指定索引位置的字符            |
| **`toCharArray`**      | `char[] toCharArray()`                                          | 将字符串转换为字符数组            |
| **`equals`**           | `boolean equals(Object anObject)`                               | 比较两个字符串内容是否相同，区分大小写    |
| **`equalsIgnoreCase`** | `boolean equalsIgnoreCase(String anotherString)`                | 比较两个字符串内容是否相同，忽略大小写    |
| **`substring`**        | `String substring(int beginIndex, int endIndex)`                | 截取从起始索引到结束索引（不包含）的子字符串 |
| **`substring`**        | `String substring(int beginIndex)`                              | 截取从起始索引到字符串末尾的子字符串     |
| **`replace`**          | `String replace(CharSequence target, CharSequence replacement)` | 用新内容替换字符串中的指定内容        |
| **`contains`**         | `boolean contains(CharSequence s)`                              | 判断字符串是否包含指定的子字符串       |
| **`startsWith`**       | `boolean startsWith(String prefix)`                             | 判断字符串是否以指定前缀开头         |
| **`endsWith`**         | `boolean endsWith(String suffix)`                               | 判断字符串是否以指定后缀结尾         |
| **`split`**            | `String[] split(String regex)`                                  | 根据指定分隔符将字符串分割成字符串数组    |
| **`trim`**             | `String trim()`                                                 | 去除字符串首尾的空白字符           |




#### 1. 获取字符串长度

`length()` 方法用于返回字符串的长度，即字符串中字符的个数。
```java
public class StringLengthExample {
    public static void main(String[] args) {
        String re = "xiao楷真帅";
        // 快速获取字符串长度
        System.out.println(re.length()); // 返回 7 表示有 7 个字符
    }
}
```
#### 2. 提取字符串中某个索引位置处的字符

`charAt(int index)` 方法可以获取字符串中指定索引位置的字符，索引从 0 开始。

```java
public class StringCharAtExample {
    public static void main(String[] args) {
        String re = "xiao楷真帅";
        // 提取字符串中某个索引位置处的字符
        // 比如我想把 re 里的 "楷" 提取，索引为 4
        char c = re.charAt(4);
        System.out.println(c);
    }
}
```

#### 3. 字符串的遍历

可以使用 `for` 循环结合 `charAt()` 方法遍历字符串中的每个字符。也可以先将字符串转换为字符数组，再进行遍历。
```java
public class StringTraversalExample {
    public static void main(String[] args) {
        String re = "xiao楷真帅";
        // 字符串的遍历
        for (int i = 0; i < re.length(); i++) {
            // i = 0 1 2 3 4 5 6
            char ch = re.charAt(i);
            System.out.println(ch);
        }
        System.out.println();

        // 把字符串转换成字符数组，再进行遍历
        char[] chars = re.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);
        }
        System.out.println();
    }
}

```




#### 4. 判断字符串与另一个字符串是否相等

`equals(Object anObject)` 方法用于比较两个字符串的内容是否相等，`==` 比较的是两个字符串对象的引用是否相同。
```java
public class StringEqualsExample {
    public static void main(String[] args) {
        // 判断字符串与另一个字符串是否相等，相等则返回 true
        String s1 = new String("楷楷");
        String s2 = new String("楷楷");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true
    }
}
```

#### 5. 忽略大小写判断字符串内容是否一样

`equalsIgnoreCase(String anotherString)` 方法用于忽略大小写比较两个字符串的内容是否相等。
```java
public class StringEqualsIgnoreCaseExample {
    public static void main(String[] args) {
        // 忽略大小写判断当前字符串是否与另一个字符串内容是否一样
        String c1 = new String("czk");
        String c2 = new String("Czk");
        System.out.println(c1.equals(c2)); // false
        System.out.println(c1.equalsIgnoreCase(c2)); // true
    }
}
```

#### 6. 截取字符串

`substring(int beginIndex, int endIndex)` 方法用于从指定的起始索引截取到结束索引（包前不包后），`substring(int beginIndex)` 方法用于从指定索引截取到字符串末尾。
```java
public class StringSubstringExample {
    public static void main(String[] args) {
        // 从传入的索引处截取字符串内容(包前不包后)
        String s3 = "Java是世界上最好的编程语言之一";
        String rs1 = s3.substring(0, 8); // 0 - 8 个字符，不包括 8
        String rs2 = s3.substring(9, 17);
        System.out.println(rs1);
        System.out.println(rs2);

        // 从传入的索引直接截取到末尾字符串返回
        String rs3 = s3.substring(5);
        System.out.println(rs3);
    }
}
```

#### 7. 替换字符串内容

`replace(CharSequence target, CharSequence replacement)` 方法用于将字符串中的指定内容替换为新的内容，并返回一个新的字符串对象。
```java
public class StringReplaceExample {
    public static void main(String[] args) {
        // 把字符串的内容替换成新内容，并返回新的字符串对象给我们
        String info = "这个电影简直是个垃圾,垃圾电影!!";
        String rs4 = info.replace("垃圾", "**");
        System.out.println(info);
        System.out.println(rs4);
    }
}
```

#### 8. 判断字符串中是否包含某个字符串

`contains(CharSequence s)` 方法用于判断字符串中是否包含指定的子字符串。
```java
public class StringContainsExample {
    public static void main(String[] args) {
        // 判断字符串中是否包含了某个字符串
        String s3 = "Java是世界上最好的编程语言之一";
        boolean rs5 = s3.contains("Java");
        System.out.println(s3.contains("Java"));
        System.out.println(s3.contains("Java1"));
        System.out.println(rs5);
    }
}
```

#### 9. 判断字符串是否以某个字符串开头

`startsWith(String prefix)` 方法用于判断字符串是否以指定的前缀开头，`startsWith(String prefix, int toffset)` 方法用于从指定索引位置开始判断是否以指定前缀开头。

```java
public class StringStartsWithExample {
    public static void main(String[] args) {
        // 判断字符串是否以某个字符串开头。
        String rs6 = "Java,你好";
        System.out.println(rs6.startsWith("J"));
        System.out.println(rs6.startsWith("Java"));
        System.out.println(rs6.startsWith("你好"));
        System.out.println(rs6.startsWith("你好", 5));
    }
}
```

#### 10. 分割字符串

`split(String regex)` 方法用于根据指定的分隔符将字符串分割成字符串数组。

```java
public class StringSplitExample {
    public static void main(String[] args) {
        // 把字符串按照某个字符串内容分割，并返回字符串数组回来
        String str1 = "小瀚,阿伟,小楷";
        String[] split = str1.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }
}
```

#### 11. 反转字符串

可以使用 `StringBuilder` 类的 `reverse()` 方法来反转字符串。

```java
public class StringReverseExample {
    public static void main(String[] args) {
        // 反转字符串并返回
        String number = "12345";
        // 根据参数字符串对象 s 创建一个新的 StringBuilder 对象 sb
        StringBuilder sb = new StringBuilder(number);
        // 把 StringBuilder 对象中的内容反转
        sb.reverse();
        // 把 StringBuilder 对象中的内容再转换成一个新的字符串
        String newStr = sb.toString();
        System.out.println(newStr);
    }
}
```

---------

## (3) - String的注意事项



![](img/08/1662610060051.png)

### 1. String 类对象的不可变性

#### 示例代码
```java
public class StringImmutabilityExample {
    public static void main(String[] args) {
        String name = "小楷真帅";
        name = name + " 好棒";
        name = name + " 无敌";
        System.out.println(name); // 输出: 小楷真帅 好棒 无敌
    }
}
```

#### 代码分析

- **初始赋值**：执行 `String name = "小楷真帅";` 时，会在堆内存的字符串常量池中创建一个字符串对象 `"小楷真帅"`，然后把该对象的地址赋值给变量 `name`。
- **第一次拼接**：当执行 `name = name + " 好棒";` 时，首先会在字符串常量池中创建 `" 好棒"` 这个字符串对象，接着将 `"小楷真帅"` 和 `" 好棒"` 进行拼接，产生一个新的字符串对象 `"小楷真帅 好棒"`，最后把新对象的地址赋值给变量 `name`。此时，原来的 `"小楷真帅"` 对象依然存在于字符串常量池中，其内容并未改变。
- **第二次拼接**：执行 `name = name + " 无敌";` 时，同样会先在字符串常量池中创建 `" 无敌"` 对象，然后拼接得到新的字符串对象 `"小楷真帅 好棒 无敌"`，并将新对象的地址赋给 `name`。

#### 总结

虽然变量 `name` 的值看起来发生了变化，但实际上是 `name` 指向的字符串对象的地址发生了改变，而原来的字符串对象内容始终保持不变，这充分体现了 `String` 类对象的不可变性。

### 2. 字符串字面量和 `new` 出来字符串的区别

#### 示例代码

```java
public class StringCreationDifference {
    public static void main(String[] args) {
        // 字符串字面量方式创建
        String str1 = "小楷真帅";
        String str2 = "小楷真帅";

        // new 方式创建
        String str3 = new String("小楷真帅");
        String str4 = new String("小楷真帅");

        System.out.println("str1 == str2: " + (str1 == str2)); // 输出: str1 == str2: true
        System.out.println("str1 == str3: " + (str1 == str3)); // 输出: str1 == str3: false
        System.out.println("str3 == str4: " + (str3 == str4)); // 输出: str3 == str4: false
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // 输出: str1.equals(str3): true
    }
}
```
#### 代码分析

- **字符串字面量创建**：`String str1 = "小楷真帅";` 和 `String str2 = "小楷真帅";`，由于是以 `“...”` 方式写出的字符串对象，会存储到字符串常量池中，且相同内容的字符串只存储一份。所以 `str1` 和 `str2` 指向的是字符串常量池中的同一个 `"小楷真帅"` 对象，`str1 == str2` 的结果为 `true`。
- **`new` 方式创建**：`String str3 = new String("小楷真帅");` 和 `String str4 = new String("小楷真帅");`，每使用 `new` 一次，都会在堆内存中产生一个新的对象。虽然 `str3` 和 `str4` 的内容相同，但它们在堆内存中的地址不同，所以 `str3 == str4` 的结果为 `false`。同时，`str1` 指向字符串常量池中的对象，`str3` 指向堆内存中的对象，它们的地址也不同，所以 `str1 == str3` 的结果为 `false`。而 `equals` 方法比较的是字符串的内容，`str1` 和 `str3` 内容相同，所以 `str1.equals(str3)` 的结果为 `true`。

### 3.总结

- `String` 是不可变字符串对象，对 `String` 变量的修改实际上是让其指向新的字符串对象。
- 只要是以 `“...”` 方式写出的字符串对象，会存储到字符串常量池，且相同内容的字符串只存储一份。
- 通过 `new` 方式创建字符串对象，每 `new` 一次都会产生一个新的对象放在堆内存中。



### 4. String案例一：用户登录案例

接下来给大家做一个案例，使用字符串的功能完成登录案例。案例需求如下：

![](img/08/1662618819077.png)

```java
分析一下完成案例的步骤：
	1.首先，从登录界面上可以得出，需要让用户输入登录名和密码
	2.设计一个登录方法，对用户名和密码进行校验
	3.调用登录方法，根据方法的返回结果，判断登录是否成功。
	4.如果登录失败，循环登录3次，结束循环；如果登录成功，跳出循环;
```

案例分析的步骤完成代码

```java

public class LogIn {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 3;
        while (count > 0) {

            System.out.println("-----登录系统-----");
            System.out.println("请输入用户名:");
            String user = input.next();

            System.out.println("请输入密码:");
            String password = input.next();

            System.out.println("----------------");
            boolean judgment = check(user, password);
            if (judgment == true) {
                System.out.println("欢迎进入系统");
                break;
            } else {
                count--;
                System.out.println("登录失败,您还有" + count + "次机会");
            }
        }
    }

    public static boolean check(String user, String password) {
        //常规写法
       /* if ("czk".equals(user) && "123456".equals(password)) {
            return true;
        } else {
            return false;
        }*/
        //更简洁的写法
        return "czk".equals(user) && "123456".equals(password);
    }

}

```

### 5. String案例二：随机产生验证码

接下来学习一个再工作中也比较常见的案例，使用String来开发验证码。需求如下：

![](img/08/1662619371060.png)

```java
根据需求分析，步骤如下：
	1.首先，设计一个方法，该方法接收一个整型参数，最终要返回对应位数的随机验证码。
	2.方法内定义2个字符串变量：
		1个用来记住生成的验证码，1个用来记住要用到的全部字符。
	3.定义for循环控制生成多少位随机字符
	4.每次得到一个字符范围内的随机索引
	5.根据索引提取该字符，把该字符交给code变量连接起
	6.循环结束后，在循环外返回code即可。
	7.在主方法中调用生成验证码的方法
```

根据步骤完成代码

```java
import java.util.Random;

/**
 * 生成随机验证码的类
 */
public class Random_VerificationCode {
    /**
     * 主函数入口
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 实现随机产生验证码，验证码的每位可能是数字、大写字母、小写字母
        System.out.println(RandomNumber(10));
    }
    /**
     * 生成指定长度的随机验证码
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
```

# 三、ArrayList 类常用 API 详解

## (1). ArrayList 基础概念

**定义**：
`ArrayList` 是 Java 中常用的**动态数组**（可变长度的集合），用于存储多个对象，类似数组但长度可变，适用于频繁增删元素的场景。

**特点**：

- **元素有序**：存储顺序与取出顺序一致。
- **允许重复**：可存储重复元素。
- **允许 `null`**：可存储 `null` 值。
- **底层实现**：基于数组实现，通过扩容机制动态调整长度。

**创建方式**：

```java
// 创建空的 ArrayList（推荐）  
ArrayList<String> list = new ArrayList<>();  

// 创建指定初始容量的 ArrayList  
ArrayList<Integer> nums = new ArrayList<>(10); // 初始容量为 10  
```

## (2). ArrayList 常用方法及示例

| **方法名**           | **方法签名**                     | **功能描述**                                    | **示例代码**                          | **输出结果**         |
| -------------------- | -------------------------------- | ----------------------------------------------- | ------------------------------------- | -------------------- |
| **添加元素**         | `boolean add(E e)`               | 向集合末尾添加元素                              | `list.add("楷楷");` `list.add("18");` | `[楷楷, 18]`         |
| **指定索引添加元素** | `void add(int index, E element)` | 在指定索引处插入元素（索引从 0 开始）           | `list.add(2, "男");`                  | `[楷楷, 18, 男]`     |
| **获取元素**         | `E get(int index)`               | 返回指定索引处的元素                            | `System.out.println(list.get(1));`    | `18`                 |
| **获取集合长度**     | `int size()`                     | 返回集合中元素的个数                            | `System.out.println(list.size());`    | `3`                  |
| **删除指定索引元素** | `E remove(int index)`            | 删除指定索引处的元素，返回被删除的元素          | `System.out.println(list.remove(2));` | `男`                 |
| **删除指定元素**     | `boolean remove(Object o)`       | 删除集合中第一个出现的指定元素，成功返回 `true` | `list.remove("18");`                  | `true`（若存在元素） |
| **修改指定索引元素** | `E set(int index, E element)`    | 修改指定索引处的元素，返回被修改的旧元素        | `list.set(0, "臭楷楷");`              | `臭楷楷`             |
| **清空集合**         | `void clear()`                   | 移除集合中所有元素                              | `list.clear();`                       | `[]`                 |
| **判断集合是否为空** | `boolean isEmpty()`              | 集合为空时返回 `true`                           | `System.out.println(list.isEmpty());` | `true`（若集合为空） |

## (3). ArrayList 操作示例代码

#### 1. 创建 ArrayList 对象

```java
import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        // 创建 ArrayList 对象（存储 String 类型元素）
        ArrayList<String> list = new ArrayList<>();
    }
}
```

**说明**：使用 `ArrayList` 的无参构造方法创建一个存储 `String` 类型元素的集合。

#### 2. 向集合添加元素

```java
// 1. 向集合添加元素（末尾添加）
list.add("楷楷");
list.add("18");
list.add("唱跳rap篮球");
System.out.println("添加元素后: " + list); // 输出: [楷楷, 18, 唱跳rap篮球]
```

**说明**：使用 `add(E e)` 方法将元素依次添加到集合的末尾。

#### 3. 向指定索引添加元素

```java
// 2. 向指定索引添加元素（索引 2 处插入 "男"）
list.add(2, "男");
System.out.println("指定索引添加后: " + list); // 输出: [楷楷, 18, 男, 唱跳rap篮球]
```

**说明**：使用 `add(int index, E element)` 方法在指定索引位置插入元素。

#### 4. 获取指定索引的元素

```java
// 3. 获取指定索引的元素（索引 1 处的元素）
String element = list.get(1);
System.out.println("索引 1 的元素: " + element); // 输出: 18
```

**说明**：使用 `get(int index)` 方法获取指定索引位置的元素。

#### 5. 获取集合长度


```java
// 4. 获取集合长度
int size = list.size();
System.out.println("集合长度: " + size); // 输出: 4
```

**说明**：使用 `size()` 方法获取集合中元素的数量。

#### 6. 删除指定索引的元素

```java
// 5. 删除指定索引的元素（索引 2 处的 "男"）
String removedElement = list.remove(2);
System.out.println("删除的元素: " + removedElement); // 输出: 男
System.out.println("删除后集合: " + list); // 输出: [楷楷, 18, 唱跳rap篮球]
```

**说明**：使用 `remove(int index)` 方法删除指定索引位置的元素，并返回被删除的元素。

#### 7. 删除指定名称的元素

```java
// 6. 删除指定名称的元素（删除 "18"）
boolean deleteSuccess = list.remove("18");
System.out.println("删除是否成功: " + deleteSuccess); // 输出: true
System.out.println("删除后集合: " + list); // 输出: [楷楷, 唱跳rap篮球]
```

**说明**：使用 `remove(Object o)` 方法删除集合中第一个出现的指定元素，返回删除操作是否成功。

#### 8. 修改指定索引的元素

```java
// 7. 修改指定索引的元素（将索引 0 的 "楷楷" 改为 "臭楷楷"）
String oldElement = list.set(0, "臭楷楷");
System.out.println("修改前的元素: " + oldElement); // 输出: 楷楷
System.out.println("修改后集合: " + list); // 输出: [臭楷楷, 唱跳rap篮球]
```

**说明**：使用 `set(int index, E element)` 方法修改指定索引位置的元素，并返回被修改的旧元素。

## (4). ArrayList 注意事项

1. **索引越界异常**：

   - 操作索引前需确保索引在有效范围（`0 ≤ index < size()`），否则抛出 `IndexOutOfBoundsException`。

   ```java
   // 错误示例：索引超出集合长度  
   list.get(list.size()); // 抛出异常  
   ```
   
2. **泛型限制**：

   - 创建时指定泛型类型（如 `ArrayList<String>`），只能存储对应类型的元素，避免类型转换异常。

   ```java
   ArrayList<String> list = new ArrayList<>();  
   list.add(123); // 编译错误（不能存储 Integer 类型）  
   ```
   
3. **删除元素的坑**：

   - `remove(Object o)` 方法会删除**第一个匹配的元素**，而非根据索引删除。

   ```java
list.add("18");  
   list.add("18");  
list.remove("18"); // 删除第一个 "18"，集合中仍存在第二个 "18"  
   ```

4. **性能注意事项**：

   - **频繁增删中间元素**：`ArrayList` 底层是数组，插入 / 删除中间元素需移动后续元素，性能较低（时间复杂度 `O(n)`）。
   - **频繁扩容**：初始容量不足时会触发扩容（创建新数组并复制元素），建议预估数据量设置初始容量以减少扩容次数。

####  ArrayList 与数组的对比

| **特性**     | **ArrayList**                   | **数组**                 |
| ------------ | ------------------------------- | ------------------------ |
| **长度可变** | ✅ 动态扩容                      | ❌ 固定长度               |
| **元素类型** | 只能存储引用类型（可存 `null`） | 可存储基本类型或引用类型 |
| **常用操作** | 添加、删除、遍历                | 下标访问、赋值           |
| **适用场景** | 不确定数据量，频繁增删          | 数据量固定，频繁下标访问 |

**总结**：`ArrayList` 是数组的灵活替代方案，开发中优先使用 `ArrayList`，仅在对性能要求极高或存储基本类型时考虑数组。

