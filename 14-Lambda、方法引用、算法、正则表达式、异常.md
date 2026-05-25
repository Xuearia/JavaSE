---
sticker: ""
---
# day14-Lambda、方法引用、算法、正则表达式

## 一、Arrays类

接下来我们学习的类叫做Arrays，其实Arrays并不是重点，但是我们通过Arrays这个类的学习有助于我们理解下一个知识点Lambda的学习。所以我们这里先学习Arrays，再通过Arrays来学习Lamdba这样学习会更丝滑一些^_^.

**Arrays基本使用**

我们先认识一下Arrays是干什么用的，Arrays是操作数组的工具类，它可以很方便的对数组中的元素进行遍历、拷贝、排序等操作。

下面我们用代码来演示一下：**遍历、拷贝、排序等操作**。需要用到的方法如下

| 方法名                                                                   | 说明                |
| --------------------------------------------------------------------- | ----------------- |
| `public static String toString(类型[] arr)`                             | 返回数组的内容           |
| `public static int[] copyOfRange(类型[] arr, 起始索引, 结束索引)`               | 拷贝数组（指定范围）        |
| `public static copyOf(类型[] arr, int newLength)`                       | 拷贝数组              |
| `public static setAll(double[] array, IntToDoubleFunction generator)` | 把数组中的原数据改为新数据     |
| `public static void sort(类型[] arr)`                                   | 对数组进行排序 (默认是升序排序) |

### 1、`toString` 方法

**方法说明**

`public static String toString(类型[] arr)`：将指定的数组转换为字符串形式，方便直观地查看数组中的元素内容。

**代码示例**

```java
int[] arr = {10, 20, 30, 40, 50, 60};
// 使用 Arrays 的 toString 方法将数组转换为字符串并输出
System.out.println(Arrays.toString(arr));
```

**代码注释说明**

1. 首先创建了一个 `int` 类型的数组 `arr`，包含了一些整数元素。
2. 然后调用 `Arrays.toString(arr)` 方法，该方法会将数组 `arr` 转换为字符串，字符串形式为包含数组元素的方括号内的内容，如 `[10, 20, 30, 40, 50, 60]`，并通过 `System.out.println` 方法输出转换后的字符串。

### 2、`copyOfRange` 方法

**方法说明**

`public static 类型[] copyOfRange(类型[] arr, 起始索引, 结束索引)`：从给定的数组 `arr` 中拷贝指定范围的元素到一个新数组，拷贝的范围是从 `起始索引`（包含）到 `结束索引`（不包含）。

**代码示例**

```java
int[] arr = {10, 20, 30, 40, 50, 60};
// 从 arr 数组中拷贝索引 2（包含）到 5（不包含）的元素到新数组 arr2
int[] arr2 = Arrays.copyOfRange(arr, 2, 5);
// 输出拷贝后的数组 arr2
System.out.println(Arrays.toString(arr2));
```

**代码注释说明**

1. 先创建了数组 `arr`。
2. 接着调用 `Arrays.copyOfRange(arr, 2, 5)` 方法，从数组 `arr` 中拷贝索引为 2 到 4 的元素（因为结束索引 5 不包含）到新数组 `arr2`。
3. 最后通过 `System.out.println(Arrays.toString(arr2))` 输出新数组 `arr2` 的字符串形式，展示拷贝后的结果。

### 3、`copyOf` 方法

**方法说明**

`public static 类型[] copyOf(类型[] arr, int newLength)`：拷贝指定的数组 `arr` 到一个新数组，并可以指定新数组的长度。如果 `newLength` 大于原数组长度，多余的位置会用该类型的默认值填充（例如 `int` 类型默认值为 `0`）。

**代码示例**

```java
int[] arr = {10, 20, 30, 40, 50, 60};
// 拷贝 arr 数组，新数组长度为 10，多余位置用默认值（对于 int 是 0）填充到新数组 arr3
int[] arr3 = Arrays.copyOf(arr, 10);
// 输出拷贝且指定长度后的数组 arr3
System.out.println(Arrays.toString(arr3));
```

**代码注释说明**

1. 创建数组 `arr`。
2. 调用 `Arrays.copyOf(arr, 10)` 方法，将<font color="#4f81bd">数组</font> `arr` 拷贝到新数组 `arr3`，新数组长度为 10。如果原数组 `arr` 长度小于 10，多余位置用 `int` 类型默认值 `0` 填充。
3. 使用 `System.out.println(Arrays.toString(arr3))` 输出新数组 `arr3` 的字符串形式，查看拷贝和填充后的结果。

### 4、`setAll` 方法

**方法说明**

`public static void setAll(double[] array, IntToDoubleFunction generator)`：根据提供的函数 `generator` 来修改数组 `array` 中的每个元素。`IntToDoubleFunction` 是一个函数式接口，`applyAsDouble` 方法接受数组元素的索引作为参数，并返回一个 `double` 类型的值，用于更新数组元素。

**代码示例**

```java
double[] proces = {99.3, 128, 100};
// 使用 setAll 方法，将数组 proces 中的每个元素打八折
Arrays.setAll(proces, new IntToDoubleFunction() {
    @Override
    public double applyAsDouble(int value) {
        // 根据索引获取原数组元素并乘以 0.8
        return proces[value] * 0.8;
    }
});
// 输出打折后的数组 proces
System.out.println(Arrays.toString(proces));
```

**代码注释说明**

1. 创建 `double` 类型数组 `proces`，存储一些价格数据。
2. 调用 `Arrays.setAll(proces, new IntToDoubleFunction() {... })` 方法，通过匿名内部类实现 `IntToDoubleFunction` 接口的 `applyAsDouble` 方法，将数组 `proces` 中的每个元素乘以 `0.8`（即打八折）。
3. 使用 `System.out.println(Arrays.toString(proces))` 输出打折后的数组 `proces` 的字符串形式，展示修改后的结果。

### 5、`sort` 方法

**方法说明**

`public static void sort(类型[] arr)`：对指定的数组 `arr` 进行升序排序，改变原数组的元素顺序为升序。

**代码示例**

```java
double[] proces = {99.3, 128, 100};
// 对价格数组 proces 进行升序排序
Arrays.sort(proces);
// 输出排序后的数组 proces
System.out.println(Arrays.toString(proces));
```

**代码注释说明**

