
import java.util.Scanner;

public class UserInput1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter byte value : ");
        byte a = scan.nextByte();
        System.out.println("Byte value is " + a);

        System.out.println("Enter short value : ");
        short b = scan.nextShort();
        System.out.println("Short value is " + b);

        System.out.println("Enter int value : ");
        int c = scan.nextInt();
        System.out.println("Int value is " + c);

        System.out.println("Enter long value : ");
        long d = scan.nextLong();
        System.out.println("Long value is " + d);

        System.out.println("Enter float value : ");
        float e = scan.nextFloat();
        System.out.println("Float value is " + e);

        System.out.println("Enter double value : ");
        double f = scan.nextDouble();
        System.out.println("Double value is " + f);

        System.out.println("Enter boolean value : ");
        boolean h = scan.nextBoolean();
        System.out.println("Boolean value is " + h);

    }
}
