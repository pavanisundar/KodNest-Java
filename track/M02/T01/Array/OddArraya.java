
import java.util.Scanner;

public class OddArraya {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int j = n - 1;

        while (i < j) {
            // Find the first odd element from the left
            while (i < j && arr[i] % 2 == 0) {
                i++;
            }
            // Find the first even element from the right
            while (i < j && arr[j] % 2 != 0) {
                j--;
            }
            // Swap them if pointers haven't crossed
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // Print the final array separated by spaces
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + (k == n - 1 ? "" : " "));
        }
    }
}
