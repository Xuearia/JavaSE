## 一、Object 类

Object 类作为 Java 中所有类的父类，为各类对象提供了通用的方法。

| 类名   | 方法名           | 方法定义                          | 作用                              | 默认行为                                                   | 重写后的行为                                                 | 使用注意事项                                               |
| ------ | ---------------- | --------------------------------- | --------------------------------- | ---------------------------------------------------------- | ------------------------------------------------------------ | ---------------------------------------------------------- |
| Object | toString()       | `public String toString()`        | 返回对象的字符串表示形式          | “包名。类名 @哈希值 16 进制”，无法直观体现对象属性内容     | 可返回对象的属性值，方便查看对象内容                         | 建议重写以提供更有意义的信息                               |
| Object | equals(Object o) | `public boolean equals(Object o)` | 判断当前对象与传入对象是否 “相等” | 比较对象的内存地址值，与 “==” 效果相同                     | 按对象的属性值进行比较                                       | 重写时需遵循 equals 方法的契约，如自反性、对称性、传递性等 |
| Object | clone()          | `public Object clone()`           | 创建并返回当前对象的副本          | 浅克隆，仅复制对象的基本属性值，引用类型属性复制的是地址值 | 深克隆时，对引用类型属性进行再次克隆，实现完全独立的对象副本 | 被克隆类必须实现 Cloneable 接口，否则抛出异常              |

### 1.toString () 方法

1. **方法定义**：`public String toString()`，用于返回对象的字符串表示形式。
2. **默认格式**：“包名。类名 @哈希值 16 进制”。
3. **示例**：定义`Student`类，包含`name`和`age`属性。在未重写`toString()`方法时，创建`Student`对象并调用`toString()`，输出为默认格式。

```java
public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
```

```java
public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("楷楷", 23);
        System.out.println(s1.toString()); 
    }
}
```

1. **重写后效果**：在`Student`类中重写`toString()`方法，可返回对象的属性值。

```java
@Override
public String toString() {
    return "Student{name='" + name + "', age=" + age + "}";
}
```

重写后运行测试类，输出为自定义的属性值格式。

### 2.equals (Object o) 方法

1. **方法定义**：`public boolean equals(Object o)`，用于判断此对象与参数对象是否 “相等”。
2. **默认比较方式**：默认比较对象的地址值，和 “==” 效果相同。
3. **示例**：创建两个内容相同的`Student`对象`s1`和`s2`，使用`equals`和 “==” 比较，结果均为`false`。

**代码示例**

```java
public class Test {
    public static void main(String[] args) {
        //目标:掌握Object类提供的常用方法
        Student s1 = new Student("楷楷", 23);
        //System.out.println(s1.toString());
        System.out.println(s1);//会自动省略Object的toString

        //equals(object o)判断两个对象是否相等
        Student s2 = new Student("楷楷",23);
        //意义让子类重写去比较内容是否相等
        System.out.println(s2.equals(s1));
        System.out.println(s1 == s2);
    }
}
```

1. **重写后比较方式**：在`Student`类中重写`equals`方法，可按对象的属性值进行比较。
1. **代码示例**

```java
// 重写equals方法,比较两个对象的内容一样就返回true.
// 比较者：s2 == this
// 被比较者：s1 == o
@Override
public boolean equals(Object o) {
    // 1、判断两个对象是否地址一样，一样直接返回true.
    if (this == o) return true;
    // 2、判断o是null直接返回false, 或者比较者的类型与被比较者的类型不一样，返回false
    //               Student.class !=  Pig.class
    if (o == null || this.getClass() != o.getClass()) return false;
    // 3、o不是null，且o一定是学生类型的对象。开始比较内容了！
    Student student = (Student) o;
    return age == student.age && java.util.Objects.equals(name, student.name);
}
```

重写后再次运行测试类，使用`equals`比较结果为`true`。

### 3.clone () 方法

1. **方法定义**：`public Object clone()`，用于克隆当前对象，返回一个新对象。

2. **使用前提**：被克隆的类必须实现`Cloneable`接口。

3. **浅克隆示例**：以`User`类为例，实现`Cloneable`接口并覆盖`clone`方法。

   **代码示例**

```java
public class User implements Cloneable {
    private int id; // 编号
    private String username; // 用户名
    private String password; // 密码
    private double[] scores; // 分数

    public User(){}

    public User(int id, String username,
                String password, double[] scores) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.scores = scores;
    }

    //一定要重写
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //super 去调用父类Object的方法
        return super.clone();
    }
```

在测试类中克隆`User`对象，克隆后的对象属性值与原对象相同，但引用类型（如`scores`数组）拷贝的是地址值，这就是浅克隆。

4. **深克隆示例**：在`User`类的`clone`方法中，对引用类型数据再次克隆，实现深拷贝。

```java
@Override
protected Object clone() throws CloneNotSupportedException {
    User u = (User) super.clone();
    u.scores = u.scores.clone();
    return u;
}
```

## 二、Objects 类

Objects 类是工具类，提供了一些操作任意对象的方法。

| 类名      | 方法名                        | 方法定义                                               | 作用                 | 使用场景                                |
| ------- | -------------------------- | -------------------------------------------------- | ------------------ | ----------------------------------- |
| Objects | equals(Object a, Object b) | `public static boolean equals(Object a, Object b)` | 比较两个对象是否相等，避免空指针异常 | 在比较可能为 null 的对象时使用，替代直接使用 equals 方法 |
| Objects | isNull(Object obj)         | `public static boolean isNull(Object obj)`         | 判断对象是否为 null       | 用于需要明确判断对象是否为 null 的场景，简化代码逻辑       |
| Objects | nonNull(Object obj)        | `public static boolean nonNull(Object obj)`        | 判断对象是否不为 null      | 在需要确保对象不为 null 时使用，提高代码的可读性和安全性     |

### 1.equals (Object a, Object b)

用于比较两个对象是否相等，可避免空指针异常，底层会自动先判断空。如：

```java
String s1 = null;
String s2 = "kaikai";

//两种方法都可以比较对象是否相等,但是第一种对象为空时会报空指针异常的错误
//System.out.println(s1.equals(s2)); //空指针异常
System.out.println(Objects.equals(s1, s2));//推荐 更安全 有空参校验
```

### 2.isNull (Object obj)

判断对象是否为 null，等价于 “== null”。例如：

```java
//Objects.isNull(Object obj)：用于判断传入的对象是否为null。如果对象为null，则返回true；否则返回false。
String str1 = null;
String str2 = "Hello";

System.out.println("str1是否为null: " + Objects.isNull(str1));
System.out.println(str1==null);//这样也可以实现
System.out.println("str2是否为null: " + Objects.isNull(str2));
System.out.println(str1==null);
```

### 3.nonNull (Object obj)

判断对象是否不为 null，等价于 “!= null”。例如：

```java
//Objects.nonNull(Object obj)：与Objects.isNull相反，用于判断传入的对象是否不为null。如果对象不为null，则返回true；否则返回false。
String str3 = null;
String str4 = "Hello";

System.out.println("str3是否不为null: " + Objects.nonNull(str3));
System.out.println(str3!=null);//这样也可以实现
System.out.println("str4是否不为null: " + Objects.nonNull(str4));
System.out.println(str4!=null);
```

## 三、基本类型包装类

Java 中 8 种基本数据类型都有对应的包装类，目的是将基本数据类型变为对象，以便提供方法操作数据。

### 1.创建包装类对象

以`Integer`为例，介绍几种创建包装类对象的方式：

| 创建方式              | 示例代码                                                     | 说明                                                       |
| --------------------- | ------------------------------------------------------------ | ---------------------------------------------------------- |
| 使用构造器            | `Integer a = new Integer(10);`                               | 在 Java 9 及以后该构造方法已过时，不建议使用               |
| 使用静态方法`valueOf` | `Integer b = Integer.valueOf(10);`                           | 该方法会复用已有的对象，更高效                             |
| 自动装箱              | `Integer c = 10;`                                            | Java 5.0 引入的特性，编译器自动将基本类型转换为包装类对象  |
| 自动拆箱              | `int d = c;`                                                 | 与自动装箱相反，编译器自动将包装类对象转换为基本类型       |
| 在集合中的体现        | `ArrayList<Integer> list = new ArrayList<>(); list.add(250); int r1 = list.get(1);` | 在集合中添加基本类型数据时会自动装箱，获取元素时会自动拆箱 |

### 2.包装类数据类型转换

1. **字符串转换为数值型数据**：使用`包装类.parseXxx(字符串)`方法，如`Integer.parseInt(ageStr)`将字符串转换为基本数据类型。此外，还可以使用`包装类.valueOf(字符串)`方法。
2. **数值型数据转换为字符串**：可使用`包装类.valueOf(数据)` 、`包装类.toString(数据)`或`数据 + ""`等方式。

### 3.示例代码

**代码示例**

