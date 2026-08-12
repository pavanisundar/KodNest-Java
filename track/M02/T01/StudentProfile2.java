
import java.util.Scanner;

class Student {

    int id;
    String name;
    String course;
    double javaScore;
}

public class StudentProfile2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student = new Student();

        student.id = scanner.nextInt();
        student.name = scanner.next();
        student.course = scanner.next();
        student.javaScore = scanner.nextDouble();

        System.out.println("Student Profile");
        System.out.println("ID: " + student.id);
        System.out.println("Name: " + student.name);
        System.out.println("Course: " + student.course);
        System.out.println("Java Score: " + student.javaScore);

        scanner.close();
    }
}
