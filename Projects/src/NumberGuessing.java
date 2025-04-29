import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int guess, attempts = 0, randomNum;

        randomNum = random.nextInt(1,11);
        System.out.println("Number guessing game: ");
        System.out.println("Guess a number from 1 to 10");

        do{
            System.out.print("Enter a guess:");
            guess = scanner.nextInt();
            attempts++;

            if(guess < randomNum) System.out.println("Too low!!!");
            else System.out.println("Too high!!!");
        }
        while(guess!=randomNum);
        System.out.println("Won!!!!");
        scanner.close();
    }
}