1. 创建 `double` 类型数组 `proces`。
2. 调用 `Arrays.sort(proces)` 方法，对数组 `proces` 进行升序排序，原数组元素顺序改变为升序。
3. 通过 `System.out.println(Arrays.toString(proces))` 输出排序后的数组 `proces` 的字符串形式，查看排序结果。

### 6、`Arrays` 操作对象数组

当数组中存储的元素类型是自定义的对象时，直接使用 `Arrays.sort` 方法会报错，因为 `Arrays` 不知道按照什么规则进行排序。以下是两种让 `Arrays` 知道排序规则的方法：

**1. 让对象类实现 `Comparable` 接口并实现 `compareTo` 方法**

自定义的类（如 `Student` 类）实现 `Comparable<Student>` 接口，并重写 `compareTo` 方法，`Arrays` 的 `sort` 方法底层会根据 `compareTo` 方法的返回值（正数、负数、0）来确定对象的大小关系。

```java
public class Student implements Comparable<Student> {
    private String name;
    private double height;
    private int age;

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        // 约定1：认为左边对象 大于 右边对象 请您返回正整数
        // 约定2：认为左边对象 小于 右边对象 请您返回负整数
        // 约定3：认为左边对象 等于 右边对象 请您一定返回0
        // 按照年龄升序排列
        return this.age - o.age; 
        // 按照年龄降序排列
        // return o.age - this.age; 
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
```

测试类代码：

```java
public class ArraysTest2 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        studnets[0] = new Student("张三", 170.3, 18);
        studnets[1] = new Student("李四", 180.3, 19);
        studnets[2] = new Student("王五", 190.3, 20);
        studnets[3] = new Student("赵六", 200.3, 21);

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}
```

**2. 使用 `Arrays.sort(数组, Comparator 比较器)` 传递比较器对象**

在调用 `Arrays.sort` 方法时，除了传递要排序的数组外，还传递一个 `Comparator` 比较器对象，`Arrays` 的 `sort` 方法底层会根据 `Comparator` 比较器对象的 `compare` 方法的返回值（正数、负数、0）来确定对象的大小关系。

```java
import java.util.Comparator;

public class ArraysTest2 {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        studnets[0] = new Student("张三", 170.3, 18);
        studnets[1] = new Student("李四", 180.3, 19);
        studnets[2] = new Student("王五", 190.3, 20);
        studnets[3] = new Student("赵六", 200.3, 21);

        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                // 制定比较规则：左边对象 o1   右边对象 o2
                // 约定1：认为左边对象 大于 右边对象 请您返回正整数
                // 约定2：认为左边对象 小于 右边对象 请您返回负整数
                // 约定3：认为左边对象 等于 右边对象 请您一定返回0
                // 按照身高升序排列
                return Double.compare(o1.getHeight(), o2.getHeight()); 
                // 按照身高降序排列
                // return Double.compare(o2.getHeight(), o1.getHeight()); 
            }
        });
        System.out.println(Arrays.toString(students));
    }
}
```

通过以上两种方式，就可以使用 `Arrays` 对自定义对象数组进行排序了。



## 二、Lambda表达式

接下来，我们学习一个JDK8新增的一种语法形式，叫做Lambda表达式。**作用：用于简化匿名内部类代码的书写。**

### 1. Lambda表达式基本使用

怎么去简化呢？Lamdba是有特有的格式的，按照下面的格式来编写Lamdba。

```java
(被重写方法的形参列表) -> {
    被重写方法的方法体代码;
}
```

需要给说明一下的是，在使用Lambda表达式之前，必须先有一个接口，而且接口中只能有一个抽象方法。**（注意：不能是抽象类，只能是接口）**

像这样的接口，我们称之为函数式接口，只有基于函数式接口的匿名内部类才能被Lambda表达式简化。

```java
public interface Swimming{
    void swim();
}
```

有了以上的Swimming接口之后，接下来才能再演示，使用Lambda表达式，简化匿名内部类书写。

```java
public class LambdaTest1 {
    public static void main(String[] args) {
        // 目标：认识Lambda表达式.
        //1.创建一个Swimming接口的匿名内部类对象
		Swimming s = new Swimming(){
             @Override
             public void swim() {
                 System.out.println("学生快乐的游泳~~~~");
             }
         };
         s.swim();
		
        //2.使用Lambda表达式对Swimming接口的匿名内部类进行简化
        Swimming s1 = () -> {
              System.out.println("学生快乐的游泳~~~~");
        };
        s1.swim();
    }
}
```

好的，我们现在已经知道Lamdba表达式可以简化基于函数式接口的匿名内部类的书写。接下来，我们可以把刚才使用Arrays方法时的代码，使用Lambda表达式简化一下了。

```java
public class LambdaTest2 {
    public static void main(String[] args) {
        // 目标：使用Lambda简化函数式接口。
        double[] prices = {99.8, 128, 100};
		//1.把所有元素*0.8: 先用匿名内部类写法
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                // value = 0  1  2
                return prices[value] * 0.8;
            }
        });
		//2.把所有元素*0.8: 改用Lamdba表达式写法
        Arrays.setAll(prices, (int value) -> {
                return prices[value] * 0.8;
        });

        System.out.println(Arrays.toString(prices));
        System.out.println("-----------------------------------------------");
		
        Student[] students = new Student[4];
        studnets[0] = new Student("张三", 170.3, 18);
        studnets[1] = new Student("李四", 180.3, 19);
        studnets[2] = new Student("王五", 190.3, 20);
        studnets[3] = new Student("赵六", 200.3, 21);
		//3.对数组中的元素按照年龄升序排列: 先用匿名内部类写法
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight()); // 升序
            }
        });
		//4.对数组中的元素按照年龄升序排列: 改用Lambda写法
        Arrays.sort(students, (Student o1, Student o2) -> {
                return Double.compare(o1.getHeight(), o2.getHeight()); // 升序
        });
        System.out.println(Arrays.toString(students));
    }
}
```

好的，各位同学，恭喜大家！到这里，你已经学会了Lambda表达式的基本使用了。



### 2. Lambda表达式省略规则

刚才我们学习了Lambda表达式的基本使用。Java觉得代码还不够简单，于是还提供了Lamdba表达式的几种简化写法。具体的简化规则如下