```java
public class WrapperClassDemo {
    public static void main(String[] args) {
        // 创建包装类对象
        // 过时的构造器，不建议使用
        // Integer a1 = new Integer(12); 
        Integer a1 = Integer.valueOf(12);
        System.out.println(a1);

        // 自动装箱:可以自动把基本数据类型的数据转换成对象
        Integer a2 = 13;
        System.out.println(a2);

        // 自动拆箱:可以自动把包装类型的对象转换成对应的基本数据类型。
        int a4 = a2;

        // 泛型和集合不支持基本数据类型，只能支持引用数据类型。
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        list.add(250); // 自动装箱
        list.add(520); // 自动装箱
        System.out.println(list.get(0));

        int r1 = list.get(1); // 自动拆箱

        System.out.println("-------------------------------------------");

        // 1. 把基本数据类型的数据转成字符串(用的不多)
        Integer a = 200;
        String r = Integer.toString(a); // "200"
        String ss1 = a + "5";
        System.out.println(ss1); // 2005

        String r2 = a.toString(); // "200"
        String ss2 = a + "05";
        System.out.println(ss2); // 20005

        String r3 = a + ""; // "200"
        String ss3 = a + "0001";
        System.out.println(ss3); // 2000001

        // 2. parseInt 把字符串转成基本数据类型(非常重要)
        String r4 = "249";
        Integer ss4 = Integer.parseInt(r4) + 1; // 249 + 1 = 250
        System.out.println(ss4); // 250

        String r5 = "249.5";
        double ss5 = Double.parseDouble(r5) + 1;
        System.out.println(ss5);

        // 更简单的方法用 valueOf(必须小数转小数,整数转整数,无法小数转整数(但可以整数转小数))
        String r6 = "1234";
        int ss6 = Integer.valueOf(r6) + 1;
        double ss7 = Double.valueOf(r6) + 10;

        System.out.println(ss6); // 1235
        System.out.println(ss7); // 1244.0
    }
}
```



### 4.代码解释

1. **创建包装类对象**：通过不同方式创建`Integer`对象，展示了自动装箱和拆箱的特性，以及在集合中的应用。

2. 数据类型转换：
   - **数值转字符串**：使用`Integer.toString()`、`对象.toString()`和`对象 + ""`三种方式将`Integer`对象转换为字符串。
   - **字符串转数值**：使用`Integer.parseInt()`和`Double.parseDouble()`将字符串转换为基本数据类型，也可以使用`Integer.valueOf()`和`Double.valueOf()`方法。 
   

## 四、StringBuilder 类

#### 1. 概述

`StringBuilder` 是 Java 中的一个可变字符序列类，位于 `java.lang` 包下。与 `String` 类不同，`String` 对象是不可变的，每次对 `String` 进行修改操作时，都会创建一个新的 `String` 对象，这会带来较大的性能开销。而 `StringBuilder` 可以在不创建大量新对象的情况下，对字符串内容进行修改，从而提高了字符串操作的效率，特别适合需要频繁进行字符串拼接、插入、删除等操作的场景。

#### 2. 构造方法

- **`StringBuilder()`**：创建一个初始容量为 16 的空 `StringBuilder` 对象。
- **`StringBuilder(int capacity)`**：创建一个指定初始容量的空 `StringBuilder` 对象。
- **`StringBuilder(String str)`**：创建一个包含指定字符串内容的 `StringBuilder` 对象，初始容量为字符串长度加上 16。

#### 3. 常用方法

##### 3.1 追加内容（`append()`）

该方法用于在 `StringBuilder` 对象的末尾追加各种类型的数据，支持链式调用。

```java
StringBuilder sb = new StringBuilder();
sb.append("Hello").append(" ").append("World!");
System.out.println(sb.toString()); // 输出: Hello World!
```

##### 3.2 插入内容（`insert()`）

可以在指定位置插入各种类型的数据。

```java
StringBuilder sb = new StringBuilder("HelloWorld!");
sb.insert(5, " ");
System.out.println(sb.toString()); // 输出: Hello World!
```

##### 3.3 删除内容（`delete()` 和 `deleteCharAt()`）

- `delete(int start, int end)`：删除从 `start` 到 `end - 1` 位置的字符。
- `deleteCharAt(int index)`：删除指定索引位置的字符。

```java
StringBuilder sb = new StringBuilder("HelloWorld!");
sb.delete(5, 10);
System.out.println(sb.toString()); // 输出: Hello!

sb.deleteCharAt(5);
System.out.println(sb.toString()); // 输出: Hello
```

##### 3.4 替换内容（`replace()`）

用于替换指定范围内的字符。

```java
StringBuilder sb = new StringBuilder("HelloWorld!");
sb.replace(5, 10, " Java");
System.out.println(sb.toString()); // 输出: Hello Java!
```

##### 3.5 反转字符串（`reverse()`）

将 `StringBuilder` 对象中的字符序列反转。

```java
StringBuilder sb = new StringBuilder("Hello");
sb.reverse();
System.out.println(sb.toString()); // 输出: olleH
```

##### 3.6 获取长度（`length()`）

返回 `StringBuilder` 对象中字符的数量。

```java
StringBuilder sb = new StringBuilder("Hello");
int length = sb.length();
System.out.println(length); // 输出: 5
```

##### 3.7 获取容量（`capacity()`）

返回 `StringBuilder` 对象的当前容量。

```java
StringBuilder sb = new StringBuilder();
int capacity = sb.capacity();
System.out.println(capacity); // 输出: 16
```

#### 4. 性能优势

* 为什么要用StringBuilder对字符串进行操作呢？因为它的效率比String更高，我们可以下面两段代码验证一下。

![](img/13/1667402173587.png)

在需要频繁进行字符串拼接的场景下，使用 `StringBuilder` 比使用 `String` 性能要高很多。以下是一个简单的性能测试示例：

**代码示例**

```java
public class StringBuilderPerformanceTest {
    public static void main(String[] args) {
        // 使用 String 进行拼接
        long startTime1 = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("使用 String 拼接耗时: " + (endTime1 - startTime1) + " 毫秒");

        // 使用 StringBuilder 进行拼接
        long startTime2 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("使用 StringBuilder 拼接耗时: " + (endTime2 - startTime2) + " 毫秒");
    }
}    
```
#### 5. 注意事项

- `StringBuilder` 是非线程安全的，如果在多线程环境下需要进行字符串操作，建议使用 `StringBuffer`，它和 `StringBuilder` 的方法基本相同，但 `StringBuffer` 是线程安全的，只是性能相对较低。
- 当 `StringBuilder` 的容量不足时，会自动进行扩容，扩容后的容量一般是原来的两倍加 2。为了避免频繁扩容带来的性能开销，可以在创建 `StringBuilder` 对象时，根据实际需求指定合适的初始容量。



## 五、StringJoiner 类

#### 1. StringJoiner 简介

`StringJoiner` 是 Java 里用于高效拼接字符串的类。当需要用特定分隔符连接多个字符串时，使用它能让代码更简洁。相较于手动用 `StringBuilder` 拼接，它提供了更便捷的 API 来处理分隔符、前缀和后缀。

#### 2. StringJoiner 基本用法示例
```java
public class Test {
    public static void main(String[] args) {
        // 只指定分隔符
        StringJoiner s = new StringJoiner(",");
        s.add("java1");
        s.add("java2");
        s.add("java3");
        System.out.println(s); // 结果为： java1,java2,java3

        // 指定分隔符、开头和结尾
        StringJoiner s1 = new StringJoiner(",", "[", "]");
        s1.add("java1");
        s1.add("java2");
        s1.add("java3");
        System.out.println(s1); // 结果为： [java1,java2,java3]
    }
}
```

上述代码展示了 `StringJoiner` 的两种使用方式：

- 只指定分隔符时，创建的 `StringJoiner` 会用该分隔符连接添加的字符串。
- 指定分隔符、前缀和后缀时，最终拼接出的字符串会以前缀开头，后缀结尾，元素间用分隔符连接。

#### 3. 使用 StringJoiner 将数组转换为字符串

```java
public class Test {
    public static void main(String[] args) {
        String str = getArrayData(new int[]{11, 22, 33});
        System.out.println(str);
    }

    // 方法作用：将int数组转换为指定格式的字符串
    public static String getArrayData(int[] arr) {
        // 1. 判断数组是否为null
        if (arr == null) {
            return null;
        }
        // 2. 如果数组不为null，再遍历，并拼接数组中的元素
        StringJoiner s = new StringJoiner(", ", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            // 加""是因为add方法的参数要的是String类型
            s.add(String.valueOf(arr[i]));
        }
        // 3、把StringJoiner转换为String，并返回。
        return s.toString();
    }
}
```



此代码实现了将 `int` 数组转换为特定格式字符串的功能，具体步骤如下：

1. **数组判空**：首先检查传入的数组是否为 `null`，若为 `null` 则直接返回 `null`。
2. **创建 StringJoiner 对象**：创建一个 `StringJoiner` 对象，指定分隔符为 `", "`，前缀为 `"["`，后缀为 `"]"`。
3. **遍历数组并添加元素**：使用 `for` 循环遍历数组，将每个元素转换为 `String` 类型后添加到 `StringJoiner` 中。
4. **转换为字符串并返回**：调用 `StringJoiner` 的 `toString()` 方法将其转换为最终的字符串并返回。

## 六、Math 类

`Math` 类是 Java 提供的一个包含各种数学运算方法的工具类，该类中的所有方法都是静态的，无需创建对象即可直接使用。它提供了诸如绝对值、向上取整、向下取整、四舍五入、最大值、最小值、次方和随机数等常见数学运算的方法。

**代码示例**

