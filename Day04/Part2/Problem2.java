import java.util.Scanner;

class Student {
    private int rollNumber;

    private int[] marks = new int[3];
    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void inputMarks(Scanner scanner) {
        System.out.println("Enter marks for Student " + rollNumber + ":");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
        }
    }

    public double calculateAverageMarks() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return (double) sum / marks.length;
    }


    public void displayInfo() {
        System.out.printf("Roll Number: %-5d Average Marks: %.2f\n", rollNumber, calculateAverageMarks());
    }
}

public class StudentInfoPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[8];

        for (int i = 0; i < 8; i++) {
            students[i] = new Student(i + 1);
            students[i].inputMarks(scanner);
        }

        System.out.println("\nStudent Information:");
        for (Student student : students) {
            student.displayInfo();
        }

        scanner.close();
    }
}
