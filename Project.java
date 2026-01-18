
import java.util.Scanner;

public class PRoject2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quiz Application");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Welcome " + name + ". Age: " + age);
        System.out.println("Total Questions: 10");
        System.out.println("Each question has 4 options and 5th option is Lifeline");
        System.out.println("Lifelines: Audience Poll and 50-50 (Only from Q1 to Q9)");
        int reward = 0;
        boolean audienceUsed = false;
        boolean fiftyUsed = false;
        int ans;

        System.out.println("Question 1");
        System.out.println("Which keyword is used to create object in Java?");
        System.out.println("1) create");
        System.out.println("2) new");
        System.out.println("3) make");
        System.out.println("4) object");
        System.out.println("5) Lifeline");
        System.out.print("Enter option: ");
        ans = sc.nextInt();
        if (ans == 5) {
            int result = Lifeline.useLifeline(sc, name, 1, audienceUsed, fiftyUsed, 2);
            if (result == -11) audienceUsed = true;
            if (result == -22) fiftyUsed = true;
            if (result == -11 || result == -22 || result == -99) {
                System.out.print("Enter option (1 to 4): ");
                ans = sc.nextInt();
            }
        }
        if (ans == 2) {
            reward = 10000;
            QuizHelper.correctMsg(name, reward);
        } else {
            QuizHelper.wrongEnd(name, reward);
            return;
        }

        System.out.println("Question 2");
        System.out.println("Which is not a primitive datatype in Java?");
        System.out.println("1) int");
        System.out.println("2) double");
        System.out.println("3) String");
        System.out.println("4) char");
        System.out.println("5) Lifeline");
        System.out.print("Enter option: ");
        ans = sc.nextInt();
        if (ans == 5) {
            int result = Lifeline.useLifeline(sc, name, 2, audienceUsed, fiftyUsed, 3);
            if (result == -11) audienceUsed = true;
            if (result == -22) fiftyUsed = true;
            if (result == -11 || result == -22 || result == -99) {
                System.out.print("Enter option (1 to 4): ");
                ans = sc.nextInt();
            }
        }
        if (ans == 3) {
            reward = 20000;
            QuizHelper.correctMsg(name, reward);
        } else {
            QuizHelper.wrongEnd(name, reward);
            return;
        }

        System.out.println("Question 3");
        System.out.println("Which method is used to start a thread in Java?");
        System.out.println("1) begin()");
        System.out.println("2) run()");
        System.out.println("3) start()");
        System.out.println("4) init()");
        System.out.println("5) Lifeline");
        System.out.print("Enter option: ");
        ans = sc.nextInt();
        if (ans == 5) {
            int result = Lifeline.useLifeline(sc, name, 3, audienceUsed, fiftyUsed, 3);
            if (result == -11) audienceUsed = true;
            if (result == -22) fiftyUsed = true;
            if (result == -11 || result == -22 || result == -99) {
                System.out.print("Enter option (1 to 4): ");
                ans = sc.nextInt();
            }
        }
        if (ans == 3) {
            reward = 30000;
            QuizHelper.correctMsg(name, reward);
        } else {
            QuizHelper.wrongEnd(name, reward);
            return;
        }

        System.out.println("Question 4");
        System.out.println("Which is used to take input in Java?");
        System.out.println("1) Scanner");
        System.out.println("2) Printer");
        System.out.println("3) Writer");
        System.out.println("4) Paint");
        System.out.println("5) Lifeline");
        System.out.print("Enter option: ");
        ans = sc.nextInt();
        if (ans == 5) {
            int result = Lifeline.useLifeline(sc, name, 4, audienceUsed, fiftyUsed, 1);
            if (result == -11) audienceUsed = true;
            if (result == -22) fiftyUsed = true;
            if (result == -11 || result == -22 || result == -99) {
                System.out.print("Enter option (1 to 4): ");
                ans = sc.nextInt();
            }
        }
        if (ans == 1) {
            reward = 40000;
            QuizHelper.correctMsg(name, reward);
        } else {
            QuizHelper.wrongEnd(name, reward);
            return;
        }

        System.out.println("Question 5");
        System.out.println("Which loop executes at least one time?");
        System.out.println("1) for");
        System.out.println("2) while");
        System.out.println("3) do-while");
        System.out.println("4) none");
        System.out.println("5) Lifeline");
        System.out.print("Enter option: ");
        ans = sc.nextInt();
        if (ans == 5) {
            int result = Lifeline.useLifeline(sc, name, 5, audienceUsed, fiftyUsed, 3);
            if (result == -11) audienceUsed = true;
            if (result == -22) fiftyUsed = true;
            if (result == -11 || result == -22 || result == -99) {
                System.out.print("Enter option (1 to 4): ");
                ans = sc.nextInt();
            }
        }
        if (ans == 3) {
            reward = 50000;
            QuizHelper.correctMsg(name, reward);
        } else {
            QuizHelper.wrongEnd(name, reward);
            return;
        }

        System.out.println("Question 6");
        System.out.println("Size of int in Java is?");
        System.out.println("1) 2 bytes");
        System.out.println("2) 4 bytes");
        System.out.println("3) 8 bytes");
        System.out.println("4) 16 bytes");
        System.out.println("5) Lifeline");
        System.out.print("Enter option: ");
        ans = sc.nextInt();
        if (ans == 5) {
            int result = Lifeline.useLifeline(sc, name, 6, audienceUsed, fiftyUsed, 2);
            if (result == -11) audienceUsed = true;
            if (result == -22) fiftyUsed = true;
            if (result == -11 || result == -22 || result == -99) {
                System.out.print("Enter option (1 to 4): ");
                ans = sc.nextInt();
            }
        }
        if (ans == 2) {
            reward = 60000;
            QuizHelper.correctMsg(name, reward);
        } else {
            QuizHelper.wrongEnd(name, reward);
            return;
        }

        System.out.println("Question 7");
        System.out.println("Which operator is used for AND condition?");
        System.out.println("1) &&");
        System.out.println("2) ||");
        System.out.println("3) !");
        System.out.println("4) %");
        System.out.println("5) Lifeline");
        System.out.print("Enter option: ");
        ans = sc.nextInt();
        if (ans == 5) {
            int result = Lifeline.useLifeline(sc, name, 7, audienceUsed, fiftyUsed, 1);
            if (result == -11) audienceUsed = true;
            if (result == -22) fiftyUsed = true;
            if (result == -11 || result == -22 || result == -99) {
                System.out.print("Enter option (1 to 4): ");
                ans = sc.nextInt();
            }
        }
        if (ans == 1) {
            reward = 70000;
            QuizHelper.correctMsg(name, reward);
        } else {
            QuizHelper.wrongEnd(name, reward);
            return;
        }

        System.out.println("Question 8");
        System.out.println("Which keyword is used to handle exception?");
        System.out.println("1) error");
        System.out.println("2) catch");
        System.out.println("3) throws");
        System.out.println("4) try-catch");
        System.out.println("5) Lifeline");
        System.out.print("Enter option: ");
        ans = sc.nextInt();
        if (ans == 5) {
            int result = Lifeline.useLifeline(sc, name, 8, audienceUsed, fiftyUsed, 4);
            if (result == -11) audienceUsed = true;
            if (result == -22) fiftyUsed = true;
            if (result == -11 || result == -22 || result == -99) {
                System.out.print("Enter option (1 to 4): ");
                ans = sc.nextInt();
            }
        }
        if (ans == 4) {
            reward = 80000;
            QuizHelper.correctMsg(name, reward);
        } else {
            QuizHelper.wrongEnd(name, reward);
            return;
        }

        System.out.println("Question 9");
        System.out.println("Which company created Java?");
        System.out.println("1) Microsoft");
        System.out.println("2) Sun Microsystems");
        System.out.println("3) Google");
        System.out.println("4) Apple");
        System.out.println("5) Lifeline");
        System.out.print("Enter option: ");
        ans = sc.nextInt();
        if (ans == 5) {
            int result = Lifeline.useLifeline(sc, name, 9, audienceUsed, fiftyUsed, 2);
            if (result == -11) audienceUsed = true;
            if (result == -22) fiftyUsed = true;
            if (result == -11 || result == -22 || result == -99) {
                System.out.print("Enter option (1 to 4): ");
                ans = sc.nextInt();
            }
        }
        if (ans == 2) {
            reward = 90000;
            QuizHelper.correctMsg(name, reward);
        } else {
            QuizHelper.wrongEnd(name, reward);
            return;
        }

        System.out.println("Question 10");
        System.out.println("Which is used to stop the program in Java?");
        System.out.println("1) System.exit(0)");
        System.out.println("2) stop()");
        System.out.println("3) end()");
        System.out.println("4) exit()");
        System.out.print("Enter option: ");
        ans = sc.nextInt();
        if (ans == 1) {
            reward = 100000;
            QuizHelper.correctMsg(name, reward);
            System.out.println(Colors.BLUE + "Final Reward Amount: " + reward + Colors.RESET);
        } else {
            QuizHelper.wrongEnd(name, reward);
            return;
        }

        sc.close();
    }
}