```java
1.Lambda的标准格式
	(参数类型1 参数名1, 参数类型2 参数名2)->{
		...方法体的代码...
		return 返回值;
	}

2.在标准格式的基础上()中的参数类型可以直接省略
	(参数名1, 参数名2)->{
		...方法体的代码...
		return 返回值;
	}
	
3.如果{}总的语句只有一条语句，则{}可以省略、return关键字、以及最后的“;”都可以省略
	(参数名1, 参数名2)-> 结果
	
4.如果()里面只有一个参数，则()可以省略
	(参数名)->结果
```

接下来从匿名内部类开始、到Lambda标准格式、再到Lambda简化格式，一步一步来简化一下。同学们体会一下简化的过程。

```java
public class LambdaTest2 {
    public static void main(String[] args) {
        // 目标：使用Lambda简化函数式接口。
        double[] prices = {99.8, 128, 100};
		//1.对数组中的每一个元素*0.8: 匿名内部类写法
        Arrays.setAll(prices, new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                // value = 0  1  2
                return prices[value] * 0.8;
            }
        });
		//2.需求：对数组中的每一个元素*0.8,使用Lambda表达式标准写法
        Arrays.setAll(prices, (int value) -> {
                return prices[value] * 0.8;
        });
		//3.使用Lambda表达式简化格式1——省略参数类型
        Arrays.setAll(prices, (value) -> {
            return prices[value] * 0.8;
        });
		//4.使用Lambda表达式简化格式2——省略()
        Arrays.setAll(prices, value -> {
            return prices[value] * 0.8;
        });
        //5.使用Lambda表达式简化格式3——省略{}
        Arrays.setAll(prices, value -> prices[value] * 0.8 );

        System.out.println(Arrays.toString(prices));
        
        System.out.println("------------------------------------

        Student[] students = new Student[4];
        studnets[0] = new Student("张三", 170.3, 18);
        studnets[1] = new Student("李四", 180.3, 19);
        studnets[2] = new Student("王五", 190.3, 20);
        studnets[3] = new Student("赵六", 200.3, 21);
		
        //1.使用匿名内部类
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return Double.compare(o1.getHeight(), o2.getHeight()); // 升序
            }
        });
		//2.使用Lambda表达式表达式——标准格式
        Arrays.sort(students, (Student o1, Student o2) -> {
                return Double.compare(o1.getHeight(), o2.getHeight()); // 升序
        });
		//3.使用Lambda表达式表达式——省略参数类型
        Arrays.sort(students, ( o1,  o2) -> {
            return Double.compare(o1.getHeight(), o2.getHeight()); // 升序
        });
		//4.使用Lambda表达式表达式——省略{}
        Arrays.sort(students, ( o1,  o2) -> Double.compare(o1.getHeight(), o2.getHeight()));


        System.out.println(Arrays.toString(students));
    }
}
```

到这里，恭喜你，对Lamdba表达式的所有写法，就学习完毕了。



## 三、JDK8新特性（方法引用）

### (一)、方法引用简介

在 JDK8 里有个超棒的新特性，叫做方法引用。我们先了解下它的 “前辈” Lambda 表达式，它能简化匿名代码的书写格式。而方法引用更厉害，它是用来进一步简化 Lambda 表达式的。虽然学习新东西可能会有点难，让人心里抗拒，但学会后能大大简化代码，提高写代码的效率。而且这些新语法都有特定的使用场景，就算没学会，用以前的方法也没问题。

### (二)、静态方法引用

#### 1. 初始代码

```java
import java.util.Arrays;
import java.util.Comparator;

// 定义学生类
class Student {
    private String name;
    private double height;
    private int age;

    public Student(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}

public class Test1 {
    public static void main(String[] args) {
        // 创建学生对象数组
        Student[] students = new Student[4];
        studnets[0] = new Student("张三", 170.3, 18);
        studnets[1] = new Student("李四", 180.3, 19);
        studnets[2] = new Student("王五", 190.3, 20);
        studnets[3] = new Student("赵六", 200.3, 21);

        // 原始写法：使用匿名内部类对学生数组按年龄升序排序
        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        // 使用 Lambda 表达式简化后的写法
        Arrays.sort(students, (o1, o2) -> o1.getAge() - o2.getAge());
    }
}
```

**解释**：

- 首先定义了 `Student` 类，包含学生的姓名、身高和年龄。
- 在 `Test1` 类的 `main` 方法里，创建了一个 `Student` 对象数组，并初始化了 4 个学生对象。
- 接着使用 `Arrays.sort` 方法对学生数组进行排序。原始写法是通过匿名内部类实现 `Comparator` 接口的 `compare` 方法，根据学生年龄进行比较。而 Lambda 表达式则简化了这个过程，直接用 `(o1, o2) -> o1.getAge() - o2.getAge()` 来表示比较逻辑。

#### 2. 封装比较逻辑到静态方法

```java
class CompareByData {
    public static int compareByAge(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }
}
```

**解释**：
创建了 `CompareByData` 类，其中的 `compareByAge` 方法是静态方法，它接收两个 `Student` 对象作为参数，返回值是两个学生年龄的差值，实现了按年龄升序排序的逻辑。

#### 3. 使用静态方法改进 Lambda 表达式

```java
Arrays.sort(students, (o1, o2) -> CompareByData.compareByAge(o1, o2));
```

**解释**：
把 Lambda 表达式里的比较逻辑替换成调用 `CompareByData` 类的 `compareByAge` 静态方法，功能和之前的 Lambda 表达式是一样的。

#### 4. 静态方法引用

```java
Arrays.sort(students, CompareByData::compareByAge);
```

**解释**：
这就是静态方法引用的写法，格式是 `类名::方法名`。这里直接用 `CompareByData::compareByAge` 来表示排序的比较逻辑，省略了参数部分，代码变得更简洁。

### (三)、实例方法引用

#### 1. 添加实例方法

```java
class CompareByData {
    public static int compareByAge(Student o1, Student o2) {
        return o1.getAge() - o2.getAge();
    }

    public int compareByAgeDesc(Student o1, Student o2) {
        return o2.getAge() - o1.getAge();
    }
}
```

**解释**：
在 `CompareByData` 类中添加了一个实例方法 `compareByAgeDesc`，用于按年龄降序排序。和静态方法不同，实例方法需要通过对象来调用。

#### 2. 使用对象调用实例方法的 Lambda 表达式

