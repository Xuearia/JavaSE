package P1静态与继承.d1静态;

public class User {
    //public 表示类完全公开访问  number，用于记录创建的用户对象数量
    public static int number;

    //构造方法 User() 每次创建新对象时，将 number 增加 1
    public User(){
        //User.number++;
        //在同一个类中,访问自己类的类变量,才可以省略类名不写
        number++;
    }
}
