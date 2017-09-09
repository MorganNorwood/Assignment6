/*

Morgan Norwood
Assignment 3.14 Heads or Tails.
9/7/2017

 */

import java.util.Scanner;

    public class Assignment3 {

    public static void main(String[] args) {

        int num;
        int guess;

        num = (int)(Math.random() *2);
        //making a random int
        Scanner input = new Scanner (System.in);

        System.out.print("Heads or Tails? (enter 0 for heads and 1 for tails) ");
        guess = input.nextInt();

        //code will determine if the number entered is the same as the random number (between 0-1) are the same.
        if (guess == num) {
            System.out.println("You win");
        }else{
            System.out.println("you lose");
        }






    }
}