```java
CompareByData compare = new CompareByData();
Arrays.sort(students, (o1, o2) -> compare.compareByAgeDesc(o1, o2));//降序
```

**解释**：
先创建了 `CompareByData` 类的对象 `compare`，然后在 Lambda 表达式里通过这个对象调用 `compareByAgeDesc` 方法，实现按年龄降序排序。

* 将Lambda表达式的方法体，直接改成方法引用写法。**实际上就是用类名调用方法，但是省略的参数**。这就是实例方法引用

#### 3. 实例方法引用

```java
CompareByData compare = new CompareByData();
Arrays.sort(students, compare::compareByAgeDesc);//降序
```

**解释**：
这是实例方法引用的写法，格式是 `对象名::方法名`。通过对象 `compare` 引用 `compareByAgeDesc` 方法，同样省略了参数，让代码更简洁。

### (四)、特定类型的方法引用

```
Java约定：
    如果某个Lambda表达式里只是调用一个实例方法，并且前面参数列表中的第一个参数作为方法的主调，	后面的所有参数都是作为该实例方法的入参时，则就可以使用特定类型的方法引用。
格式：
	类型::方法名
```

#### 1. 示例代码

```java
import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        // 创建字符串数组
        String[] names = {"boby", "angela", "Andy", "dlei", "caocao", "Babo", "jack", "Cici"};

        // 原始写法：使用匿名内部类对字符串数组忽略首字符大小写进行排序
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });

        // 使用 Lambda 表达式简化后的写法
        Arrays.sort(names, (o1, o2) -> o1.compareToIgnoreCase(o2));

        // 特定类型的方法引用
        Arrays.sort(names, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(names));
    }
}
```

**解释**：

- 定义了一个字符串数组 `names`。
- 原始写法通过匿名内部类实现 `Comparator` 接口的 `compare` 方法，调用 `compareToIgnoreCase` 方法来忽略首字符大小写进行字符串比较。
- Lambda 表达式简化了这个过程，直接用 `(o1, o2) -> o1.compareToIgnoreCase(o2)` 表示比较逻辑。
- 特定类型的方法引用 `String::compareToIgnoreCase` 则更简洁，当 Lambda 表达式只是调用一个实例方法，且参数列表中第一个参数作为方法的主调，后面的参数作为该实例方法的入参时，就可以用这种写法。

### (五)、构造器引用(了解)

**构造器引用在实际开发中应用的并不多，目前还没有找到构造器的应用场景。所以只是关注语法即可。**

#### 1. 定义 Car 类

```java
class Car {
    private String name;
    private double price;

    public Car() {
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
```

**解释**：
定义了 `Car` 类，包含汽车的名称和价格属性，还有相应的构造方法、`getter` 和 `setter` 方法以及 `toString` 方法。

#### 2. 定义函数式接口

```java
interface CreateCar {
    Car create(String name, double price);
}
```

**解释**：
定义了一个函数式接口 `CreateCar`，其中的 `create` 方法返回一个 `Car` 对象，接收汽车的名称和价格作为参数。

先用匿名内部类创建、再用`Lambda`表达式创建，最后改用方法引用创建。只关注格式就可以，不需要去想为什么（语法就是这么设计的）

#### 3. 创建接口实现类对象的不同方式

```java
public class Test3 {
    public static void main(String[] args) {
        // 1、使用匿名内部类创建接口实现类对象
        CreateCar cc1 = new CreateCar() {
            @Override
            public Car create(String name, double price) {
                return new Car(name, price);
            }
        };

        // 2、使用 Lambda 表达式创建接口实现类对象
        CreateCar cc2 = (name, price) -> new Car(name, price);

        // 3、使用方法引用改进：构造器引用
        CreateCar cc3 = Car::new;

        // 4、对象调用方法
        Car car = cc3.create("奔驰", 49.9);
        System.out.println(car);
    }
}
```



**解释**：

- 首先用匿名内部类的方式实现 `CreateCar` 接口的 `create` 方法，创建 `Car` 对象。
- 然后用 Lambda 表达式简化了这个过程，直接用 `(name, price) -> new Car(name, price)` 来表示创建 `Car` 对象的逻辑。
- 最后使用构造器引用 `Car::new`，它是方法引用的一种特殊形式，用来创建对象，让代码更加简洁。
- 最后通过 `cc3.create("奔驰", 49.9)` 调用 `create` 方法创建一个 `Car` 对象并打印输出。





## 四、常见算法

### 1. 认识算法

1. **定义**：算法是解决特定问题的一系列明确且有限的操作步骤。它就像是一份详细的菜谱，告诉计算机如何从输入数据得出期望的输出结果。例如，计算两个数的平均值，算法会规定先将两数相加，再除以 2，这些步骤构成了一个简单算法。
2. 特性
   - **有穷性**：算法必须在执行有限个步骤后结束。以计算 1 到 100 的累加和为例，无论使用何种算法，都不会无休止地计算下去，最终一定会得出结果。
   - **确定性**：算法的每一步骤都有确切的含义，不会产生歧义。比如在计算矩形面积的算法中，明确是长乘以宽，不存在其他模糊不清的操作解释。
   - **可行性**：算法中的所有操作都能够通过已有的基本运算，经过有限次执行来完成。在计算机编程中，这些基本运算包括加、减、乘、除等算术运算，以及逻辑判断等操作。
   - **输入**：算法可以有零个或多个输入。零输入的情况，如计算圆周率的近似值，不需要额外输入数据；而在计算圆的面积时，需要输入半径这个数据，就是一个输入的例子。
   - **输出**：算法必须有一个或多个输出，用于展示对输入数据处理后的结果。例如排序算法，输入无序的数据序列，输出的是经过排序后的有序序列。
3. 表示方法
   - **自然语言**：用人们日常使用的语言（如中文、英文）来描述算法。优点是通俗易懂，任何人都能大致理解。例如，描述求两个数中较大数的算法：“比较这两个数，数值大的那个数就是结果”。然而，对于复杂算法，用自然语言描述会显得冗长，且容易产生歧义。
   - **流程图**：通过图形符号（如矩形表示操作步骤、菱形表示判断条件等）和流程线来直观呈现算法的执行流程。它的优势在于清晰地展示算法的逻辑结构，让人一目了然。但绘制流程图相对繁琐，对于大规模复杂算法，流程图可能会变得庞大且复杂，不利于阅读和维护。
   - **伪代码**：一种介于自然语言和实际编程语言之间的表示方式。它采用类似编程语言的语法结构，但更侧重于描述算法的核心逻辑，而不过多关注具体的语法细节。伪代码简洁明了，既能准确表达算法思路，又不像自然语言那样冗长和易产生歧义，同时也不像编程语言那样有严格的语法限制。不同人编写的伪代码可能在风格上略有差异，但核心逻辑是一致的。



