import java.util.ArrayList;
import java.util.List;

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "John", 500000.0));
        employees.add(new Employee(2, "Alice", 350000.0));
        employees.add(new Employee(3, "Bob", 450000.0));

     
        System.out.println("Employees with salary more than 4 lakhs:");
        employees.stream()
                .filter(employee -> employee.getSalary() > 400000)
                .forEach(System.out::println);

 
        System.out.println("\nUpdating employee salary by 25%:");
        employees.forEach(employee -> employee.setSalary(employee.getSalary() * 1.25));
        employees.forEach(System.out::println);

    
        List<String> uppercaseNames = employees.stream()
                .map(employee -> employee.getName().toUpperCase())
                .toList();

     
        System.out.println("\nNames in uppercase:");
        uppercaseNames.forEach(System.out::println);
    }
}
