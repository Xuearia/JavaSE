package T01方法;

public class 有参设计一个方法用于打印两个数中的较大数 {
    public static void GetMax(int a,int b){
        int max;
        if(a>b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }
    }

    public static void main(String[] args) {
       // GetMax(3,9);
        int a=20;
        int b=10;
        GetMax(a,b);
    }
}
