
public class StringBuilder1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // Append
        sb.append(", World!");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(5, " Java");
        System.out.println("After insert: " + sb);

        // Delete
        sb.delete(5, 10);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // Length and charAt
        System.out.println("Length: " + sb.length());
        System.out.println("Char at index 0: " + sb.charAt(0));
    }
}
