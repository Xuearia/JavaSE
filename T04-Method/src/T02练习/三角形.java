package T02练习;

public class 三角形 {
    public static void main(String[] args) {
        /*
         *
         ***
         *****
         *******
         *********

         */

        for (int i = 1; i <= 4; i++) {

            for (int k = 1; k < 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {

                System.out.print(j%2==0?" ":"*");
            }
            System.out.println();
        }
    }
}
