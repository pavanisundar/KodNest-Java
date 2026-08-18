
public class Student3 {

    String name;
    int age;
    double height;

    Student3() {
        name = "Anu";
        age = 19;
        height = 5.5;
    }

    Student3(String name) {
        this.name = name;
    }

    Student3(String name, int age, double height) {
        name = name;
        age = age;
        height = height;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(height);
    }
}
