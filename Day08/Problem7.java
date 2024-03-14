public class PlusPattern {
    public static void main(String[] args) {
        int size = 5; // Define the size of the plus pattern

    
        for (int i = 1; i <= size; i++) {
            System.out.print("* ");
        }
        System.out.println();

 
        for (int i = 1; i <= size; i++) {
            // Print spaces before the vertical line
            for (int j = 1; j <= size / 2; j++) {
                System.out.print("  ");
            }
         
            System.out.println("*");
        }


        for (int i = 1; i <= size; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}