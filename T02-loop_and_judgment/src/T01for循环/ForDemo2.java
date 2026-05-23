package T01for循环;

public class ForDemo2 {
    public static void main(String[] args) {
        //打印1-100
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+"\t");
            if (i%10 == 0){
                System.out.println();
            }
        }
    }
}
