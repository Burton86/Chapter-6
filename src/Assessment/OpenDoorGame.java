package Assessment;

import java.util.Scanner;

public class OpenDoorGame {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int doorChoice = 4;
        while (doorChoice >= 4) {
            System.out.println("Please enter your choice of door >>>");
            doorChoice = input.nextInt();
                if (doorChoice == 1) {
                    System.out.println("Congratulations you have won $1. Don't be greedy!");
                } else if (doorChoice == 2) {
                    System.out.println("Congratulations you have won 1 million dollars. You're the big winner!!!");
                } else if (doorChoice == 3) {
                    System.out.println("Ooopppsss you chose the wrong door. You were mawled by a tiger!");
                }
            }
    }
}
