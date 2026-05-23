package T02练习;

public class 乘法表 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print(i + "*" + k + "=" + (i * k)+"\t");

            }
            System.out.println();
        }
    }

}
