

import java.util.Scanner;

public class Lifeline {
    public static int useLifeline(Scanner sc, String name, int qNo, boolean audienceUsed, boolean fiftyUsed, int correctOption) {
        if (qNo == 10) {
            System.out.println(Colors.RED + "Lifeline not allowed for Question 10" + Colors.RESET);
            return -99;
        }
        if (audienceUsed && fiftyUsed) {
            System.out.println(Colors.RED + name + " you already used all lifelines" + Colors.RESET);
            return -99;
        }
        System.out.println("Choose Lifeline");
        System.out.println("1) Audience Poll");
        System.out.println("2) 50-50");
        System.out.print("Enter option: ");
        int lifeline = sc.nextInt();
        if (lifeline == 1) {
            if (audienceUsed) {
                System.out.println(Colors.RED + "Audience lifeline already used" + Colors.RESET);
                return -99;
            }
            System.out.println(Colors.BLUE + "Audience Poll Result:" + Colors.RESET);
            if (correctOption == 1) {
                System.out.println(Colors.YELLOW + "Option 1: 75%  Option 2: 10%  Option 3: 10%  Option 4: 5%" + Colors.RESET);
            } else if (correctOption == 2) {
                System.out.println(Colors.YELLOW + "Option 1: 10%  Option 2: 80%  Option 3: 5%  Option 4: 5%" + Colors.RESET);
            } else if (correctOption == 3) {
                System.out.println(Colors.YELLOW + "Option 1: 10%  Option 2: 10%  Option 3: 75%  Option 4: 5%" + Colors.RESET);
            } else if (correctOption == 4) {
                System.out.println(Colors.YELLOW + "Option 1: 10%  Option 2: 5%  Option 3: 10%  Option 4: 75%" + Colors.RESET);
            }
            return -11;
        } else if (lifeline == 2) {
            if (fiftyUsed) {
                System.out.println(Colors.RED + "50-50 lifeline already used" + Colors.RESET);
                return -99;
            }
            System.out.println(Colors.BLUE + "50-50 Lifeline Activated:" + Colors.RESET);
            if (correctOption == 1) {
                System.out.println(Colors.YELLOW + "Remaining options: 1 and 3" + Colors.RESET);
            } else if (correctOption == 2) {
                System.out.println(Colors.YELLOW + "Remaining options: 2 and 4" + Colors.RESET);
            } else if (correctOption == 3) {
                System.out.println(Colors.YELLOW + "Remaining options: 3 and 1" + Colors.RESET);
            } else if (correctOption == 4) {
                System.out.println(Colors.YELLOW + "Remaining options: 4 and 2" + Colors.RESET);
            }
            return -22;
        } else {
            System.out.println(Colors.RED + "Invalid lifeline option" + Colors.RESET);
            return -99;
        }
    }
}
