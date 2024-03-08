class Student {
    String name;
    int roll_no;

    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
    
        Student johnStudent = new Student("John", 2);

        System.out.println("Details of Student 'John':");
        System.out.println("Name: " + johnStudent.name);
        System.out.println("Roll Number: " + johnStudent.roll_no);
        System.out.println();

    
        Student samStudent = new Student("Sam", 0); 
        System.out.println("Details of Student 'Sam':");
        System.out.println("Name: " + samStudent.name);
        System.out.println("Roll Number: " + samStudent.roll_no);
    }
}
