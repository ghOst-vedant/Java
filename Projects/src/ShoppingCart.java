import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
            //shopping cart program
        Scanner in = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '₹';
        double total;

        System.out.print("What would you like to buy: ");
        item = in.nextLine();

        System.out.print("What is the price of each "+item+" ? ");
        price = in.nextDouble();

        System.out.print("How many would you like to buy ? ");
        quantity = in.nextInt();

        total = price*quantity;
        System.out.print("Your total bill: "+total+currency);
        in.close();
    }
}