```java
public class Math_Demo {
    public static void main(String[] args) {
        // 目标：了解下Math类提供的常见方法。
        // 1、public static int abs(int a)：取绝对值（拿到的结果一定是正数）
        //public static double abs(double a)  取绝对值（结果为正数）
        System.out.println("---------取绝对值-----------");
        System.out.println(Math.abs(-20));//20
        System.out.println(Math.abs(123));//123
        System.out.println(Math.abs(-3.14));//3.14

        //public static double ceil(double a) 向上取整
        System.out.println("---------向上取整-----------");
        System.out.println(Math.ceil(3.1415925));//4.0
        System.out.println(Math.ceil(3.0000001));//4.0
        System.out.println(Math.ceil(3));//3.0

        //public static double floor(double a)向下取整
        System.out.println("---------向下取整-----------");
        System.out.println(Math.floor(3.1415926));//3.0
        System.out.println(Math.floor(3.0000001));//3.0
        System.out.println(Math.floor(3));//3.0

        //public static long round(double a)  四舍五入
        System.out.println("---------四舍五入-----------");
        System.out.println(Math.round(3.4999));//3
        System.out.println(Math.round(3.5432));//4
        System.out.println(Math.round(6.0));//6

        //public static int max(int a, int b) 分别取两个数中的较大值
        System.out.println("---------取最大值-----------");
        System.out.println(Math.max(10,20));

        //public static int min(int a, int b) 分别取两个数中的较小值
        System.out.println("---------取最小值-----------");
        System.out.println(Math.min(10,20));

        //public static double pow(double a, double b)	取次方，计算 a 的 b 次幂
        System.out.println("---------取次方数-----------");
        System.out.println(Math.pow(2,3));//2的3次方 8.0
        System.out.println(Math.pow(3,2));//3的2次方 9.0

        //public static double random()	取随机数，返回值范围在 [0.0 , 1.0)（包含 0.0 但不包含 1.0）
        System.out.println(Math.random());
    }
}
```

| 方法名称                  | 描述                                                       | 参数                                                         | 返回值                       |
| ------------------------- | ---------------------------------------------------------- | ------------------------------------------------------------ | ---------------------------- |
| `abs(int a)`              | 返回 `int` 类型参数的绝对值                                | `int a`：需要取绝对值的整数                                  | `int`：参数的绝对值          |
| `abs(long a)`             | 返回 `long` 类型参数的绝对值                               | `long a`：需要取绝对值的长整数                               | `long`：参数的绝对值         |
| `abs(float a)`            | 返回 `float` 类型参数的绝对值                              | `float a`：需要取绝对值的浮点数                              | `float`：参数的绝对值        |
| `abs(double a)`           | 返回 `double` 类型参数的绝对值                             | `double a`：需要取绝对值的双精度浮点数                       | `double`：参数的绝对值       |
| `ceil(double a)`          | 返回大于或等于参数的最小整数（以 `double` 类型表示）       | `double a`：要进行向上取整的双精度浮点数                     | `double`：向上取整后的结果   |
| `floor(double a)`         | 返回小于或等于参数的最大整数（以 `double` 类型表示）       | `double a`：要进行向下取整的双精度浮点数                     | `double`：向下取整后的结果   |
| `round(double a)`         | 将双精度浮点数四舍五入为最接近的 `long` 型整数             | `double a`：要进行四舍五入的双精度浮点数                     | `long`：四舍五入后的结果     |
| `max(int a, int b)`       | 返回两个 `int` 类型参数中的较大值                          | `int a`：要比较的第一个整数 `int b`：要比较的第二个整数      | `int`：两个参数中的较大值    |
| `max(long a, long b)`     | 返回两个 `long` 类型参数中的较大值                         | `long a`：要比较的第一个长整数 `long b`：要比较的第二个长整数 | `long`：两个参数中的较大值   |
| `max(float a, float b)`   | 返回两个 `float` 类型参数中的较大值                        | `float a`：要比较的第一个浮点数 `float b`：要比较的第二个浮点数 | `float`：两个参数中的较大值  |
| `max(double a, double b)` | 返回两个 `double` 类型参数中的较大值                       | `double a`：要比较的第一个双精度浮点数 `double b`：要比较的第二个双精度浮点数 | `double`：两个参数中的较大值 |
| `min(int a, int b)`       | 返回两个 `int` 类型参数中的较小值                          | `int a`：要比较的第一个整数 `int b`：要比较的第二个整数      | `int`：两个参数中的较小值    |
| `min(long a, long b)`     | 返回两个 `long` 类型参数中的较小值                         | `long a`：要比较的第一个长整数 `long b`：要比较的第二个长整数 | `long`：两个参数中的较小值   |
| `min(float a, float b)`   | 返回两个 `float` 类型参数中的较小值                        | `float a`：要比较的第一个浮点数 `float b`：要比较的第二个浮点数 | `float`：两个参数中的较小值  |
| `min(double a, double b)` | 返回两个 `double` 类型参数中的较小值                       | `double a`：要比较的第一个双精度浮点数 `double b`：要比较的第二个双精度浮点数 | `double`：两个参数中的较小值 |
| `pow(double a, double b)` | 返回 `a` 的 `b` 次幂（以 `double` 类型表示）               | `double a`：底数 `double b`：指数                            | `double`：幂运算的结果       |
| `random()`                | 返回一个大于等于 `0.0` 且小于 `1.0` 的随机 `double` 类型数 | 无                                                           | `double`：生成的随机数       |
| `sin(double a)`           | 返回参数 `a` 的正弦值（`a` 以弧度为单位）                  | `double a`：角度的弧度值                                     | `double`：参数的正弦值       |
| `cos(double a)`           | 返回参数 `a` 的余弦值（`a` 以弧度为单位）                  | `double a`：角度的弧度值                                     | `double`：参数的余弦值       |
| `tan(double a)`           | 返回参数 `a` 的正切值（`a` 以弧度为单位）                  | `double a`：角度的弧度值                                     | `double`：参数的正切值       |

## 七、System 类

`System` 类是 Java 中的一个系统级工具类，提供了与系统相关的重要方法和属性。该类不能被实例化，其所有成员都是静态的。常用的功能包括终止 Java 虚拟机、获取当前系统时间等。

**代码示例**

```java
public class System_Demo {
    public static void main(String[] args) {
        // 1、public static void exit(int status):
        //   终止当前运行的Java虚拟机。
        //   该参数用作状态代码; 按照惯例，非零状态代码表示异常终止。
        // System.exit(0); // 人为的终止虚拟机。(不要使用)

        // 2、public static long currentTimeMillis():
        //    获取当前系统的时间
        //    返回的是long类型的时间毫秒值：指的是从1970-1-1 0:0:0开始走到此刻的总的毫秒值，1s = 1000ms
        long time = System.currentTimeMillis();
        System.out.println(time);

        for (int i = 0; i < 1000000; i++) {
            System.out.println("输出了：" + i);
        }

        long time2 = System.currentTimeMillis();
        System.out.println((time2 - time) / 1000.0 + "s");
    }
}
```



## 八、Runtime 类

`Runtime` 类代表 Java 应用程序的运行时环境，每个 Java 应用程序都有一个与之关联的 `Runtime` 实例，通过它可以与运行时环境进行交互。该类可以用于获取 JVM 的相关信息，如可用处理器数量、内存总量和可用内存量等，还能启动其他外部程序。

**代码示例**

```java
import java.io.IOException;

public class Runtime_Demo {
    public static void main(String[] args) {
        try {
            // 1、public static Runtime getRuntime() 返回与当前Java应用程序关联的运行时对象。
            // 通过调用 Runtime 类的静态方法 getRuntime()，获取与当前 Java 应用程序关联的 Runtime 实例。
            // 将获取到的 Runtime 实例赋值给变量 r，后续通过 r 来调用 Runtime 类的其他方法。
            Runtime r = Runtime.getRuntime();

            // 2、public void exit(int status) 终止当前运行的虚拟机,该参数用作状态代码; 按照惯例，非零状态代码表示异常终止。
            // 这里注释掉 r.exit(0)，因为随意终止虚拟机可能导致程序不正常结束，
            // 通常在程序出现严重错误需要立即终止时才使用该方法。
            // r.exit(0);

            // 3、public int availableProcessors(): 获取虚拟机能够使用的处理器数。
            // 调用 r 的 availableProcessors() 方法，获取当前虚拟机能够使用的处理器数量，
            // 并将其打印输出，以便了解当前虚拟机的处理器资源情况。
            System.out.println(r.availableProcessors());

            // 4、public long totalMemory() 返回Java虚拟机中的内存总量。
            // 调用 r 的 totalMemory() 方法，获取 Java 虚拟机中的内存总量，
            // 然后将其转换为以兆字节（MB）为单位，并打印输出，了解当前虚拟机的内存总量。
            System.out.println(r.totalMemory() / 1024.0 / 1024.0 + "MB"); // 1024 = 1K     1024 * 1024 = 1M

            // 5、public long freeMemory() 返回Java虚拟机中的可用内存量
            // 调用 r 的 freeMemory() 方法，获取 Java 虚拟机中当前可用的内存量，
            // 同样将其转换为以兆字节（MB）为单位，并打印输出，了解当前虚拟机的可用内存情况。
            System.out.println(r.freeMemory() / 1024.0 / 1024.0 + "MB");

            // 6、public Process exec(String command) 启动某个程序，并返回代表该程序的对象。
            // 调用 r 的 exec("notepad.exe") 方法，启动 Windows 系统中的记事本程序，
            // 返回代表记事本程序的 Process 对象，并赋值给变量 p。
            // r.exec("D:\\soft\\XMind\\XMind.exe");
            Process p = r.exec("notepad.exe"); // 以记事本程序为例
            // 调用 Thread.sleep(5000) 方法，使当前线程暂停 5 秒，
            // 目的是让记事本程序运行一段时间后再进行后续操作。
            Thread.sleep(5000); // 让程序在这里暂停5s后继续往下走！！
            // 调用 p 的 destroy() 方法，销毁代表记事本程序的进程，即关闭记事本程序。
            p.destroy(); // 销毁！关闭程序！
        } catch (IOException | InterruptedException e) {
            // 捕获 IOException 和 InterruptedException 异常，
            // 当执行 exec 方法启动程序或执行 Thread.sleep 方法时可能会抛出这些异常。
            // 打印异常的堆栈跟踪信息，方便调试和了解异常发生的原因。
            e.printStackTrace();
        }
    }
}
```



