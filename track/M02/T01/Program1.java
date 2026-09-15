
class Program1 {

    static int a;
    static int b;
    int p;
    int q;

    static {
        System.out.println("Inside static Block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("Inside non static Block");
        p = 100;
        q = 200;
    }

    void disp1() {
        System.out.println("inside static method");
        System.out.println(a);
        System.out.println(b);
    }

    void disp2() {
        System.out.println("inside non static method");
        System.out.println(p);
        System.out.println(q);
    }

    public static void main(String[] args) {
        System.out.println("inside main method");
        Program1 pg1 = new Program1();
        pg1.disp1();
        pg1.disp2();
    }
}
