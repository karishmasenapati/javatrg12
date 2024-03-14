import java.util.Scanner;

public class DiamondStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (odd number): ");
        int rows = scanner.nextInt();

        int midRow = (rows + 1) / 2;

        for (int i = 1; i <= rows; i++) {
            int spaces = Math.abs(midRow - i);
            int stars = rows - 2 * spaces;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        scanner.close();
    }
}