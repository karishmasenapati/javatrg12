/*2. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail
*/

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();
        displayGrade(marks);
        scanner.close();
    }
    private static void displayGrade(int marks) {
        System.out.print("Grade: ");

        if (marks >= 91 && marks <= 100) {
            System.out.println("AA");
        } else if (marks >= 81 && marks <= 90) {
            System.out.println("AB");
        } else if (marks >= 71 && marks <= 80) {
            System.out.println("BB");
        } else if (marks >= 61 && marks <= 70) {
            System.out.println("BC");
        } else if (marks >= 51 && marks <= 60) {
            System.out.println("CD");
        } else if (marks >= 41 && marks <= 50) {
            System.out.println("DD");
        } else if (marks <= 40) {
            System.out.println("Fail");
        } else {
            System.out.println("Invalid marks. Marks should be between 0 and 100.");
        }
    }
}
