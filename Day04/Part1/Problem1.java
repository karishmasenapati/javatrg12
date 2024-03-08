import java.util.Scanner;

class Area {
    private double length;
    private double breadth;

 
    public void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double getArea() {
        return length * breadth;
    }
}

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        Area rectangle = new Area();
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        rectangle.setDim(length, breadth);
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);

        scanner.close();
    }
}
