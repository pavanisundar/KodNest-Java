
public class P05Main {

    public static void main(String[] args) {
        int completedTopics = 17;
        int totalTopics = 20;
        int dailyLearningHours = 3;
        int learningDays = 5;

        int remainingTopics = totalTopics - completedTopics;
        int weeklyLearningHours = dailyLearningHours * learningDays;
        double progressPercentage = (double) completedTopics / totalTopics * 100;

        System.out.println("Remaining Topics: " + remainingTopics);
        System.out.println("Weekly Learning Hours: " + weeklyLearningHours);
        System.out.println("Progress Percentage: " + progressPercentage);
    }
}