## 九、BigDecimal 类

在 Java 中，使用基本数据类型 `float` 和 `double` 进行浮点数运算时，会存在精度丢失的问题。`BigDecimal` 类就是为了解决这个问题而设计的，它可以精确地表示和操作任意精度的十进制数，提供了高精度的四则运算方法，并且可以设置小数位数和舍入模式。

**代码示例**

```java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal_Demo {
    public static void main(String[] args) {
        // 展示普通浮点型运算的精度问题
        System.out.println(0.1 + 0.2); // 输出 0.30000000000000004
        System.out.println(1.0 - 0.32); // 输出 0.6799999999999999
        System.out.println(1.015 * 100); // 输出 101.49999999999999
        System.out.println(1.301 / 100); // 输出 0.013009999999999999
        System.out.println("--------------------");

        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c); // 再次展示浮点型运算精度问题，输出 0.30000000000000004
        System.out.println("--------------------");

        // 用BigDecimal解决精度问题，推荐简洁方式转换
        BigDecimal num1 = BigDecimal.valueOf(a);
        BigDecimal num2 = BigDecimal.valueOf(b);

        // 加法运算，结果精确
        BigDecimal sum = num1.add(num2);
        System.out.println("加法结果: " + sum); // 输出 0.3

        // 减法运算，结果精确
        BigDecimal difference = num1.subtract(num2);
        System.out.println("减法结果: " + difference); // 输出 -0.1

        // 乘法运算，结果精确
        BigDecimal product = num1.multiply(num2);
        System.out.println("乘法结果: " + product); // 输出 0.02

        // 除法运算，保留两位小数，四舍五入
        BigDecimal quotient = num1.divide(num2, 2, RoundingMode.HALF_UP);
        System.out.println("除法结果: " + quotient); // 输出 0.50

        // 将BigDecimal结果转double，用于特定场景
        double d = quotient.doubleValue();
        System.out.println(d); // 输出 0.5
    }
}
```



## 十、Date 类(了解)

`Date` 类是 Java 中用于表示特定瞬间的日期和时间的类，精确到毫秒。它以自 1970 年 1 月 1 日 00:00:00 GMT（格林威治标准时间）以来的毫秒数来表示时间。不过，`Date` 类在设计上存在一些不足，许多方法已被标记为过时，现在更推荐使用 JDK 8 引入的新日期时间 API。

![](img/13/1667399304240.png)

| 分类     | 构造器 / 方法                    | 说明                                                   |
| -------- | -------------------------------- | ------------------------------------------------------ |
| 构造器   | `public Date()`                  | 创建一个 Date 对象，代表的是系统当前此刻日期时间       |
| 构造器   | `public Date(long time)`         | 把时间毫秒值转换成 Date 日期对象                       |
| 常见方法 | `public long getTime()`          | 返回从 1970 年 1 月 1 日 00:00:00 走到此刻的总的毫秒数 |
| 常见方法 | `public void setTime(long time)` | 设置日期对象的时间为当前时间毫秒值对应的时间           |

```java
import java.util.Date;

public class Date_Demo {
    public static void main(String[] args) {
        //1.创建一个Date对象,代表系统当前时间信息的
        Date d = new Date();
        System.out.println(d);

        //2.拿到时间毫秒值 从1910年1月1日00:00开始
        long time = d.getTime();
        System.out.println(time);

        //3.把毫秒值转换成对应的日期和时间 10s之后的时间
        Date d2 = new Date(time + 10 * 1000);
        System.out.println(d2);

        //4.直接把日期对象的世界通过setTime方法进行修改
        //第一种方法
        Date d3 = new Date();
        d3.setTime(time);
        System.out.println(d3);
    }
}
```

## 十一、SimpleDateFormat 类(了解)

`java.text.SimpleDateFormat` 是日期 / 时间格式化类，我们通过这个类可以帮我们完成日期和文本之间的转换，也就是可以在 `Date` 对象与 `String` 对象之间进行来回转换。

- **格式化**：按照指定的格式，把 `Date` 对象转换为 `String` 对象。例如，将表示当前时间的 `Date` 对象转换为 “yyyy-MM-dd HH:mm:ss” 格式的字符串，方便在日志记录、用户界面展示等场景使用。

- **解析**：按照指定的格式，把 `String` 对象转换为 `Date` 对象。比如从用户输入的日期字符串（如 “2023-10-01 12:00:00” ）转换为 `Date` 对象，以便进行后续的日期计算、比较等操作 。

  | 分类             | 方法                                      | 说明                                     |
  | ---------------- | ----------------------------------------- | ---------------------------------------- |
  | 常见构造器       | `public SimpleDateFormat(String pattern)` | 创建简单日期格式化对象，并封装时间的格式 |
  | 格式化时间的方法 | `public final String format(Date date)`   | 将日期格式化成日期 / 时间字符串          |
  | 格式化时间的方法 | `public final String format(Object time)` | 将时间毫秒值式化成日期 / 时间字符串      |

#### 1. 构造方法

由于 `DateFormat` 为抽象类，不能直接使用，所以需要常用的子类 `java.text.SimpleDateFormat`。这个类需要一个模式（格式）来指定格式化或解析的标准。构造方法为：

- `public SimpleDateFormat(String pattern)`：用给定的模式和默认语言环境的日期格式符号构造 `SimpleDateFormat`。参数 `pattern` 是一个字符串，代表日期时间的自定义格式。例如 `SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");` ，这里创建了一个按照 “年 - 月 - 日” 格式来处理日期的 `SimpleDateFormat` 对象。

#### 2. 格式规则

常用的格式规则为：

| 标识字母（区分大小写） | 含义        | 示例                                      |
| ---------------------- | ----------- | ----------------------------------------- |
| y                      | 年          | 2024 （完整年份）                         |
| M                      | 月          | 01 - 12 （数值表示的月份，有前导 0 ）     |
| d                      | 日          | 01 - 31 （数值表示的日，有前导 0 ）       |
| H                      | 时          | 00 - 23 （24 小时制的小时数，有前导 0 ）  |
| h                      | 时          | 01 - 12 （12 小时制的小时数，有前导 0 ）  |
| m                      | 分          | 00 - 59 （数值表示的分钟数，有前导 0 ）   |
| s                      | 秒          | 00 - 59 （数值表示的秒数，有前导 0 ）     |
| S                      | 毫秒        | 000 - 999 （数值表示的毫秒数，有前导 0 ） |
| E                      | 星期        | 星期一 - 星期日（中文语言环境下）         |
| a                      | 上午 / 下午 | AM 或 PM                                  |
| w                      | 周          | 1 - 53 （表示一年中的第几周 ）            |

> 备注：更详细的格式规则，可以参考 `SimpleDateFormat` 类的 API 文档。例如，字母组合 `MMMM` 可以表示完整的月份名称（如 January、February 等），在国际化应用中很有用；`dd EEEE` 可显示日和完整的星期名称（如 05 星期五 ）。

#### 3. 常用方法

`DateFormat` 类的常用方法有：

- `public String format(Date date)`：将 `Date` 对象格式化为字符串。例如，`Date now = new Date(); SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd"); String formattedDate = sdf.format(now);` ，这样就把当前时间的 `Date` 对象格式化为了 “年 / 月 / 日” 格式的字符串。
- `public Date parse(String source)`：将字符串解析为 `Date` 对象。例如，`String dateStr = "2022-11-11 11:11:11"; SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); try { Date parsedDate = sdf.parse(dateStr); } catch (ParseException e) { e.printStackTrace(); }` ，这里尝试将指定格式的字符串解析为 `Date` 对象，`ParseException` 是解析失败时抛出的异常，需要进行捕获处理。

```java
package test9_SimpleDateFormat;

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
```

**代码解释**：

- 在 `main` 方法中，首先创建了一个 `Date` 对象 `date` ，它表示系统当前时间，通过 `System.out.println(date);` 打印出当前时间的默认格式（如 `Thu May 08 14:30:00 CST 2025` ，格式可能因运行环境略有不同 ）。
- 接着创建了一个 `SimpleDateFormat` 对象 `sdf` ，指定格式为 “yyyy-MM-dd HH:mm:ss E a w” 。然后调用 `sdf.format(date)` 方法，将 `date` 这个 `Date` 对象按照指定格式转换为字符串，并打印输出，得到类似 “2025-05-08 14:30:00 星期四 下午 19” 这样格式的时间字符串（具体时间根据实际运行情况而定 ）。
- 之后定义了一个字符串 `str` ，它是符合前面指定格式 “yyyy-MM-dd HH:mm:ss E a w” 的日期时间字符串。创建另一个 `SimpleDateFormat` 对象 `sdf1` ，格式与前面一致，调用 `sdf1.parse(str)` 方法，将字符串 `str` 解析为 `Date` 对象 `date1` ，最后打印 `date1` ，会得到对应的 `Date` 对象表示形式。

需要注意的是，在实际应用中：

- 当进行 `parse` 操作时，输入的字符串格式必须严格与 `SimpleDateFormat` 构造方法中指定的格式一致，否则会抛出 `ParseException` 异常。例如，若字符串是 “2020/05/05 09:09:09” ，而构造 `SimpleDateFormat` 时指定的格式是 “yyyy-MM-dd HH:mm:ss” ，就会解析失败。
- 不同语言环境下，日期时间的格式可能会有差异。比如在英文语言环境下，星期的显示可能是 “Mon”、“Tue” 等，月份可能是 “Jan”、“Feb” 等。可以通过设置 `SimpleDateFormat` 的语言环境来适应不同需求，如 `SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.US);` 。