### 2. 冒泡排序

先来学习冒泡排序，先来介绍一下，冒泡排序的流程

```java
冒泡排序核心思路：每次将相邻的两个元素继续比较
如下图所示：
   第一轮比较 3次
   第二轮比较 2次
   第三轮比较 1次
```

![1667403618904](img/14/1667403618904.png)

```java
public class Test1 {
    public static void main(String[] args) {
        // 1、准备一个数组
        int[] arr = {5, 2, 3, 1};

        // 2、定义一个循环控制排几轮
        for (int i = 0; i < arr.length - 1; i++) {
            // i = 0  1  2           【5， 2， 3， 1】    次数
            // i = 0 第一轮            0   1   2         3
            // i = 1 第二轮            0   1             2
            // i = 2 第三轮            0                 1

            // 3、定义一个循环控制每轮比较几次。
            for (int j = 0; j < arr.length - i - 1; j++) {
                // 判断当前位置的元素值，是否大于后一个位置处的元素值，如果大则交换。
                if(arr[j] > arr[j+1]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
```

1. **整体功能**：这段代码实现了冒泡排序算法，将给定的整数数组 `arr` 按照从小到大的顺序进行排序，并输出排序后的数组。
2. **代码拆分讲解**：
   - **准备数组**：

```java
int[] arr = {5, 2, 3, 1};
```

这里定义了一个整数数组 `arr`，并初始化了数组元素为 `{5, 2, 3, 1}`，这是待排序的数组。

- **外层循环（控制排序轮数）**：

```java
for (int i = 0; i < arr.length - 1; i++) {
    // 内层循环及元素比较交换逻辑
}
```

外层 `for` 循环用于控制冒泡排序的轮数。对于一个长度为 `n` 的数组，只需要进行 `n - 1` 轮排序就可以使数组有序。循环变量 `i` 从 `0` 开始，每次递增 `1`，直到 `i < arr.length - 1`。每一轮排序都会将当前未排序部分的最大元素 “冒泡” 到数组的末尾。

- **内层循环（控制每轮比较次数）**：

```java
for (int j = 0; j < arr.length - i - 1; j++) {
    // 判断当前位置的元素值，是否大于后一个位置处的元素值，如果大则交换。
    if(arr[j] > arr[j+1]){
        int temp = arr[j + 1];
        arr[j + 1] = arr[j];
        arr[j] = temp;
    }
}
```

内层 `for` 循环用于在每一轮中比较相邻的元素并进行交换。循环变量 `j` 从 `0` 开始，每次递增 `1`，直到 `j < arr.length - i - 1`。这里 `arr.length - i - 1` 的作用是，随着排序轮数 `i` 的增加，每一轮需要比较的元素个数会逐渐减少，因为每一轮结束后，最大的元素已经在数组末尾，下一轮就不需要再比较该元素了。

- **元素交换逻辑**：

```java
if(arr[j] > arr[j+1]){
    int temp = arr[j + 1];
    arr[j + 1] = arr[j];
    arr[j] = temp;
}
```

在内层循环中，通过 `if` 语句判断当前位置 `j` 的元素是否大于它后面位置 `j + 1` 的元素，如果大于则交换这两个元素的值。交换过程借助一个临时变量 `temp`，先将 `arr[j + 1]` 的值存储在 `temp` 中，然后将 `arr[j]` 的值赋给 `arr[j + 1]`，最后将 `temp` 的值赋给 `arr[j]`。

- **输出排序后的数组**：

```java
System.out.println(Arrays.toString(arr));
```

当外层循环结束，数组已经完成排序，使用 `Arrays.toString(arr)` 将排序后的数组转换为字符串形式并输出，这样可以直观地看到排序后的结果。

综上所述，这段代码通过两层 `for` 循环实现了冒泡排序算法，将给定数组按照从小到大的顺序进行了排序并输出结果。





### 3. 选择排序

每一轮从待排序的数据元素中选出最小（或最大）的一个元素，存放在序列的起始位置，直到全部待排序的数据元素排完。

选择排序的核心思路是:每一轮选定一个固定的元素，和其他的每一个元素进行比较；经过几轮比较之后，每一个元素都能比较到了。

![1667467347586](img/14/1667467347586.png)

接下来，按照选择排序的流程编写代码

```java
ublic class Test2 {
    public static void main(String[] args) {
        // 1、准备好一个数组
        int[] arr = {5, 1, 3, 2};
        //           0  1  2  3

        // 2、控制选择几轮
        for (int i = 0; i < arr.length - 1; i++) {
            // i = 0 第一轮    j = 1 2 3
            // i = 1 第二轮    j = 2 3
            // i = 2 第三轮    j = 3
            // 3、控制每轮选择几次。
            for (int j = i + 1; j < arr.length; j++) {
                // 判断当前位置是否大于后面位置处的元素值，若大于则交换。
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
```

**代码拆分讲解**

** 1. 主方法 `main`**

```java
public static void main(String[] args) {
    // 1、准备好一个数组
    int[] arr = {5, 1, 3, 2};
    //           0  1  2  3
```

- **数组准备**：创建了一个整数数组 `arr`，并初始化其元素为 `{5, 1, 3, 2}`。这个数组就是待排序的数组，数组的索引从 `0` 到 `arr.length - 1`。

**2. 外层循环（控制排序轮数）**

```java
for (int i = 0; i < arr.length - 1; i++) {
    // i = 0 第一轮    j = 1 2 3
    // i = 1 第二轮    j = 2 3
    // i = 2 第三轮    j = 3
```

- 外层 `for` 循环用于控制选择排序的轮数。对于一个长度为 `n` 的数组，选择排序需要进行 `n - 1` 轮，所以循环条件是 `i < arr.length - 1`。在每一轮中，都会确定一个最小元素并将其放到合适的位置。

**3. 内层循环（控制每轮选择操作）**

