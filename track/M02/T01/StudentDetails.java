
import java.util.Scanner;

public class StudentDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = scanner.nextLine();
        int days = scanner.nextInt();

        int totalSolved = 0;

        for (int i = 1; i <= days; i++) {
            int solved = scanner.nextInt();
            totalSolved += solved;
        }

        double dailyAverage = (double) totalSolved / days;

        String status;

        if (dailyAverage >= 5.0) {
            status = "Consistent";
        } else {
            status = "Needs consistency";
        }

        System.out.println("Learner: " + fullName);
        System.out.println("Total solved: " + totalSolved);
        System.out.println("Daily average: " + dailyAverage);
        System.out.println("Status: " + status);

        scanner.close();
    }
}
