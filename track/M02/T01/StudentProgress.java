
import java.util.Scanner;

public class StudentProgress {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = scanner.nextInt();
        int total = 0;
        String status;
        for (int i = 0; i < days; i++) {
            total += scanner.nextInt();
        }

        if (total >= 20) {
            System.out.println("Total solved: " + total);
            System.out.println("Status: Strong progress");
        } else if (total >= 10) {
            System.out.println("Total solved: " + total);
            System.out.println("Status: Keep improving");
        } else {
            System.out.println("Total solved: " + total);
            System.out.println("Status : Needs more practice");
        }
        scanner.close();
    }
}