#### 4. 日期格式化 & 解析案例

以下是一个使用 `SimpleDateFormat` 完成秒杀案例的代码示例，通过日期解析和时间比较来判断用户是否秒杀成功：

![](img/13/1667400116263.png)

```java
package test9_SimpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Topic1_Date {
    public static void main(String[] args) throws ParseException {
        //1 元秒杀
        //葡式蛋挞 (1 只) 兑换券
        //秒杀开始时间：2023 年 11 月 11 日 0:0:0
        //秒杀结束时间：2023 年 11 月 11 日 0:10:0

        //小贾下单并付款的时间为：2023 年 11 月 11 日 0:01:18
        //小皮下单并付款的时间为：2023 年 11 月 11 日 0:10:51
        //请用代码说明这两位同学有没有参加上秒杀活动？

        String start = "2023 年 11 月 11 日 0:0:0";
        String itSOver = "2023 年 11 月 11 日 0:10:0";

        String xiaojia = "2023 年 11 月 11 日 0:01:18";
        String xiaopi = "2023 年 11 月 11 日 0:10:51";

        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy 年 MM 月 dd 日 HH:mm:ss");
        Date startdate = sdf1.parse(start);
        Date itSOverdate = sdf1.parse(itSOver);

        Date xiaojiaDate = sdf1.parse(xiaojia);
        Date xiaopiDate = sdf1.parse(xiaopi);

        //日期对象转换毫秒值
        long time1 = startdate.getTime();
        long time2 = itSOverdate.getTime();

        long time3 = xiaojiaDate.getTime();
        long time4 = xiaopiDate.getTime();


        System.out.println("-------方法一----------");
        if (time3 >= time1 && time3 <= time2) {
            System.out.println("小贾参与秒杀");
        } else {
            System.out.println("小贾没有参与秒杀");
        }
        if (time4 >= time1 && time4 <= time2) {
            System.out.println("小皮参与秒杀");
        } else {
            System.out.println("小皮没有参与秒杀");
        }

        //方法二
        System.out.println("-------方法二----------");
        //使用 >= 和 <= 比较日期
        //推荐使用 after() / before() 方法更直观
        //after(): 判断当前日期是否在指定日期之后
        //before(): 判断当前日期是否在指定日期之前
        if (xiaojiaDate.after(startdate) && xiaojiaDate.before(itSOverdate)) {
            System.out.println("小贾参与秒杀");
        } else {
            System.out.println("小贾没有参与秒杀");
        }
        if (xiaopiDate.after(startdate) && xiaopiDate.before(itSOverdate)) {
            System.out.println("小皮参与秒杀");
        } else {
            System.out.println("小皮没有参与秒杀");
        }
    }

}


```

## 十二、Calendar 类(了解)

`Calendar` 类是 Java 中用于处理日期和时间的抽象类，它提供了比 `Date` 类更强大和灵活的日期时间操作功能。可以通过 `Calendar.getInstance()` 方法获取一个 `Calendar` 实例，该实例表示当前系统时间。`Calendar` 类允许对年、月、日、时、分、秒等日期时间字段进行获取、设置、增加和减少等操作。

![](img/13/1667400242406.png)

#### 1. 概述

- java.util.Calendar类表示一个“日历类”，可以进行日期运算。它是一个抽象类，不能创建对象，我们可以使用它的子类：java.util.GregorianCalendar类。
- 有两种方式可以获取GregorianCalendar对象：
  - 直接创建GregorianCalendar对象；
  - 通过Calendar的静态方法getInstance()方法获取GregorianCalendar对象

#### 2. 常用方法

| 方法名                                      | 说明               |
| ---------------------------------------- | ---------------- |
| `public static Calendar getInstance()`   | 获取当前日历对象         |
| `public int get(int field)`              | 获取日历中的某个信息       |
| `public final Date getTime()`            | 获取日期对象           |
| `public long getTimeInMillis()`          | 获取时间毫秒值          |
| `public void set(int field, int value)`  | 修改日历的某个信息        |
| `public void add(int field, int amount)` | 为某个信息增加 / 减少指定的值 |

**注意**：calendar 是可变对象，一旦修改后其对象本身表示的时间将产生变化。

| 方法名                                   | 说明                                                                                                                                                                                                                                       |
| ------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| public static Calendar getInstance()  | 获取一个它的子类GregorianCalendar对象。                                                                                                                                                                                                             |
| public int get(int field)             | 获取某个字段的值。field参数表示获取哪个字段的值，<br />可以使用Calender中定义的常量来表示：<br />Calendar.YEAR : 年<br />Calendar.MONTH ：月<br />Calendar.DAY_OF_MONTH：月中的日期<br />Calendar.HOUR：小时<br />Calendar.MINUTE：分钟<br />Calendar.SECOND：秒<br />Calendar.DAY_OF_WEEK：星期 |
| public void set(int field,int value)  | 设置某个字段的值                                                                                                                                                                                                                                 |
| public void add(int field,int amount) | 为某个字段增加/减少指定的值                                                                                                                                                                                                                           |

#### 3. get方法示例

```java
public class Demo {
    public static void main(String[] args) {
        // 1.获取一个GregorianCalendar对象，通过Calendar的静态方法获取其实例
        Calendar instance = Calendar.getInstance();//获取子类对象

        // 2.打印子类对象，输出Calendar实例的信息
        System.out.println(instance);

        // 3.获取属性
        // 获取年份
        int year = instance.get(Calendar.YEAR);
        // 获取月份，Calendar的月份值是0 - 11，所以需加1转换为实际月份
        int month = instance.get(Calendar.MONTH) + 1;
        // 获取当月日期
        int day = instance.get(Calendar.DAY_OF_MONTH);

        // 获取小时
        int hour = instance.get(Calendar.HOUR);
        // 获取分钟
        int minute = instance.get(Calendar.MINUTE);
        // 获取秒数
        int second = instance.get(Calendar.SECOND);

        // 获取星期，返回值范围：1--7，分别表示："星期日","星期一","星期二",...,"星期六"
        int week = instance.get(Calendar.DAY_OF_WEEK); 

        System.out.println(year + "年" + month + "月" + day + "日" + 
                            hour + ":" + minute + ":" + second);
        System.out.println(getWeek(week));
    }

    // 查表法，查询星期几
    public static String getWeek(int w) {//w = 1 --- 7
        // 做一个表(数组)
        String[] weekArray = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        //            索引      [0]      [1]       [2]      [3]       [4]      [5]      [6]
        // 查表
        return weekArray[w - 1];
    }
}

```

#### 4. set方法示例：

```java
public class Demo {
    public static void main(String[] args) {
        // 设置属性——set(int field,int value):
        // 获取当前日期对应的Calendar实例
        Calendar c1 = Calendar.getInstance(); 

        // 计算班长出生那天是星期几(假如班长出生日期为：1998年3月18日)
        // 设置年份为1998
        c1.set(Calendar.YEAR, 1998); 
        // 设置月份，需转换为Calendar内部的月份值（0 - 11）
        c1.set(Calendar.MONTH, 3 - 1); 
        // 设置当月日期为18
        c1.set(Calendar.DAY_OF_MONTH, 18); 

        // 获取对应的星期值
        int w = c1.get(Calendar.DAY_OF_WEEK); 
        System.out.println("班长出生那天是：" + getWeek(w));
    }
    // 查表法，查询星期几
    public static String getWeek(int w) {//w = 1 --- 7
        // 做一个表(数组)
        String[] weekArray = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        //            索引      [0]      [1]       [2]      [3]       [4]      [5]      [6]
        // 查表
        return weekArray[w - 1];
    }
}
```



#### 5. add方法示例：

```java
public class Demo {
    public static void main(String[] args) {
        // 计算200天以后是哪年哪月哪日，星期几？
        // 获取当前日期对应的Calendar实例
        Calendar c2 = Calendar.getInstance(); 
        // 日期增加200天
        c2.add(Calendar.DAY_OF_MONTH, 200); 

        // 获取增加天数后的年份
        int y = c2.get(Calendar.YEAR); 
        // 获取增加天数后的月份，转换为实际的月份
        int m = c2.get(Calendar.MONTH) + 1; 
        // 获取增加天数后的当月日期
        int d = c2.get(Calendar.DAY_OF_MONTH); 

        // 获取增加天数后的星期值
        int wk = c2.get(Calendar.DAY_OF_WEEK); 
        System.out.println("200天后是：" + y + "年" + m + "月" + d + "日" + getWeek(wk));
    }
    // 查表法，查询星期几
    public static String getWeek(int w) {//w = 1 --- 7
        // 做一个表(数组)
        String[] weekArray = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
        //            索引      [0]      [1]       [2]      [3]       [4]      [5]      [6]
        // 查表
        return weekArray[w - 1];
    }
}
```

## 十三、为什么 JDK8 要新增日期类

在 Java 编程中，日期和时间的处理是常见需求。传统的日期时间类（如 `Date`、`SimpleDateFormat` 和 `Calendar` ）存在诸多问题，因此 JDK8 新增了日期类，具体原因如下：

#### 1. 设计不合理，使用不方便

传统日期时间类中许多方法已过时，这使得代码的可读性和维护性大打折扣。以 `Date` 类为例，其中的 `getYear()` 方法返回的年份是从 1900 年开始计算的偏移量，比如 2024 年，`getYear()` 返回的是 124 ，要得到实际年份就需要额外加上 1900 。这无疑增加了开发人员的心智负担，也容易导致错误。

#### 2. 可变对象问题

