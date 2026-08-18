import java.util.ArrayList;
import java.util.Scanner;

// ─────────────────────────────────────────────
//  Student class
// ─────────────────────────────────────────────
class Student {

    // ── Variables ────────────────────────────
    private String name;
    private int    age;
    private String studentId;
    private String course;

    private int    totalTopics;
    private int    completedTopics;
    private int    totalQuestions;
    private int    solvedQuestions;

    private ArrayList<String> topics    = new ArrayList<>();
    private ArrayList<String> questions = new ArrayList<>();

    // ── setDetails() ─────────────────────────
    /**
     * Stores basic student information.
     *
     * @param name      full name of the student
     * @param age       age of the student
     * @param studentId unique roll / ID number
     * @param course    course / batch name
     */
    public void setDetails(String name, int age, String studentId, String course) {
        this.name      = name;
        this.age       = age;
        this.studentId = studentId;
        this.course    = course;
    }

    // ── setProgress() ────────────────────────
    /**
     * Stores the student's learning progress counters.
     *
     * @param totalTopics      total number of topics in the curriculum
     * @param completedTopics  topics already completed by the student
     * @param totalQuestions   total practice questions available
     * @param solvedQuestions  questions already solved by the student
     */
    public void setProgress(int totalTopics, int completedTopics,
                            int totalQuestions, int solvedQuestions) {
        this.totalTopics      = totalTopics;
        this.completedTopics  = completedTopics;
        this.totalQuestions   = totalQuestions;
        this.solvedQuestions  = solvedQuestions;
    }

    // ── displayDetails() ─────────────────────
    /** Prints the student's personal / enrollment details. */
    public void displayDetails() {
        System.out.println("\n+----------------------------------+");
        System.out.println("|        STUDENT  DETAILS          |");
        System.out.println("+----------------------------------+");
        System.out.println("  Name       : " + name);
        System.out.println("  Age        : " + age);
        System.out.println("  Student ID : " + studentId);
        System.out.println("  Course     : " + course);
    }

    // ── displayProgress() ────────────────────
    /** Prints the student's topic and question progress with a percentage. */
    public void displayProgress() {
        double topicPct    = (totalTopics    > 0) ? (completedTopics  * 100.0 / totalTopics)    : 0;
        double questionPct = (totalQuestions > 0) ? (solvedQuestions  * 100.0 / totalQuestions) : 0;

        System.out.println("\n+----------------------------------+");
        System.out.println("|       STUDENT  PROGRESS          |");
        System.out.println("+----------------------------------+");
        System.out.printf("  Topics    : %d / %d  (%.1f%%)%n",
                completedTopics, totalTopics, topicPct);
        System.out.printf("  Questions : %d / %d  (%.1f%%)%n",
                solvedQuestions, totalQuestions, questionPct);

        // Visual progress bar for topics (10 blocks = 100%)
        System.out.print("  Progress  : [");
        int filled = (int) (topicPct / 10);
        for (int i = 0; i < 10; i++) {
            System.out.print(i < filled ? "#" : "-");
        }
        System.out.printf("] %.1f%%%n", topicPct);

        if (topics.size() > 0) {
            System.out.println("\n  Topics Covered:");
            for (int i = 0; i < topics.size(); i++) {
                System.out.println("    " + (i + 1) + ". " + topics.get(i));
            }
        }

        if (questions.size() > 0) {
            System.out.println("\n  Questions Solved:");
            for (int i = 0; i < questions.size(); i++) {
                System.out.println("    " + (i + 1) + ". " + questions.get(i));
            }
        }
    }

    // ── addTopics() ──────────────────────────
    /**
     * Adds a topic to the student's completed topic list and
     * increments the completed-topics counter.
     *
     * @param topic name / title of the topic
     */
    public void addTopics(String topic) {
        topics.add(topic);
        completedTopics++;
        System.out.println("  [+] Topic added: " + topic
                + "  (Completed: " + completedTopics + "/" + totalTopics + ")");
    }

    // ── addQuestions() ───────────────────────
    /**
     * Adds a solved question to the student's list and
     * increments the solved-questions counter.
     *
     * @param question title / description of the question solved
     */
    public void addQuestions(String question) {
        questions.add(question);
        solvedQuestions++;
        System.out.println("  [+] Question added: " + question
                + "  (Solved: " + solvedQuestions + "/" + totalQuestions + ")");
    }
}


// ─────────────────────────────────────────────
//  Main Application class
// ─────────────────────────────────────────────
public class StudentApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);   // Scanner
        Student student = new Student();             // Student object

        // ── Input : collect student details ──
        System.out.println("+----------------------------------+");
        System.out.println("|    KodNest Student Tracker       |");
        System.out.println("+----------------------------------+");

        System.out.print("\nEnter Student Name      : ");
        String name = scanner.nextLine();

        System.out.print("Enter Age               : ");
        int age = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Student ID        : ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Course / Batch    : ");
        String course = scanner.nextLine();

        student.setDetails(name, age, studentId, course);

        System.out.print("\nEnter Total Topics      : ");
        int totalTopics = scanner.nextInt();

        System.out.print("Enter Completed Topics  : ");
        int completedTopics = scanner.nextInt();

        System.out.print("Enter Total Questions   : ");
        int totalQuestions = scanner.nextInt();

        System.out.print("Enter Solved Questions  : ");
        int solvedQuestions = scanner.nextInt();
        scanner.nextLine(); // consume newline

        student.setProgress(totalTopics, completedTopics,
                            totalQuestions, solvedQuestions);

        // ── While loop + Menu ─────────────────
        boolean running = true;
        while (running) {
            System.out.println("\n+----------------------------------+");
            System.out.println("|           MAIN  MENU             |");
            System.out.println("+----------------------------------+");
            System.out.println("|  1. Display Student Details      |");
            System.out.println("|  2. Display Progress             |");
            System.out.println("|  3. Add Completed Topic          |");
            System.out.println("|  4. Add Solved Question          |");
            System.out.println("|  5. Exit                         |");
            System.out.println("+----------------------------------+");
            System.out.print("  Choose an option (1-5): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    student.displayDetails();
                    break;

                case 2:
                    student.displayProgress();
                    break;

                case 3:
                    System.out.print("\n  Enter topic name: ");
                    String topic = scanner.nextLine();
                    student.addTopics(topic);
                    break;

                case 4:
                    System.out.print("\n  Enter question title/description: ");
                    String question = scanner.nextLine();
                    student.addQuestions(question);
                    break;

                case 5:
                    System.out.println("\n  Goodbye! Keep learning!");
                    running = false;
                    break;

                default:
                    System.out.println("\n  [!] Invalid option. Please enter 1-5.");
            }
        }

        scanner.close();
    }
}