```java
for (int j = i + 1; j < arr.length; j++) {
    // 判断当前位置是否大于后面位置处的元素值，若大于则交换。
    if(arr[i] > arr[j]){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
```

- **内层循环初始化**：内层 `for` 循环的起始索引为 `i + 1`，结束条件是 `j < arr.length`。其中 `i` 是外层循环的循环变量，`j` 是内层循环的循环变量。`j = i + 1` 的原因是，在每一轮中，`arr[i]` 被当作当前未排序部分的第一个元素，我们从 `arr[i + 1]` 开始遍历，找到最小的元素与 `arr[i]` 交换。
- **元素比较与交换**：`if (arr[i] > arr[j])` 用于比较当前 `arr[i]` 和 `arr[j]` 的大小。如果 `arr[i]` 大于 `arr[j]`，则交换它们的值。交换操作借助一个临时变量 `temp`，先将 `arr[i]` 的值存储在 `temp` 中，然后将 `arr[j]` 的值赋给 `arr[i]`，最后将 `temp` 的值赋给 `arr[j]`。

**4. 输出排序后的数组**

```java
System.out.println(Arrays.toString(arr));
```

当外层循环结束时，数组已经完成排序。使用 `Arrays.toString(arr)` 方法将排序后的数组转换为字符串形式并输出，这样可以直观地看到排序后的结果。



### 4. 查找算法

接下来，我们学习一个查找算法叫做二分查找。在学习二分查找之前，我们先来说一下基本查找，从基本查找的弊端，我们再引入二分查找，这样我们的学习也会更加丝滑一下。

**先聊一聊基本查找：**假设我们要查找的元素是81，如果是基本查找的话，只能从0索引开始一个一个往后找，但是如果元素比较多，你要查找的元素比较靠后的话，这样查找的此处就比较多。性能比较差。

![1667467611576](img/14/1667467611576.png)

**再讲二分查找**：二分查找的主要特点是，每次查找能排除一般元素，这样效率明显提高。**但是二分查找要求比较苛刻，它要求元素必须是有序的，否则不能进行二分查找。**

- 二分查找的核心思路

```java
第1步：先定义两个变量，分别记录开始索引(left)和结束索引(right)
第2步：计算中间位置的索引，mid = (left+right)/2;
第3步：每次查找中间mid位置的元素，和目标元素key进行比较
		如果中间位置元素比目标元素小，那就说明mid前面的元素都比目标元素小
			此时：left = mid+1
    	如果中间位置元素比目标元素大，那说明mid后面的元素都比目标元素大
    		此时：right = mid-1
		如果中间位置元素和目标元素相等，那说明mid就是我们要找的位置
			此时：把mid返回		
注意：一搬查找一次肯定是不够的，所以需要把第1步和第2步循环来做，只到left>end就结束，如果最后还没有找到目标元素，就返回-1.
```

![1667468412882](img/14/1667468412882.png)

```java
/**
 * 目标：掌握二分查找算法。
 */
public class Test3 {
    public static void main(String[] args) {
        // 1、准备好一个数组。
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};

        System.out.println(binarySearch(arr, 150));

        System.out.println(Arrays.binarySearch(arr, 81));
    }

    public static int binarySearch(int[] arr, int data){
        // 1、定义两个变量，一个站在左边位置，一个站在右边位置
        int left = 0;
        int right = arr.length - 1;

        // 2、定义一个循环控制折半。
        while (left <= right){
            // 3、每次折半，都算出中间位置处的索引
            int middle = (left + right) / 2;
            // 4、判断当前要找的元素值，与中间位置处的元素值的大小情况。
            if(data < arr[middle]){
                // 往左边找，截止位置（右边位置） = 中间位置 - 1
                right = middle - 1;
            }else if(data > arr[middle]){
                // 往右边找，起始位置（左边位置） = 中间位置 + 1
                left = middle + 1;
            }else {
                // 中间位置处的元素值，正好等于我们要找的元素值
                return middle;
            }
        }
        return -1; // -1特殊结果，就代表没有找到数据！数组中不存在该数据！
    }
}
```

### 深度剖析

- **初始化查找区间**：
  - `int left = 0;`：定义变量 `left` 表示查找区间的左边界，初始化为数组的第一个元素的索引。
  - `int right = arr.length - 1;`：定义变量 `right` 表示查找区间的右边界，初始化为数组的最后一个元素的索引。
- **循环控制折半查找**：
  - `while (left <= right)`：使用 `while` 循环进行折半查找，只要左边界 `left` 小于等于右边界 `right`，就继续查找。
- **计算中间位置索引**：
  - `int middle = (left + right) / 2;`：在每次循环中，计算当前查找区间的中间位置的索引 `middle`。
- **比较目标元素与中间元素**：
  - `if(data < arr[middle])`：如果目标元素 `data` 小于中间位置的元素 `arr[middle]`，说明目标元素可能在左半部分，将右边界 `right` 更新为 `middle - 1`，缩小查找范围到左半部分。
  - `else if(data > arr[middle])`：如果目标元素 `data` 大于中间位置的元素 `arr[middle]`，说明目标元素可能在右半部分，将左边界 `left` 更新为 `middle + 1`，缩小查找范围到右半部分。
  - `else`：如果目标元素 `data` 等于中间位置的元素 `arr[middle]`，说明找到了目标元素，返回中间位置的索引 `middle`。
- **未找到目标元素**：
  - `return -1;`：如果循环结束后仍然没有找到目标元素，说明目标元素不在数组中，返回 `-1` 表示未找到。

## 五、正则表达式

正则表达式其实是由一些特殊的符号组成的，它代表的是某种规则。**

> 正则表达式的作用1：用来校验字符串数据是否合法
>
> 正则表达式的作用2：可以从一段文本中查找满足要求的内容

![1667468712516](img/14/1667468712516.png)

### 1. 正则表达式初体验

现在，我们就以QQ号码为例，来体验一下正则表达式的用法。注意：现在仅仅只是体验而已，我们还没有讲正则表达式的具体写法。

- 不使用正则表达式，校验QQ号码代码是这样的

