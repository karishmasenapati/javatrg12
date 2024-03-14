/*Reverse pyramid star pattern

  *********
   *******
    *****
     ***
      *

*/

public class Probem09 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Printing spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j < (rows - i) * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}