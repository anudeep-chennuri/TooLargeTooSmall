
import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int x = random.nextInt(500);
        int guess;
        int oldguess = 0;
        int count = 0;
        boolean condition = true;

        while (condition == true) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            count++;

            if (guess == oldguess) {
                continue;
            } else if (guess < x ){
                System.out.println("Too Small Try Again!");
            } else if (guess > x) {
                System.out.println("Too Big Try Again!");
            } else {
                System.out.println("Correct Guess You Win!");
                System.out.println("Nice, You Got It In " + count + " Tries.");
                condition = false;
            }

            oldguess = guess;

        }}}