
public class QuizHelper {
    public static void wrongEnd(String name, int reward) {
        System.out.println(Colors.RED + name + " it is wrong answer. Game Over." + Colors.RESET);
        System.out.println("Final Reward: " + reward);
    }

    public static void correctMsg(String name, int reward) {
        System.out.println(Colors.GREEN + name + " it is correct answer. You rewarded with " + reward + Colors.RESET);
    }
}
