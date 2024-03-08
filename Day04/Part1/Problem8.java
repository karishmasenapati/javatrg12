import java.util.Scanner;

class Matrix {
    private int rows;
    private int columns;
    private int[][] elements;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }
    public int getColumns() {
        return columns;
    }

    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            elements[i][j] = value;
        } else {
            System.out.println("Invalid position. Element not set.");
        }
    }
    public Matrix add(Matrix otherMatrix) {
        if (rows != otherMatrix.getRows() || columns != otherMatrix.getColumns()) {
            System.out.println("Matrices cannot be added. Incompatible sizes.");
            return null;
        }

        Matrix resultMatrix = new Matrix(rows, columns);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix.setElement(i, j, elements[i][j] + otherMatrix.elements[i][j]);
            }
        }

        return resultMatrix;
    }

    public Matrix multiply(Matrix otherMatrix) {
        if (columns != otherMatrix.getRows()) {
            System.out.println("Matrices cannot be multiplied. Incompatible sizes.");
            return null;
        }

        Matrix resultMatrix = new Matrix(rows, otherMatrix.getColumns());

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < otherMatrix.getColumns(); j++) {
                int sum = 0;
                for (int k = 0; k < columns; k++) {
                    sum += elements[i][k] * otherMatrix.elements[k][j];
                }
                resultMatrix.setElement(i, j, sum);
            }
        }

        return resultMatrix;
    }
    public void displayMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows for Matrix A: ");
        int rowsA = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix A: ");
        int columnsA = scanner.nextInt();
        Matrix matrixA = new Matrix(rowsA, columnsA);

        System.out.println("Enter elements for Matrix A:");
        inputMatrixElements(matrixA, scanner);
        System.out.print("Enter the number of rows for Matrix B: ");
        int rowsB = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix B: ");
        int columnsB = scanner.nextInt();

        Matrix matrixB = new Matrix(rowsB, columnsB);

        System.out.println("Enter elements for Matrix B:");
        inputMatrixElements(matrixB, scanner);

        Matrix sumMatrix = matrixA.add(matrixB);
        if (sumMatrix != null) {
            System.out.println("\nMatrix Addition Result:");
            sumMatrix.displayMatrix();
        }

        Matrix productMatrix = matrixA.multiply(matrixB);
        if (productMatrix != null) {
            System.out.println("\nMatrix Multiplication Result:");
            productMatrix.displayMatrix();
        }

        scanner.close();
    }

    private static void inputMatrixElements(Matrix matrix, Scanner scanner) {
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                int element = scanner.nextInt();
                matrix.setElement(i, j, element);
            }
        }
    }
}
