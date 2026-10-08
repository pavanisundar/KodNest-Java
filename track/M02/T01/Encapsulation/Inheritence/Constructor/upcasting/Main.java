
public class Main {

    public static void main(String[] args) {
        JavaDeveloper jd = new JavaDeveloper();
        accessMethod(jd);

        PythonDeveloper pd = new PythonDeveloper();
        accessMethod(pd);
    }

    public static void accessMethod(Developer d) {
        d.work();
        d.project();
    }
}
