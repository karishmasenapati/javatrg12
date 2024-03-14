/*The hollow triangle star pattern is a triangle pattern with stars only at its boundary making it hollow.
  *
  * *
  *   *
  *     *
  *       *
  * * * * * *
*/

public class Problem07 {
    public static void main(String[] args) {
        int height = 6; 

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                // Print stars for the first row, first and last column, and last row
                if (i == 1 || j == 1 || j == i || i == height) {

                    System.out.print("* ");

                } else {
                    
                    System.out.print("  "); // Print spaces for the hollow area
                }
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}