传统日期时间类的对象大多是可变的。一旦对对象进行修改操作，最开始的时间信息就会丢失。例如，当使用 `Calendar` 类对日期进行增减操作时，原始的日期信息就被改变了，不利于数据的保护和操作的可追溯性。在复杂的业务逻辑中，很难准确知道时间信息是如何一步步被修改的，这给调试和维护带来很大困难。

#### 3. 线程不安全

在多线程环境下，传统日期时间类存在严重问题。由于它们不是线程安全的，多个线程同时对其进行操作时，可能会导致数据不一致或其他并发问题。比如多个线程同时对 `SimpleDateFormat` 进行日期格式化操作，可能会出现错误的结果。为了保证线程安全，开发人员需要额外编写同步代码，增加了代码的复杂度和性能开销。

#### 4. 精度问题

传统日期时间类的精度只能精确到毫秒。然而，在一些对时间精度要求极高的场景，如金融交易记录、高精度的科学实验数据记录等，毫秒级的精度远远不够，需要精确到纳秒。1 秒等于 1000 毫秒，1 毫秒等于 1000 微秒，1 微秒等于 1000 纳秒，传统类无法满足这种高精度需求。

以下是一个简单的示例代码，展示传统日期时间类的部分问题：

```java
import java.util.Calendar;
import java.util.Date;

/**
 * 目标：搞清楚为什么要用JDK 8开始新增的时间类。
 */
public class Test {
    public static void main(String[] args) {
        // 传统的时间类（Date、SimpleDateFormat、Calendar）存在如下问题：
        // 1、设计不合理，使用不方便，很多都被淘汰了。
        Date d = new Date();
        // System.out.println(d.getYear() + 1900); // getYear方法设计不合理，需额外处理才得实际年份，这里注释掉
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);

        // 2、都是可变对象，修改后会丢失最开始的时间信息。
        // 这里可简单理解为：如果对Calendar对象c做日期修改操作，原始日期信息就没了

        // 3、线程不安全。
        // 多线程同时操作Date、Calendar等对象，可能出数据不一致等问题

        // 4、不能精确到纳秒，只能精确到毫秒。
        // 1秒 = 1000毫秒
        // 1毫秒 = 1000微妙
        // 1微妙 = 1000纳秒
    }
}
```

为了解决上述问题，JDK8 新增了一系列日期时间类，如 `LocalDate`（用于处理日期，不包含时间）、`LocalTime`（用于处理时间，不包含日期）、`LocalDateTime`（同时处理日期和时间）等。这些新类设计更加合理，使用方便，是不可变对象，线程安全，并且支持更高的时间精度，能够更好地满足现代 Java 开发中对日期时间处理的各种需求。


## 十四、JDK8 日期、时间、日期时间

JDK 8 引入了全新的日期时间 API，这些类在设计上更加合理，使用起来更加方便，并且解决了传统日期时间类存在的问题。新的日期时间类将日期、时间、日期时间进行了更细致的划分，提供了丰富的 API 方法，支持时区、时间间隔等操作，同时是不可变对象，线程安全，并且可以精确到纳秒。

![](img/13/1667400655334.png)

#### LocalDate年,月,日 

`LocalDate` 类用于表示日期，不包含时间和时区信息，是不可变对象。它提供了获取日期信息、修改日期、比较日期等方法。

```java
package test11_JDK8_TIime.Demo1_LocalDate_LocalTime_LocalDateTime;

import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        // 1、获取日期对象中的信息
        // 1、获取日期对象中的信息
        int year = ld.getYear(); // 年
        int month = ld.getMonthValue(); // 月 (1-12)
        int day = ld.getDayOfMonth(); // 日
        int dayOfYear = ld.getDayOfYear();  // 一年中的第几天
        int dayOfWeek = ld.getDayOfWeek().getValue(); // 星期几（返回值是1~7，对应周一到周日）

        System.out.println("年: " + year);
        System.out.println("月: " + month);
        System.out.println("日: " + day);
        System.out.println("一年中的第几天: " + dayOfYear);
        System.out.println("星期几: " + dayOfWeek);


        // 2、直接修改某个信息: withYear(修改年份)、withMonth(修改月份)、withDayOfMonth(修改日期)、withDayOfYear(修改一年中的第几天)
        System.out.println("-----修改年------");
        LocalDate ld2 = ld.withYear(2020);
        System.out.println(ld2);
        System.out.println("-----修改月------");
        LocalDate ld3 = ld.withMonth(12);
        System.out.println(ld3);
        System.out.println("-----修改日------");
        LocalDate ld4 = ld.withDayOfMonth(30);
        System.out.println(ld4);
        System.out.println("-----修改一年中的第365天------");
        LocalDate ld5 = ld.withDayOfYear(365);
        System.out.println(ld5);
        System.out.println("-----现在时间------");
        System.out.println(ld);


        // 3、把某个信息加多少: plusYears、plusMonths、plusDays、plusWeeks
        System.out.println("-----加1年------");
        LocalDate ld6 = ld.plusYears(1);
        System.out.println(ld6);
        System.out.println("-----加1月------");
        LocalDate ld7 = ld.plusMonths(1);
        System.out.println(ld7);
        System.out.println("-----加1天------");
        LocalDate ld8 = ld.plusDays(1);
        System.out.println(ld8);
        System.out.println("-----加1周------");
        LocalDate ld9 = ld.plusWeeks(1);
        System.out.println(ld9);
        System.out.println("-----现在时间------");
        System.out.println(ld);


        // 4、把某个信息减多少：minusYears、minusMonths、minusDays、minusWeeks
        System.out.println("-----减10年------");
        LocalDate ld10 = ld.minusYears(10);
        System.out.println(ld10);
        System.out.println("-----减10月------");
        LocalDate ld11 = ld.minusMonths(10);
        System.out.println(ld11);
        System.out.println("-----减10天------");
        LocalDate ld12 = ld.minusDays(10);
        System.out.println(ld12);
        System.out.println("-----减10周------");
        LocalDate ld13 = ld.minusWeeks(10);
        System.out.println(ld13);
        System.out.println("-----现在时间------");
        System.out.println(ld);

        // 5、获取指定日期的LocalDate对象： public static LocalDate of(int year, int month, int dayOfMonth)
        System.out.println("-----获取指定日期的LocalDate对象------");
        LocalDate ld14 = ld.of(2099, 12, 12);
        LocalDate ld15 = ld.of(2099, 12, 12);
        System.out.println(ld15);

        // 6、判断2个日期对象，是否相等，在前还是在后： equals isBefore isAfter
        System.out.println(ld14.equals(ld15));//true
        System.out.println(ld14.isBefore(ld15));//false
        System.out.println(ld14.isAfter(ld));//true
    }
}

```

#### LocalTime时,分,秒 

`LocalTime` 类用于表示时间，不包含日期和时区信息，是不可变对象。它提供了获取时间信息、修改时间、比较时间等方法。

```java
package test11_JDK8_TIime.Demo1_LocalDate_LocalTime_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeTest {
    public static void main(String[] args) {
        // 获取当前时间
        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        // 1、获取时间对象中的信息
        int hour = lt.getHour(); // 时
        int minute = lt.getMinute(); // 分
        int second = lt.getSecond(); // 秒
        int nano = lt.getNano(); // 纳秒

        System.out.println("时: " + hour);
        System.out.println("分: " + minute);
        System.out.println("秒: " + second);
        System.out.println("纳秒: " + nano);

        // 2、直接修改某个信息: withHour(修改小时)、withMinute(修改分钟)、withSecond(修改秒)、withNano(修改纳秒)
        System.out.println("-----修改小时------");
        LocalTime lt2 = lt.withHour(12);
        System.out.println(lt2);
        System.out.println("-----修改分钟------");
        LocalTime lt3 = lt.withMinute(30);
        System.out.println(lt3);
        System.out.println("-----修改秒------");
        LocalTime lt4 = lt.withSecond(15);
        System.out.println(lt4);
        System.out.println("-----修改纳秒------");
        LocalTime lt5 = lt.withNano(500000000);
        System.out.println(lt5);
        System.out.println("-----现在时间------");
        System.out.println(lt);

        // 3、把某个信息加多少: plusHours、plusMinutes、plusSeconds、plusNanos
        System.out.println("-----加1小时------");
        LocalTime lt6 = lt.plusHours(1);
        System.out.println(lt6);
        System.out.println("-----加15分钟------");
        LocalTime lt7 = lt.plusMinutes(15);
        System.out.println(lt7);
        System.out.println("-----加30秒------");
        LocalTime lt8 = lt.plusSeconds(30);
        System.out.println(lt8);
        System.out.println("-----加100000000纳秒------");
        LocalTime lt9 = lt.plusNanos(100000000);
        System.out.println(lt9);
        System.out.println("-----现在时间------");
        System.out.println(lt);

        // 4、把某个信息减多少：minusHours、minusMinutes、minusSeconds、minusNanos
        System.out.println("-----减2小时------");
        LocalTime lt10 = lt.minusHours(2);
        System.out.println(lt10);
        System.out.println("-----减20分钟------");
        LocalTime lt11 = lt.minusMinutes(20);
        System.out.println(lt11);
        System.out.println("-----减45秒------");
        LocalTime lt12 = lt.minusSeconds(45);
        System.out.println(lt12);
        System.out.println("-----减200000000纳秒------");
        LocalTime lt13 = lt.minusNanos(200000000);
        System.out.println(lt13);
        System.out.println("-----现在时间------");
        System.out.println(lt);

        // 5、获取指定时间的LocalTime对象： public static LocalTime of(int hour, int minute, int second, int nanoOfSecond)
        System.out.println("-----获取指定时间的LocalTime对象------");
        LocalTime lt14 = LocalTime.of(14, 30, 15, 500000000);
        LocalTime lt15 = LocalTime.of(14, 30, 15, 500000000);
        System.out.println(lt15);

        // 6、判断2个时间对象，是否相等，在前还是在后： equals isBefore isAfter
        System.out.println(lt14.equals(lt15)); // true
        System.out.println(lt14.isBefore(lt15)); // false
        System.out.println(lt14.isAfter(lt)); // 结果取决于当前时间

        // 7、可以把LocalDateTime转换成LocalDate和LocalTime
        // public LocalDate toLocalDate()
        // public LocalTime toLocalTime()
        // public static LocalDateTime of(LocalDate date, LocalTime time)
        LocalDateTime ldt = LocalDateTime.now();
        LocalDate ld = ldt.toLocalDate();
        LocalTime lt16 = ldt.toLocalTime();
        System.out.println(ld);
        System.out.println(lt16);
        LocalDateTime ldt2 = LocalDateTime.of(ld, lt16);
        System.out.println(ldt2);


    }
}
```

