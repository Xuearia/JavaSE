---
color: ""
---
### **一、什么是 `static`？**

`static` 是 Java 中的一个关键字，意为 **“静态”**。被 `static` 修饰的成员（变量、方法、代码块）属于 **类本身**，而非类的对象（实例）。
**核心特点**：

- 无需创建对象，直接通过 **类名** 访问。
- 静态成员在类加载时创建，早于对象存在。

### **二、`static` 修饰成员变量（类变量）**

#### **1. 类变量 vs 实例变量**

| **类型**     | **是否用 `static`** | **属于谁**           | **访问方式** | **内存存储** | **案例**                      |
| ------------ | ------------------- | -------------------- | ------------ | ------------ | ----------------------------- |
| **类变量**   | ✅推荐               | 类（所有对象共享）   | 类名。变量名 | 静态存储区   | 班级总人数（`totalStudents`） |
| **实例变量** | ❌不推荐             | 对象（每个对象独立） | 对象。变量名 | 堆内存       | 学生姓名（`name`）            |

![](img/09/1663977705413.png)

#### **2. 案例：统计班级人数**

**需求**：记录班级总人数，每创建一个学生对象，总人数自动增加。

```java
public class Student {
    // 类变量：班级总人数（所有学生共享）
    static int totalStudents; 

    // 实例变量：学生姓名（每个学生独立）
    String name; 

    // 构造方法：创建学生时总人数+1
    public Student(String name) {
        this.name = name;
        totalStudents++; // 直接访问类变量
    }

    public static void main(String[] args) {
        // 创建学生对象
        Student s1 = new Student("楷楷");
        Student s2 = new Student("小雨");
        Student s3 = new Student("小阳");

        // 用类名访问类变量，输出总人数
        System.out.println("班级总人数：" + Student.totalStudents); // 输出：3
    }
}
```

#### **3. 核心说明**：

- **类变量 `totalStudents`** 属于 `Student` 类，无论创建多少学生对象，始终只有一份数据。
- 每次通过 `new Student()` 创建对象时，构造方法会执行 `totalStudents++`，实现数据共享。
- **类名调用**：`Student.totalStudents` 直接获取总人数，无需对象。

### **三、`static` 修饰成员方法（类方法）**

#### **1. 类方法 vs 实例方法**

| **类型**     | **是否用 `static`** | **属于谁** | **调用方式**    | **能否访问实例成员** | **案例**                   |
| ------------ | ------------------- | ---------- | --------------- | -------------------- | -------------------------- |
| **类方法**   | ✅推荐               | 类         | 类名。方法名 () | 不能（无对象）       | 工具类方法（如生成验证码） |
| **实例方法** | ❌不推荐             | 对象       | 对象。方法名 () | 能（有对象）         | 学生学习方法（`study()`）  |

#### **2. 案例：工具类 - 生成随机验证码**

- 如果一个类中的方法全都是静态的，那么这个类中的方法就全都可以被类名直接调用，由于调用起来非常方便，就像一个工具一下，所以把这样的类就叫做工具类。

**需求**：设计一个工具类，生成指定长度的随机验证码，供登录和注册界面直接调用。

```java
package Study1_static.d3_util;

import java.util.Random;

public class MyUtil {
    // 私有化构造方法：禁止创建对象（工具类无需实例）
    private MyUtil() {}

    // 类方法：生成 n 位随机验证码
    public static String createCode(int n) {
        String data = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder code = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(data.length()); // 随机索引
            code.append(data.charAt(index)); // 拼接字符
        }
        return code.toString();
    }
}
```

#### **3. 使用示例**：

```java
// 登录界面调用（生成4位验证码）
package Study1_static.d3_util;
public class test1_LoginDemo {
    public static void main(String[] args) {
        String loginCode = MyUtil.createCode(4); // 类名直接调用
        System.out.println("登录验证码：" + loginCode); // 输出：如 "a2Bx"
    }
}

// 注册界面调用（生成6位验证码）
package Study1_static.d3_util;
public class test2_UserRegistration {
    public static void main(String[] args) {
        String regCode = MyUtil.createCode(6); // 类名直接调用
        System.out.println("注册验证码：" + regCode); // 输出：如 "3Xk9qA"
    }
}
```