```java
public static boolean checkQQ(String qq){
        // 1、判断qq号码是否为null
        if(qq == null || qq.startsWith("0") || qq.length() < 6 || qq.length() > 20){
            return false;
        }

        // 2、qq至少是不是null,不是以0开头的，满足6-20之间的长度。
        // 判断qq号码中是否都是数字。
        // qq = 2514ghd234
        for (int i = 0; i < qq.length(); i++) {
            // 根据索引提取当前位置处的字符。
            char ch = qq.charAt(i);
            // 判断ch记住的字符，如果不是数字，qq号码不合法。
            if(ch < '0' || ch > '9'){
                return false;
            }
        }
        // 3、说明qq号码肯定是合法
        return true;
    }
```

- 用正则表达式代码是这样的

```java
public static boolean checkQQ1(String qq){
    return qq != null && qq.matches("[1-9]\\d{5,19}");
}
```

我们发现，使用正则表达式，大大简化的了代码的写法。这个代码现在不用写，体验到正则表达式的优势就可以了。



### 5.2 正则表达式书写规则

前面我们已经体验到了正则表达式，可以简化校验数据的代码书写。这里需要用到一个方法叫`matches(String regex)`。这个方法时属于String类的方法。

![1667469085970](img\14\1667469085970.png)

这个方法是用来匹配一个字符串是否匹配正则表达式的规则，参数需要调用者传递一个正则表达式。但是正则表达式不能乱写，是有特定的规则的。

下面我们就学习一下，正则表达式的规则。从哪里学呢？在API中有一个类叫做Pattern，我们可以到API文档中搜索，关于正则表达式的规则，这个类都告诉我们了。我这里把常用的已经给大家整理好了。



![1667469259345](img\14\1667469259345.png)

我们将这些规则，在代码中演示一下

```java
/**
 * 目标：掌握正则表达式的书写规则
 */
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
```



### 5.3 正则表达式应用案例

学习完正则表达式的规则之后，接下来我们再利用正则表达式，去校验几个实际案例。

- 正则表达式校验手机号码

```java
/**
 * 目标：校验用户输入的电话、邮箱、时间是否合法。
 */
public class RegexTest3 {
    public static void main(String[] args) {
        checkPhone();
    }

    public static void checkPhone(){
        while (true) {
            System.out.println("请您输入您的电话号码(手机|座机): ");
            Scanner sc = new Scanner(System.in);
            String phone = sc.nextLine();
            // 18676769999  010-3424242424 0104644535
            if(phone.matches("(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})")){
                System.out.println("您输入的号码格式正确~~~");
                break;
            }else {
                System.out.println("您输入的号码格式不正确~~~");
            }
        }
    }
}
```

- 使用正则表达式校验邮箱是否正确

```java
public class RegexTest3 {
    public static void main(String[] args) {
        checkEmail();
    }

    public static void checkEmail(){
        while (true) {
            System.out.println("请您输入您的邮箱： ");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            /**
             * dlei0009@163.com
             * 25143242@qq.com
             * itheima@itcast.com.cn
             */
            if(email.matches("\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2}")){
                System.out.println("您输入的邮箱格式正确~~~");
                break;
            }else {
                System.out.println("您输入的邮箱格式不正确~~~");
            }
        }
    }
}

```



### 5.4 正则表达式信息爬取

各位小伙伴，在前面的课程中，我们学习了正则表达式的作用之一，用来校验数据格式的正确性。接下来我们学习**正则表达式的第二个作用：在一段文本中查找满足要求的内容**

我们还是通过一个案例给大家做演示：案例需求如下

![](D:\笔记\java\img\14\电话爬取.png)

```java
/**
 * 目标：掌握使用正则表达式查找内容。
 */
public class RegexTest4 {
    public static void main(String[] args) {
        method1();
    }

    // 需求1：从以下内容中爬取出，手机，邮箱，座机、400电话等信息。
    public static void method1(){
        String data = " 电话：1866668888，18699997777\n" +      
                "        或者联系邮箱：boniu@itcast.cn，\n" +
                "        座机电话：01036517895，010-98951256\n" +
                "        邮箱：bozai@itcast.cn，\n" +
                "        邮箱：dlei0009@163.com，\n" +
                "        热线电话：400-618-9090 ，400-618-4000，4006184000，4006189090";
        // 1、定义爬取规则
        String regex = "(1[3-9]\\d{9})|(0\\d{2,7}-?[1-9]\\d{4,19})|(\\w{2,}@\\w{2,20}(\\.\\w{2,10}){1,2})"
                + "|(400-?\\d{3,7}-?\\d{3,7})";
        // 2、把正则表达式封装成一个Pattern对象
        Pattern pattern = Pattern.compile(regex);
        // 3、通过pattern对象去获取查找内容的匹配器对象。
        Matcher matcher = pattern.matcher(data);
        // 4、定义一个循环开始爬取信息
        while (matcher.find()){
            String rs = matcher.group(); // 获取到了找到的内容了。
            System.out.println(rs);
        }
    }
}
```



### 5.5 正则表达式搜索、替换

接下来，我们学习一下正则表达式的另外两个功能，替换、分割的功能。需要注意的是这几个功能需要用到Stirng类中的方法。这两个方法其实我们之前学过，只是当时没有学正则表达式而已。

| 方法名                                                  | 说明                                                       |
| ------------------------------------------------------- | ---------------------------------------------------------- |
| `public String replaceAll(String regex, String newStr)` | 按照正则表达式匹配的内容进行替换                           |
| `public String[] split(String regex)`                   | 按照正则表达式匹配的内容进行分割字符串，返回一个字符串数组 |

```java
/**
 * 目标：掌握使用正则表达式做搜索替换，内容分割。
 */
public class RegexTest5 {
    public static void main(String[] args) {
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
```



## 六、异常

### 1.1 认识异常

接下来，我们学习一下异常，学习异常有利于我们处理程序中可能出现的问题。我先我们认识一下，什么是异常？

我们阅读下面的代码，通过这段代码来认识异常。 我们调用一个方法时，经常一部小心就出异常了，然后在控制台打印一些异常信息。其实打印的这些异常信息，就叫做异常。

那肯定有同学就纳闷了，我写代码天天出异常，我知道这是异常啊！我们这里学习异常，其实是为了告诉你异常是怎么产生的？只有你知道异常是如何产生的，才能避免出现异常。以及产生异常之后如何处理。

![1667312695257](img/14/1667312695257.png)



因为写代码时经常会出现问题，Java的设计者们早就为我们写好了很多个异常类，来描述不同场景下的问题。而有些类是有共性的所以就有了异常的继承体系

![](img/14/异常.png)



> **先来演示一个运行时异常产生**

