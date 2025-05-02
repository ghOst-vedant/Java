import java.util.Random;
import java.util.Scanner;

public class StonePaperScissors {
    public static void main(String[] args) {
        //Stone Paper Scissor Game

        Scanner scanner = new Scanner(System.in);
        Random random= new Random();

        // Declare Variable
        String[] choices = {"stone","paper","scissor"};
        String playerChoice, computerChoice, playAgain = "y";

        do {
        // Get the choice from the user
            System.out.print("Enter your choice (stone, paper, scissor): ");
            playerChoice = scanner.next().toLowerCase();

            if (!playerChoice.equals("stone") && !playerChoice.equals("paper") && !playerChoice.equals("scissor")){
                System.out.println("Invalid choice!");
            }

        // Get the random choice for the computer
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: "+computerChoice);

        // Check the win conditions
            if (playerChoice.equals(computerChoice)){
                System.out.println("It's a tie.");
            } else if (playerChoice.equals("stone") && computerChoice.equals("scissor") ||
                    playerChoice.equals("paper") && computerChoice.equals("stone") ||
                    playerChoice.equals("scissor") && computerChoice.equals("paper")) {
                System.out.println("You Win!");
            }else {
                System.out.println("You lose!");
            }

        // Ask to play again
            System.out.println("Play again (yes/no): ");
            playAgain = scanner.next().toLowerCase();
        }while (playAgain.equals("y"));




        scanner.close();
    }
}
