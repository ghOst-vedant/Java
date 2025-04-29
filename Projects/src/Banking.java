//Banking project to help understand methods

import java.util.Scanner;

public class Banking {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        double balance = 0 ;
        int choice;
        boolean isRunning = true;
        System.out.println("Banking Program");


        while(isRunning){
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. exit");

        System.out.print("Enter your choice (1-4): ");
        choice = scanner.nextInt();

            switch (choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit();
                case 3 -> balance-=withdraw();
                case 4 -> isRunning = false;
                default -> System.out.println("Enter a valid choice!");
            }
        }

        scanner.close();
    }
    static void showBalance(double balance){
        System.out.printf("Current Balance: %.2f\n",balance);
    }
    static double deposit(){
        double amount;
        System.out.print("Enter the amount to deposit:");
        amount = scanner.nextDouble();
        return amount;
    }
    static double withdraw(){
        double amount;

        System.out.print("Enter the amount to withdraw:");
        amount = scanner.nextDouble();

        return amount;
    }

}