```java
int[] arr = {11,22,33};
//5是一个不存在的索引，所以此时产生ArrayIndexOutOfBoundsExcpetion
System.out.println(arr[5]); 
```

下图是API中对ArrayIndexOutOfBoundsExcpetion类的继承体系，以及告诉我们它在什么情况下产生。

![1667313567748](img/14/1667313567748.png)

> **再来演示一个编译时异常**

我们在调用SimpleDateFormat对象的parse方法时，要求传递的参数必须和指定的日期格式一致，否则就会出现异常。 Java比较贴心，它为了更加强烈的提醒方法的调用者，设计了编译时异常，它把异常的提醒提前了，你调用方法是否真的有问题，只要可能有问题就给你报出异常提示（红色波浪线）。

 **编译时异常的目的：意思就是告诉你，你小子注意了！！，这里小心点容易出错，仔细检查一下**

![1667313705048](img/14/1667313705048.png)

有人说，我检查过了，我确认我的代码没问题，为了让它不报错，继续将代码写下去。我们这里有两种解决方案。

- 第一种：使用throws在方法上声明，意思就是告诉下一个调用者，这里面可能有异常啊，你调用时注意一下。

```java
/**
 * 目标：认识异常。
 */
public class ExceptionTest1 {
    public static void main(String[] args) throws ParseException{
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2028-11-11 10:24");
        System.out.println(d);
    }
}
```

- 第二种：使用try...catch语句块异常进行处理。

```java
public class ExceptionTest1 {
    public static void main(String[] args) throws ParseException{
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse("2028-11-11 10:24");
            System.out.println(d);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
```

好了，关于什么是异常，我们就先认识到这里。



### 1.2 自定义异常

我们经过刚才的学习已经认识了什么是异常了，但是无法为这个世界上的全部问题都提供异常类，如果企业自己的某种问题，想通过异常来表示，那就需要自己来定义异常类了。

我们通过一个实际场景，来给大家演示自定义异常。

> 需求：写一个saveAge(int age)方法，在方法中对参数age进行判断，如果age<0或者>=150就认为年龄不合法，如果年龄不合法，就给调用者抛出一个年龄非法异常。
>
> 分析：Java的API中是没有年龄非常这个异常的，所以我们可以自定义一个异常类，用来表示年龄非法异常，然后再方法中抛出自定义异常即可。

- 先写一个异常类AgeIllegalException（这是自己取的名字，名字取得很奈斯），继承

```java
// 1、必须让这个类继承自Exception，才能成为一个编译时异常类。
public class AgeIllegalException extends Exception{
    public AgeIllegalException() {
    }

    public AgeIllegalException(String message) {
        super(message);
    }
}
```

- 再写一个测试类，在测试类中定义一个saveAge(int age)方法，对age判断如果年龄不在0~150之间，就抛出一个AgeIllegalException异常对象给调用者。

```java
public class ExceptionTest2 {
    public static void main(String[] args) {
        // 需求：保存一个合法的年
        try {
            saveAge2(225);
            System.out.println("saveAge2底层执行是成功的！");
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("saveAge2底层执行是出现bug的！");
        }
    }

	//2、在方法中对age进行判断，不合法则抛出AgeIllegalException
    public static void saveAge(int age){
        if(age > 0 && age < 150){
            System.out.println("年龄被成功保存： " + age);
        }else {
            // 用一个异常对象封装这个问题
            // throw 抛出去这个异常对象
            throw new AgeIllegalRuntimeException("/age is illegal, your age is " + age);
        }
    }
}
```

- 注意咯，自定义异常可能是编译时异常，也可以是运行时异常

```java
1.如果自定义异常类继承Excpetion，则是编译时异常。
	特点：方法中抛出的是编译时异常，必须在方法上使用throws声明，强制调用者处理。
	
2.如果自定义异常类继承RuntimeException，则运行时异常。
	特点：方法中抛出的是运行时异常，不需要在方法上用throws声明。
```



### 1.3 异常处理

同学们，通过前面两小节的学习，我们已经认识了什么是异常，以及异常的产生过程。接下来就需要告诉同学们，出现异常该如何处理了。

比如有如下的场景：A调用用B，B调用C；C中有异常产生抛给B，B中有异常产生又抛给A；异常到了A这里就不建议再抛出了，因为最终抛出被JVM处理程序就会异常终止，并且给用户看异常信息，用户也看不懂，体验很不好。

此时比较好的做法就是：1.将异常捕获，将比较友好的信息显示给用户看；2.尝试重新执行，看是是否能修复这个问题。

![1667315686041](img/14/1667315686041.png)

我们看一个代码，main方法调用test1方法，test1方法调用test2方法，test1和test2方法中多有扔异常。

- 第一种处理方式是，在main方法中对异常进行try...catch捕获处理了，给出友好提示。

```java
public class ExceptionTest3 {
    public static void main(String[] args)  {
        try {
            test1();
        } catch (FileNotFoundException e) {
            System.out.println("您要找的文件不存在！！");
            e.printStackTrace(); // 打印出这个异常对象的信息。记录下来。
        } catch (ParseException e) {
            System.out.println("您要解析的时间有问题了！");
            e.printStackTrace(); // 打印出这个异常对象的信息。记录下来。
        }
    }

    public static void test1() throws FileNotFoundException, ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = sdf.parse("2028-11-11 10:24:11");
        System.out.println(d);
        test2();
    }

    public static void test2() throws FileNotFoundException {
        // 读取文件的。
        InputStream is = new FileInputStream("D:/meinv.png");
    }
}
```

- 第二种处理方式是：在main方法中对异常进行捕获，并尝试修复

```java
/**
 * 目标：掌握异常的处理方式：捕获异常，尝试修复。
 */
public class ExceptionTest4 {
    public static void main(String[] args) {
        // 需求：调用一个方法，让用户输入一个合适的价格返回为止。
        // 尝试修复
        while (true) {
            try {
                System.out.println(getMoney());
                break;
            } catch (Exception e) {
                System.out.println("请您输入合法的数字！！");
            }
        }
    }

    public static double getMoney(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请您输入合适的价格：");
            double money = sc.nextDouble();
            if(money >= 0){
                return money;
            }else {
                System.out.println("您输入的价格是不合适的！");
            }
        }
    }
}
```

好了，到此我们关于异常的知识就全部学习完了。









