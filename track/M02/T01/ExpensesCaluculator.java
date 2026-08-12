
import java.util.Scanner;

public class ExpensesCaluculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double monthlyIncome = scanner.nextDouble();
        double rentExpense = scanner.nextDouble();
        double foodExpense = scanner.nextDouble();
        double travelExpense = scanner.nextDouble();

        double totalExpense = rentExpense + foodExpense + travelExpense;
        double remainingAmount = monthlyIncome - totalExpense;

        System.out.println("Total expense: " + totalExpense);
        System.out.println("Remaining: " + remainingAmount);

        if (remainingAmount >= 0) {
            System.out.println("Status: Within budget");
        } else {
            System.out.println("Status: Over budget");
        }

        scanner.close();
    }
}
