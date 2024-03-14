/*1.Left triangle star pattern in Java. It has a shape of a triangle with its perpendicular line at the left side.	 
 * 
 * *
 * * *
 * * * *
 * * * * *
*/
public class Problem01{

    static int rows = 5;

    public static void main(String []args){

        for(int i=0;i<rows;i++){

            for(int j=0;j<i+1;j++){
                // Printing Stars
                System.out.print("* ");
            }
            // Line Brake
            System.out.println("");
        }
    }
}