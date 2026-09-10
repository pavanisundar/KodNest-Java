
public class StringBuilder2 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
        sb.append("Programming");
        System.out.println(sb.capacity());
    }
}