#### LocalDateTime年,月,日,时,分,秒 

`LocalDateTime` 类用于表示日期和时间，不包含时区信息，是不可变对象。它结合了 `LocalDate` 和 `LocalTime` 的功能，提供了获取日期时间信息、修改日期时间、比较日期时间等方法，还可以转换为 `LocalDate` 和 `LocalTime` 对象。

```java
package test11_JDK8_TIime.Demo1_LocalDate_LocalTime_LocalDateTime;

import java.time.LocalDateTime;

public class LocaDateTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // 1、获取日期时间对象中的信息
        int year = ldt.getYear(); // 年
        int month = ldt.getMonthValue(); // 月 (1-12)
        int day = ldt.getDayOfMonth(); // 日
        int dayOfYear = ldt.getDayOfYear();  // 一年中的第几天
        int dayOfWeek = ldt.getDayOfWeek().getValue(); // 星期几（返回值是1~7，对应周一到周日）
        int hour = ldt.getHour(); // 时
        int minute = ldt.getMinute(); // 分
        int second = ldt.getSecond(); // 秒

        System.out.println("年: " + year);
        System.out.println("月: " + month);
        System.out.println("日: " + day);
        System.out.println("一年中的第几天: " + dayOfYear);
        System.out.println("星期几: " + dayOfWeek);
        System.out.println("时: " + hour);
        System.out.println("分: " + minute);
        System.out.println("秒: " + second);

        // 2、直接修改某个信息: withYear(修改年份)、withMonth(修改月份)、withDayOfMonth(修改日期)、withDayOfYear(修改一年中的第几天)
        // 还有 withHour(修改小时)、withMinute(修改分钟)、withSecond(修改秒)
        System.out.println("-----修改年------");
        LocalDateTime ldt2 = ldt.withYear(2020);
        System.out.println(ldt2);
        System.out.println("-----修改月------");
        LocalDateTime ldt3 = ldt.withMonth(12);
        System.out.println(ldt3);
        System.out.println("-----修改日------");
        LocalDateTime ldt4 = ldt.withDayOfMonth(30);
        System.out.println(ldt4);
        System.out.println("-----修改一年中的第365天------");
        LocalDateTime ldt5 = ldt.withDayOfYear(365);
        System.out.println(ldt5);
        System.out.println("-----修改小时------");
        LocalDateTime ldt6 = ldt.withHour(12);
        System.out.println(ldt6);
        System.out.println("-----现在时间------");
        System.out.println(ldt);

        // 3、把某个信息加多少: plusYears、plusMonths、plusDays、plusWeeks
        // 还有 plusHours、plusMinutes、plusSeconds
        System.out.println("-----加1年------");
        LocalDateTime ldt7 = ldt.plusYears(1);
        System.out.println(ldt7);
        System.out.println("-----加1月------");
        LocalDateTime ldt8 = ldt.plusMonths(1);
        System.out.println(ldt8);
        System.out.println("-----加1天------");
        LocalDateTime ldt9 = ldt.plusDays(1);
        System.out.println(ldt9);
        System.out.println("-----加1周------");
        LocalDateTime ldt10 = ldt.plusWeeks(1);
        System.out.println(ldt10);
        System.out.println("-----加1小时------");
        LocalDateTime ldt11 = ldt.plusHours(1);
        System.out.println(ldt11);
        System.out.println("-----现在时间------");
        System.out.println(ldt);

        // 4、把某个信息减多少：minusYears、minusMonths、minusDays、minusWeeks
        // 还有 minusHours、minusMinutes、minusSeconds
        System.out.println("-----减10年------");
        LocalDateTime ldt12 = ldt.minusYears(10);
        System.out.println(ldt12);
        System.out.println("-----减10月------");
        LocalDateTime ldt13 = ldt.minusMonths(10);
        System.out.println(ldt13);
        System.out.println("-----减10天------");
        LocalDateTime ldt14 = ldt.minusDays(10);
        System.out.println(ldt14);
        System.out.println("-----减10周------");
        LocalDateTime ldt15 = ldt.minusWeeks(10);
        System.out.println(ldt15);
        System.out.println("-----减10小时------");
        LocalDateTime ldt16 = ldt.minusHours(10);
        System.out.println(ldt16);
        System.out.println("-----现在时间------");
        System.out.println(ldt);

        // 5、获取指定日期时间的LocalDateTime对象： public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
        System.out.println("-----获取指定日期时间的LocalDateTime对象------");
        LocalDateTime ldt17 = LocalDateTime.of(2099, 12, 12, 12, 30, 0);
        LocalDateTime ldt18 = LocalDateTime.of(2099, 12, 12, 12, 30, 0);
        System.out.println(ldt18);

        // 6、判断2个日期时间对象，是否相等，在前还是在后： equals isBefore isAfter
        System.out.println(ldt17.equals(ldt18));//true
        System.out.println(ldt17.isBefore(ldt18));//false
        System.out.println(ldt17.isAfter(ldt));//true
    }
}
```


## 十五、JDK8 日期（时区）

由于世界各个国家和地区的经度不同，存在不同的时区，为了处理不同时区的日期和时间，JDK 8 引入了 `ZoneId` 和 `ZonedDateTime` 类。`ZoneId` 表示时区标识符，可用于获取系统默认时区、所有可用时区等信息；`ZonedDateTime` 表示带时区的日期和时间，可根据指定的时区获取相应的日期时间信息。

![1667400888534](img/13/1667400888534.png)

![](img/13/时区图.png)

| JDK8时间类类名    | 作用                   |
| ----------------- | ---------------------- |
| ZoneId            | 时区                   |
| Instant           | 时间戳                 |
| ZoneDateTime      | 带时区的时间           |
| DateTimeFormatter | 用于时间的格式化和解析 |
| LocalDate         | 年、月、日             |
| LocalTime         | 时、分、秒             |
| LocalDateTime     | 年、月、日、时、分、秒 |
| Duration          | 时间间隔（秒，纳，秒） |
| Period            | 时间间隔（年，月，日） |
| ChronoUnit        | 时间间隔（所有单位）   |

```java
package test11_JDK8_TIime.Demo1_LocalDate_LocalTime_LocalDateTime;

import java.time.Clock;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneId_ZonedDateTime {
    public static void main(String[] args) {
        // 目标：了解时区和带时区的时间。
        // 1、ZoneId的常见方法：
        // 获取Java支持的全部时区Id
        System.out.println("------获取Java支持的全部时区Id-------");
        System.out.println(ZoneId.getAvailableZoneIds());

        // 获取系统默认的时区
        ZoneId timeZone = ZoneId.systemDefault();
        System.out.println("------获取系统默认时区-------");
        System.out.println(timeZone.getId());
        System.out.println(timeZone);

        // 把某个时区id封装成ZoneId对象，这里封装纽约时区
        ZoneId zoneId1 = ZoneId.of("America/New_York");

        // 2、ZonedDateTime：带时区的时间。
        // 获取美国（纽约时区）现在时间
        System.out.println("------获取美国现在的时间-------");
        ZonedDateTime zdt1 = ZonedDateTime.now(zoneId1);
        System.out.println(zdt1);

        // 获取世界标准时间
        System.out.println("------获取世界标准时间-------");
        ZoneId zoneId2 = ZoneId.of("UTC");
        ZonedDateTime zdt2 = ZonedDateTime.now(zoneId2);
        System.out.println(zdt2);
        // 简写方式获取世界标准时间
        ZonedDateTime zdt3 = ZonedDateTime.now(ZoneId.of("UTC"));
        System.out.println(zdt3);

        // 获取系统默认时区的ZonedDateTime对象
        System.out.println("------获取系统默认时区的ZonedDateTime对象-------");
        ZonedDateTime zdt4 = ZonedDateTime.now();
        System.out.println(zdt4);

        // Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(zoneId1));
    }
}
```





## 十六、JDK8日期（格式化器）

DateTimeFormater用于对日期和时间进行格式化以及解析操作，解决日期时间在文本与对象间转换的问题 ，是 JDK 8 新增日期时间 API 的重要组成部分。它代替了原来的SimpleDateFormat类。

![1667401511710](img/13/1667401511710.png)

需要用到的方法，如下表所示

**1：DateTimeFormatter 相关方法**

| 方法名                                                | 说明             |
| ----------------------------------------------------- | ---------------- |
| `public static DateTimeFormatter ofPattern(时间格式)` | 获取格式化器对象 |
| `public String format(时间对象)`                      | 格式化时间       |

 **2：LocalDateTime 提供的格式化、解析时间的方法**

