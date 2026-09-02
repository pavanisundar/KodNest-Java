
import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int k = 0; k < n; k++) {
            a[k] = sc.nextInt();
        }

        int i = 0;
        int j = a.length - 1;

        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }

        for (int x = 0; x < a.length; x++) {
            System.out.print(a[x] + " ");
        }
    }
}
