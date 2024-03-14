import java.util.function.BiFunction;

public class MathOperation {

    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 5.0;

        System.out.println("Addition: " + performOperation(num1, num2, "add"));
        System.out.println("Subtraction: " + performOperation(num1, num2, "subtract"));
    }

    public static double performOperation(double num1, double num2, String operation) {
        BiFunction<Double, Double, Double> mathOperation;

        switch (operation.toLowerCase()) {
            case "add":
                mathOperation = (a, b) -> a + b;
                break;
            case "subtract":
                mathOperation = (a, b) -> a - b;
                break;
            default:
                throw new IllegalArgumentException("Unsupported operation: " + operation);
        }

        return mathOperation.apply(num1, num2);
    }
}