#### **4. 核心说明**：

- **类方法 `createCode`** 属于 `MyUtil` 类，无需创建对象，直接用 `MyUtil.createCode(n)` 调用。
- 工具类设计原则：
  - 方法全为静态（`static`），方便类名调用。
  - 构造方法私有化（`private MyUtil()`），防止外部创建对象（工具类不需要实例）。

### **四、`static` 代码块（静态代码块）**

#### **1. 静态代码块**

- **格式**：`static { 代码 }`
- **作用**：在类加载时自动执行，用于初始化 **类变量** 或加载资源（如配置文件、驱动程序）。
- 特点：
  - 仅执行 **一次**（类加载时执行，与创建对象的次数无关）。
  - 执行顺序优先于 **实例代码块** 和 **构造方法**。

**案例：初始化全局配置**

```java
public class AppConfig {
    static String serverUrl; // 服务器地址（类变量）

    // 静态代码块：模拟从配置文件读取数据
    static {
        serverUrl = "http://api.kaikai.com";
        System.out.println("[静态代码块] 初始化服务器地址：" + serverUrl);
    }

    public static void main(String[] args) {
        System.out.println("当前服务器地址：" + AppConfig.serverUrl);
        // 输出：
        // [静态代码块] 初始化服务器地址：http://api.kaikai.com
        // 当前服务器地址：http://api.kaikai.com
    }
}
```

#### **2. 实例代码块**

- **格式**：`{ 代码 }`（无 `static` 修饰）
- **作用**：在创建对象时执行，用于初始化 **实例变量**（每个对象独立初始化）。
- 特点：
  - 每次创建对象时执行 **一次**。
  - 执行顺序优先于 **构造方法**，但晚于 **静态代码块**。

**案例：初始化学生年龄**

```java
public class Student {
    String name; // 实例变量：姓名
    int age; // 实例变量：年龄

    // 实例代码块：设置默认年龄
    {
        age = 18; // 初始化默认年龄
        System.out.println("[实例代码块] 年龄初始化：" + age);
    }

    // 构造方法：初始化姓名
    public Student(String name) {
        this.name = name;
        System.out.println("[构造方法] 姓名初始化：" + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student("楷楷"); 
        // 输出：
        // [实例代码块] 年龄初始化：18
        // [构造方法] 姓名初始化：楷楷
    }
}
```

### **五、`static` 单例设计模式**

#### **1. 什么是单例模式？**

- **目的**：确保一个类在程序中 **只有一个实例**，并提供全局访问点。
- 应用场景：
  - 全局配置类（如 `AppConfig`）。
  - 资源管理器（如数据库连接池、线程池）。

#### **2. 饿汉式单例（静态变量实现）**

- **核心思想**：类加载时立即创建唯一实例，确保线程安全。
- 步骤：
  1. **私有化构造方法**：禁止外部创建实例。
  2. **定义静态实例**：在类内部创建实例（`static` 修饰）。
  3. **提供静态访问方法**：返回唯一实例。

**代码示例**：

```java
public class Singleton {
    // 1. 私有化构造方法（外部无法创建实例）
    private Singleton() {
        System.out.println("[单例] 实例创建");
    }

    // 2. 类加载时直接创建实例（静态变量，线程安全）
    private static final Singleton instance = new Singleton();

    // 3. 提供静态方法获取实例
    public static Singleton getInstance() {
        return instance;
    }

    // 测试：多次调用获取实例
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println("实例是否相同：" + (s1 == s2)); // 输出：true
    }
}
```

#### **3. 懒汉式单例（静态方法延迟加载）**

- **核心思想**：首次调用时创建实例，延迟加载（需注意线程安全）。
- 步骤：
  1. **私有化构造方法**。
  2. **定义静态实例（延迟初始化）**。
  3. **在静态方法中判断实例是否存在**，不存在则创建。

