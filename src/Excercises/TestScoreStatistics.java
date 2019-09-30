package Excercises;

import java.util.*;

public class TestScoreStatistics {

    public static void main(String args[]) {
        int userEntry;
        int total = 0;
        int count = 0;
        int highestScore;
        int lowestScore;
        final int QUIT = 999;
        final int MIN = 0;
        final int MAX = 100;
        Scanner input = new Scanner(System.in);
        System.out.println("When you have entered all of your test scores please enter 999 to get your totals.");
        System.out.print("Enter a score >> ");
        userEntry = input.nextInt();
        highestScore = userEntry;
        lowestScore = userEntry;
        while (userEntry != QUIT) {
            if (userEntry >= MIN && userEntry <= MAX) {
                ++count;
                total += userEntry;
                if (userEntry > highestScore)
                    highestScore = userEntry;
                if (userEntry < lowestScore)
                    lowestScore = userEntry;
            } else
                System.out.print("Score must be between " + MAX + " and " + MIN + "   ");
            System.out.print("Enter another score >> ");
            userEntry = input.nextInt();
        }
        System.out.println(count + " scores were entered");
        System.out.println("Highest was " + highestScore);
        System.out.println("Lowest was " + lowestScore);
        System.out.println("Average was " + (total * 1.0 / count));
    }
}