package Excercises;
import java.util.Scanner;
import java.util.Random;


public class RockPaperScissors {
    public static void main(String[] args) {
        String personPlay = "yes";
        String computerPlay = "";
        int computerInt;
        int countTie = 0;
        int countLose=0;
        int countWin = 0;
        Scanner scan = new Scanner(System.in);
        Random generator = new Random();
        while (!personPlay.equalsIgnoreCase("QUIT")){
            System.out.println("Hey, let's play Rock, Paper, Scissors!\n" +
                    "Please enter a move.\n" + "Rock = R, Paper" +
                    "= P, and Scissors = S. or QUIT");

            System.out.println();
            computerInt = generator.nextInt(3) + 1;
            if (computerInt == 1)
                computerPlay = "R";
            else if (computerInt == 2)
                computerPlay = "P";
            else if (computerInt == 3)
                computerPlay = "S";
            else if(personPlay.equalsIgnoreCase("QUIT"))
                System.exit(0);


                System.out.println("Enter your play: ");
                personPlay = scan.next();
                personPlay = personPlay.toUpperCase();

                System.out.println("Computer play is: " + computerPlay);

            if (personPlay.equals(computerPlay)) {
                System.out.println("It's a tie!");
                countTie++;
            } else if (personPlay.equals("R")) {
                if (computerPlay.equals("S"))
                    System.out.println("Rock crushes scissors. You win!!");
                countWin++;
            } else if (personPlay.equals("R")) {
                if (computerPlay.equals("P"))
                    System.out.println("Paper eats rock. You lose!!");
                countLose++;
            } else if (personPlay.equals("P")) {
                if (computerPlay.equals("S"))
                    System.out.println("Scissor cuts paper. You lose!!");
                countLose++;
            } else if (personPlay.equals("P")) {
                if (computerPlay.equals("R"))
                    System.out.println("Paper eats rock. You win!!");
                countWin++;
            } else if (personPlay.equals("S")) {
                if (computerPlay.equals("P"))
                    System.out.println("Scissor cuts paper. You win!!");
                countWin++;
            } else if (personPlay.equals("S")) {
                if (computerPlay.equals("R"))
                    System.out.println("Rock breaks scissors. You lose!!");
                countLose++;
            } else
                System.out.println("Invalid user input.");
        }
        System.out.println("You won " + countWin + " times.");
        System.out.println("You tied " + countTie + " times.");
        System.out.println("You lost " + countLose + " times.");
        System.out.println("\nThanks for playing!");
    }
}

