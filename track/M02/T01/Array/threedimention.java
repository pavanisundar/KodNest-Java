
import java.util.Scanner;

class Threedimention {

    public static void main(String[] args) {
        int a[][][] = new int[3][3][5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Array Elements: ");

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    a[i][j][k] = scan.nextInt();
                }
            }
        }

        System.out.println("Array Elements are:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                for (int k = 0; k < a[i][j].length; k++) {
                    System.out.print(" " + a[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
