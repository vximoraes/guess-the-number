import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100 + 1);

        int attempts = 10;
        int guess;

        System.out.println("You have " + attempts + " attempts to get the number right!\n");

        while (attempts > 0){

            System.out.print("Your guess: ");
            guess = input.nextInt();

            if (guess == randomNumber){
                System.out.println("\nCongratulations! You got the number right!");
                System.out.println("The right number was: " + randomNumber);
                break;
            } else if (guess < randomNumber){
                System.out.println("The number is greater than " + guess + "!");
            }else{
                System.out.println("The number is less than " + guess + "!");
            }
            attempts--;
        }

        if (attempts == 0){
            System.out.println("\nYou couldn't get the number right... Try again later!");
            System.out.println("The right number was: " + randomNumber);
        }

    }
}
