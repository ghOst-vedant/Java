import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class JavaSlotMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declare variable
        String[] row;
        int balance = 100,bet,payout;

        //display welcome message

        System.out.println("*******************************");
        System.out.println("     Welcome to java slots  ");
        System.out.println("    Symbols: 🍉 🍒 🍋 🔔 ⭐️   ");
        System.out.println("*******************************");

        //play if balance > 0
        while(balance>0){
            System.out.println("Current balance: $" + balance);

        //enter bet amount
            System.out.print("Your bet: ");
            bet = scanner.nextInt();

        //  verify if bet > amount
            if (bet > balance){
                System.out.println("Insufficient balance!");
                continue;
            } else if (bet <= 0) {
        //  verify if bet > 0
                System.out.println("Bet must be greater than 0");
                continue;
            }else{
        //  subtract bet from the balance
                balance -= bet;
                System.out.println("current balance $" + balance);
            }
        //spin row
            row = spinRow();
        //print row
            printRow(row);
        //get payout
            payout = getPay(row,bet);
            if(payout > 0){
                System.out.println("You won: $"+payout);
                balance += payout;
            }
            else{
                System.out.println("Sorry u lost this round");
            }
;        }

        //ask to play again
        //exit
        scanner.close();
    }
    static String[] spinRow(){
        String[] symbols = {"🍉", "🍒", "🍋", "🔔", "⭐️"};
        String[] row = new String[3];

        Random random = new Random();

        for (int i = 0; i < 3;i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }
    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" "+ String.join(" | ", row));
        System.out.println("**************");
    }
    static int getPay(String[] row, int bet){

        if (row[0].equals(row[1]) && row[0].equals(row[2])){
            return switch (row[0]){
                case "🍉" -> bet * 3;
                case "🍒" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐" -> bet * 20;
                default -> 0;
            };
        }else if (row[0].equals(row[1])) {
            return switch (row[0]){
                case "🍉" -> bet * 2;
                case "🍒" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "🍉" -> bet * 2;
                case "🍒" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }else if (row[0].equals(row[2])) {
            return switch (row[0]){
                case "🍉" -> bet * 2;
                case "🍒" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
