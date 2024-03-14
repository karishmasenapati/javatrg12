/*Hollow pyramid pattern

               *
              * *
             *   *
            *     *
           *********

*/

public class Problem10 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            // Printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 1; j <= i * 2 - 1; j++) {
                if (i == rows || j == 1 || j == i * 2 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}