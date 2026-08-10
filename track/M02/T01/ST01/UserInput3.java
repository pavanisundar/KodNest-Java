
import java.util.Scanner;

public class UserInput3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter char :");
        char ch = scan.next().charAt(2);
        System.out.println("char is " + ch);
    }
}
