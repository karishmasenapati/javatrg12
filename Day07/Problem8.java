/*The pyramid pattern
  
        *
       ***
      *****
     *******
    *********

*/

public class Problem08 {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 0; i < rows; i++) {
            // Printing spaces
            for (int j = rows - i; j > 1; j--) {
                System.out.print(" ");
            }
            // Printing stars
            for (int j = 0; j <= i * 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}