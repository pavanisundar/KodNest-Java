
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int projects = sc.nextInt();
        double assessments = sc.nextDouble();

        System.out.println("Learner: " + name);
        System.out.println("Problems solved: " + projects);
        System.out.println("Assessment: " + assessments);
    }
}
