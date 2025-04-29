import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.print("Enter the number:");
        num = scanner.nextInt();

        int decision = (num > 10) ? 100 : 10;
        System.out.println(decision);

        scanner.close();
    }
}
