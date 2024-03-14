/* Left Down Triangle

 * * * * *
 * * * *
 * * *
 * *
 * 
 
*/

public class Problem03 {
    public static void main(String []args){

        int rows = 5;

        for(int i=0;i<rows;i++){

            for(int j=5;j>i;j--){
                // Print stars
                System.out.print("* ");

            }
            // Line break
            System.out.println("");
        }
    }
}