**非线程安全版本（简单示例）**：

```java
public class Singleton {
    private Singleton() {}
    private static Singleton instance; // 初始为 null

    // 首次调用时创建实例
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

**线程安全版本（加锁优化）**：

```java
public class Singleton {
    private Singleton() {}
    private static Singleton instance;

    // 同步方法（线程安全，但性能较低）
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

### **六、两种单例模式对比**

| **类型**   | **创建时机**     | **线程安全** | **优点**           | **缺点**           |
| ---------- | ---------------- | ------------ | ------------------ | ------------------ |
| **饿汉式** | 类加载时立即创建 | 是           | 简单高效，线程安全 | 可能提前占用内存   |
| **懒汉式** | 首次调用时创建   | 需手动实现   | 延迟加载，节省资源 | 需处理线程安全问题 |

### **七、类方法与实例方法的注意事项**

#### **1. 类方法的限制**：

- 不能直接访问实例变量 / 实例方法：

  类方法属于类，此时可能还没有创建对象，无法访问依赖对象的实例成员。

  ```java
  public class Student {
      static String schoolName; // 类变量
      double score; // 实例变量
  
      // 类方法（错误示例：访问实例变量）
      public static void printScore() {
          // System.out.println(score); 报错！无法访问实例变量
          // study(); 报错！无法访问实例方法
      }
  
      // 实例方法（正确示例：访问类变量）
      public void showSchool() {
          System.out.println("学校：" + schoolName); // 合法！
      }
  }
  ```

#### **2. 实例方法的自由度**：

- 可以访问类变量 / 类方法：

  实例方法属于对象，但类变量是共享的，因此可以直接访问。

  ```java
  public class Student {
      static int totalStudents; // 类变量
  
      public void updateTotal() {
          totalStudents++; // 合法！实例方法可访问类变量
          printTotal(); // 合法！实例方法可调用类方法
      }
  
      public static void printTotal() {
          System.out.println("总人数：" + totalStudents);
      }
  }
  ```

#### **3. `this` 关键字的限制**：

- 类方法中不能使用 `this`

  代表当前对象，而类方法无需对象即可调用，因此不存在

  ```java
  public static void classMethod() {
      // System.out.println(this); 报错！类方法中无 this
  }
  ```

### **八、为什么推荐类方法？**

1. **调用更便捷**：
   无需创建对象，直接用类名调用，尤其适合工具类（如 `Math.sqrt()`、`Arrays.sort()`）。
2. **资源更高效**：
   不依赖对象，减少内存占用，适合无状态的工具方法（如生成验证码、计算数据）。
3. **逻辑更清晰**：
   明确标识为 “属于类” 的操作，避免与对象的状态混淆。

### **九、总结：`static` 核心知识点速查表**

| **场景** | **关键字** | **示例**                        | **调用方式**            | **注意事项**                 |
| -------- | ---------- | ------------------------------- | ----------------------- | ---------------------------- |
| 共享数据 | `static`   | `static int totalStudents;`     | `Student.totalStudents` | 所有对象共享同一值           |
| 工具方法 | `static`   | `public static void sayHello()` | `Tool.sayHello()`       | 构造方法私有化，禁止创建对象 |
| 类初始化 | `static`   | `static { ... }`                | 类加载时自动执行        | 仅执行一次，优先于构造方法   |
| 实例数据 | 无         | `String name;`                  | `obj.name`              | 每个对象独立存储             |
| 实例方法 | 无         | `public void study()`           | `obj.study()`           | 可访问类变量和实例变量       |

### **十、经典面试题：`static` 的作用是什么？**

**回答要点**：

1. **修饰变量（类变量）**：实现数据共享，节省内存。
2. **修饰方法（类方法）**：无需对象即可调用，适合工具方法。
3. **静态代码块**：类加载时初始化资源，仅执行一次。
4. **工具类与单例模式**：结合 `static` 设计高效的工具类或单例类。

通过以上案例和对比，你可以轻松掌握 `static` 的用法，在开发中灵活运用静态成员提升代码效率和可维护性～


