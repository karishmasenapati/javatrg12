import java.util.Scanner;

class Employee {
    private double salary;
    private int hoursOfWork;

    public void getInfo(double salary, int hoursOfWork) {
        this.salary = salary;
        this.hoursOfWork = hoursOfWork;
    }

 
    public void addSal() {
        if (salary < 500) {
            salary += 10;
        }
    }

    public void addWork() {
        if (hoursOfWork > 6) {
            salary += 5;
        }
    }

    public void printFinalSalary() {
        System.out.println("Final Salary: $" + salary);
    }
}

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        Employee employee = new Employee();

        System.out.print("Enter the salary of the employee: $");
        double salary = scanner.nextDouble();

        System.out.print("Enter the number of hours of work per day: ");
        int hoursOfWork = scanner.nextInt();

      
        employee.getInfo(salary, hoursOfWork);

  
        employee.addSal();
        employee.addWork();

     
        employee.printFinalSalary();

        scanner.close();
    }
}
