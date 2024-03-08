import java.util.Scanner;

class Employee {
    private String name;
    private double salary;
    private String dateOfJoining;

  
    public Employee(String name, double salary, String dateOfJoining) {
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

  
    public void displayInfo() {
        System.out.printf("Name: %-15s Salary: $%-10.2f Date of Joining: %s\n", name, salary, dateOfJoining);
    }
}

public class EmployeeInfoPrinter {
    public static void main(String[] args) {
    
        Employee[] employees = new Employee[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Salary: $");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Date of Joining: ");
            String dateOfJoining = scanner.nextLine();


            employees[i] = new Employee(name, salary, dateOfJoining);
        }
        System.out.println("\nEmployee Information:");
        for (Employee employee : employees) {
            employee.displayInfo();
        }

        scanner.close();
    }
}
