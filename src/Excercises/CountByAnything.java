package Excercises;

import java.util.Scanner;

public class CountByAnything {

    public static void main(String[] args) {

        int count = 0;
        int userEntry;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to count by >>> ");
        userEntry = input.nextInt();
        while (count < 300) {
            System.out.print(" " + count);
            if (count % 30 == 0)
                System.out.println();
            count = count + userEntry;
        }
    }
}
