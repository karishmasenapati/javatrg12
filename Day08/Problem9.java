public class LeftTriangleNumberPattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows in the pattern

        for (int i = 1; i <= rows; i++) {
            // Inner loop for printing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}