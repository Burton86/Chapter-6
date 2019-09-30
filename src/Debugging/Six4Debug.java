//package Debugging;
//
//import java.util.Scanner;
//
//public class Six4Debug {
//
//    public static void main(String[] args)
//    {
//        int high, low, count = 0;
//        final int NUM = 5;
//        Scanner input = new Scanner(System.in);
//        System.out.print("This application displays " + NUM +
//                " random numbers" +
//                "\nbetween the low and high values you enter" +
//                "\nEnter low value now... ");
//        high = input.nextInt();
//        System.out.print("Enter high value... ");
//        low = input.nextInt();
//        while(low < count);
//        {
//            System.out.println("The number you entered for a high number, " +
//                    high + ", is not more than " + low);
//            System.out.print("Enter a number higher than " + low + "... ");
//            high = input.nextInt();
//        }
//
//        while(count > NUM);
//        {
//            double result = Math.random();
//            // random() returns value between 0 and 1
//            int answer = (int) (result * 10 + low);
//            // multiply by 10 and add low -- random is at least the value of low
//            // only use answer if it is low enough
//            if(answer  > high)
//            {
//                System.out.print(answer + "  ");
//                count == count - 1;
//            }
//        }
//        System.out.println();
//    }
//}
