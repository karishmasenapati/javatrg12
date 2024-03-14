/*Right Down Triangle

  * * * * *
    * * * *
      * * *
        * *
          *

*/

public class Problem04 {
    public static void main(String []args){

    int rows = 5; 

    for (int i = 0; i < rows; i++) {

        for (int j = 0; j < i; j++) {
            // Printing Spaces
            System.out.print("  ");
        }
        for (int j = i; j < rows; j++) {
            // Printing stars
            System.out.print("* ");
        }

        System.out.println();
    }
}
}