| 方法名                                                       | 说明       |
| ------------------------------------------------------------ | ---------- |
| `public String format(DateTimeFormatter formatter)`          | 格式化时间 |
| `public static LocalDateTime parse(CharSequence text, DateTimeFormatter formatter)` | 解析时间   |

接下来，将上面的方法用代码来演示一下

```java
public class DateTimeFormatterTest {
    public static void main(String[] args) {
        // 1、创建一个日期时间格式化器对象出来。
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss ");

        // 2、格式化时间
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        String rs = formatter.format(now); // 正向格式化
        System.out.println(rs);

        // 3、格式化时间，其实还有一种方案。
        String rs2 = now.format(formatter); // 反向格式化
        System.out.println(rs2);

        // 4、解析时间：解析时间一般使用LocalDateTime提供的解析方法来解析。
        String dateStr = "2029年12月12日 12:12:11";
        LocalDateTime ldt = LocalDateTime.parse(dateStr, formatter);
        System.out.println(ldt);
    }
}
```



## 十七、JDK8日期（Period类）

在 Java 中，`Period`类属于`java.time`包 ，用于表示时间段或周期，主要处理年、月、日等较大时间单位，方便进行日期和时间的计算与操作，比如计算两个日期之间的差值、表示任务执行的时间段等 

![1667401637360](img/13/1667401637360.png)

Period类的用法如下表所示。可以用来计算两个日期之间相隔的年、相隔的月、相隔的日。**只能两个计算LocalDate对象之间的间隔**

| 方法名                                                       | 说明                                |
| ------------------------------------------------------------ | ----------------------------------- |
| `public static Period between(LocalDate start, LocalDate end)` | 传入 2 个日期对象，得到 Period 对象 |
| `public int getYears()`                                      | 计算间隔的年数并返回                |
| `public int getMonths()`                                     | 计算间隔的月数并返回                |
| `public int getDays()`                                       | 计算间隔的天数并返回                |
```java
public class PeriodTest {
    public static void main(String[] args) {
        // 定义起始日期为2020年1月1日
        LocalDate start = LocalDate.of(2020, 1, 1);
        // 定义结束日期为2021年12月2日
        LocalDate end = LocalDate.of(2021, 12, 2);

        // 计算起始日期到结束日期之间的期间
        Period period = Period.between(start, end);
        // 打印期间的详细信息，输出格式为 PnYnMnD，n 分别代表年、月、日的数量
        System.out.println(period); // 输出: P1Y11M1D
        // 打印期间的年数
        System.out.println(period.getYears()); // 输出: 1
        // 打印期间的月数
        System.out.println(period.getMonths()); // 输出: 11
        // 打印期间的天数
        System.out.println(period.getDays()); // 输出: 1
    }
}
```



## 十八、JDK8日期（Duration类）

接下来，我们学习Duration类。它是用来表示两个时间对象的时间间隔。**可以用于计算两个时间对象相差的天数、小时数、分数、秒数、纳秒数；支持LocalTime、LocalDateTime、Instant等时间**

需要用到的方法，如下表所示:

| 方法名                                                       | 说明                                  |
| ------------------------------------------------------------ | ------------------------------------- |
| `public static Duration between(开始时间对象1,截止时间对象2)` | 传入 2 个时间对象，得到 Duration 对象 |
| `public long toDays()`                                       | 计算间隔天数并返回                    |
| `public long toHours()`                                      | 计算间隔小时数并返回                  |
| `public long toMinutes()`                                    | 计算间隔分钟数并返回                  |
| `public long toSeconds()`                                    | 计算间隔秒数并返回                    |
| `public long toMillis()`                                     | 计算间隔毫秒数并返回                  |
| `public long toNanos()`                                      | 计算间隔纳秒数并返回                  |

```java
public class DurationDemo {
    public static void main(String[] args) {
        LocalDateTime start = LocalDateTime.of(2025, 11, 11, 11, 10, 10);
        LocalDateTime end = LocalDateTime.of(2025, 11, 11, 11, 11, 11);
        // 1、得到Duration对象
        Duration duration = Duration.between(start, end);

        // 2、获取两个时间对象间隔的信息
        System.out.println(duration.toDays());// 间隔多少天
        System.out.println(duration.toHours());// 间隔多少小时
        System.out.println(duration.toMinutes());// 间隔多少分
        System.out.println(duration.toSeconds());// 间隔多少秒
        System.out.println(duration.toMillis());// 间隔多少毫秒
        System.out.println(duration.toNanos());// 间隔多少纳秒

    }
}
```


# 十九、ChronoUnit  时间间隔（所有单位）

**1. 定义与作用**

`ChronoUnit` 是 Java 8 引入的 `java.time.temporal` 包中的一个枚举类，它代表了各种标准的时间单位，为日期和时间的计算提供了统一、方便的方式。通过使用 `ChronoUnit`，可以在不同的日期和时间对象（如 `LocalDate`、`LocalDateTime`、`Instant` 等）之间进行灵活的时间量计算和操作。

**2. 常用枚举常量**

| 枚举常量  | 说明                                 |
| --------- | ------------------------------------ |
| `DAYS`    | 天，用于计算两个日期之间相差的天数   |
| `WEEKS`   | 周，计算两个日期之间相差的周数       |
| `MONTHS`  | 月，计算两个日期之间相差的月数       |
| `YEARS`   | 年，计算两个日期之间相差的年数       |
| `HOURS`   | 小时，计算两个时间点之间相差的小时数 |
| `MINUTES` | 分钟，计算两个时间点之间相差的分钟数 |
| `SECONDS` | 秒，计算两个时间点之间相差的秒数     |
| `MILLIS`  | 毫秒，计算两个时间点之间相差的毫秒数 |
| `NANOS`   | 纳秒，计算两个时间点之间相差的纳秒数 |

**3. 常用方法**

| 方法名                                                    | 说明                                                         |
| --------------------------------------------------------- | ------------------------------------------------------------ |
| `between(Temporal startInclusive, Temporal endExclusive)` | 计算两个时间对象之间该时间单位的差值。例如：`ChronoUnit.DAYS.between(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 10))` 会返回 9 |
| `addTo(Temporal temporal, long amount)`                   | 在给定的时间对象上增加指定数量的该时间单位。例如：`LocalDate newDate = ChronoUnit.DAYS.addTo(LocalDate.of(2023, 1, 1), 5);` 会得到 2023 年 1 月 6 日 |
| `isSupportedBy(Temporal temporal)`                        | 判断指定的时间对象是否支持该时间单位的操作。例如：`ChronoUnit.YEARS.isSupportedBy(LocalDate.now())` 会返回 `true` |

**4. 应用场景**

- **日期计算**：计算两个日期之间的间隔，如计算员工入职到现在的年数、月数或天数。
- **时间调整**：在某个日期或时间上增加或减少一定的时间单位，如将会议时间推迟 1 小时。
- **定时任务**：根据时间单位设置任务的执行间隔，如每隔 30 分钟执行一次定时任务。

**5. 示例代码**

```java
public class ChronoUniTest {
    public static void main(String[] args) {
        // 当前时间
        LocalDateTime today = LocalDateTime.now();
        System.out.println(today);
        // 生日时间
        LocalDateTime birthDate = LocalDateTime.of(2004, 9, 12, 0, 0, 0);
        System.out.println(birthDate);

        System.out.println("相差的年数:" + ChronoUnit.YEARS.between(birthDate, today));
        System.out.println("相差的月数:" + ChronoUnit.MONTHS.between(birthDate, today));
        System.out.println("相差的周数:" + ChronoUnit.WEEKS.between(birthDate, today));
        System.out.println("相差的天数:" + ChronoUnit.DAYS.between(birthDate, today));
        System.out.println("相差的时数:" + ChronoUnit.HOURS.between(birthDate, today));
        System.out.println("相差的分数:" + ChronoUnit.MINUTES.between(birthDate, today));
        System.out.println("相差的秒数:" + ChronoUnit.SECONDS.between(birthDate, today));
        System.out.println("相差的毫秒数:" + ChronoUnit.MILLIS.between(birthDate, today));
        System.out.println("相差的微秒数:" + ChronoUnit.MICROS.between(birthDate, today));
        System.out.println("相差的纳秒数:" + ChronoUnit.NANOS.between(birthDate, today));
        System.out.println("相差的半天数:" + ChronoUnit.HALF_DAYS.between(birthDate, today));
        System.out.println("相差的十年数:" + ChronoUnit.DECADES.between(birthDate, today));
        System.out.println("相差的世纪(百年)数:" + ChronoUnit.CENTURIES.between(birthDate, today));
        System.out.println("相差的千年数:" + ChronoUnit.MILLENNIA.between(birthDate, today));
        System.out.println("相差的纪元数:" + ChronoUnit.ERAS.between(birthDate, today));
    }
}

```

**6. 优缺点**

- 优点
  - **统一的时间单位表示**：提供了一套标准的时间单位，避免了不同开发人员使用不同方式表示时间单位的混乱。
  - **与新日期时间 API 集成良好**：可以方便地与 Java 8 引入的新日期时间类（如 `LocalDate`、`LocalDateTime` 等）配合使用。
  - **操作简便**：通过枚举常量和方法，使得日期和时间的计算变得简洁易懂。
- 缺点
  - **对于复杂时间单位支持有限**：虽然提供了常见的时间单位，但对于一些非常特殊或复杂的时间单位，可能无法直接支持。
  - **学习成本**：对于不熟悉 Java 8 新日期时间 API 的开发人员来说，需要一定的时间来学习和掌握 `ChronoUnit` 的使用。
