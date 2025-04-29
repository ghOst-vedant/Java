import java.util.Scanner;

public class JavaQuizGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //QUESTIONS array[]
        String[] questions = {"1. What is the capital of Australia?",
                "2. Which planet is known as the \"Red Planet\"?",
                "3. What is the chemical symbol for Gold?","Who wrote the play Romeo and Juliet?",
                "4. Which is the largest ocean on Earth?"};

        //OPTIONS array[][]
        String[][] options = {{"1. Sydney","2. Melbourne","3. Canberra","4. Brisbane"},
                             {"1. Venus","2. Saturn","3. Jupiter","4. Mars"},
                             {"1. Gd","2. Au","3. Ag","4. Go"},
                             {"1. Charles Dickens", "2. William Shakespeare", "3. Jane Austen", "4. Mark Twain"},
                             {"1. Atlantic Ocean", "2. Indian Ocean", "3. Arctic Ocean", "4. Pacific Ocean"}};

        int[] correctAnswers = {3,4,2,2,4};
        int score=0,guess;

        System.out.println("*****************");
        System.out.println("Welcome to the quiz game");
        System.out.println("*****************");

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);
            for(String option:options[i]){
                System.out.println(option);
            }
            System.out.print("Enter your choice: ");
            guess = scanner.nextInt();
            if (guess == correctAnswers[i]) score+=1;
        }

        System.out.println("Your score:"+score);
        // DECLARE VARIABLES

        //WELCOME MESSAGE

        //QUESTION
            //LIST ANSWERS
            //GET GUESS AND ANSWERS

        //FINAL SCORE
    }
}
