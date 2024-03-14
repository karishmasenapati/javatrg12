public class CrossPattern {
    public static void main(String[] args) {
        int size = 5; // Define the size of the cross pattern


        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == j || i + j == size + 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}