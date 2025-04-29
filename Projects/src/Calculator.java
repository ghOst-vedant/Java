import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double num1, num2, result = 0;
        char operator;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '^' -> result = Math.pow(num1,num2);

            default -> {
                System.out.println("Enter a valid operator.");
            }
        }

        System.out.printf("%.2f %s %.2f = %.2f",num1, operator, num2, result);
    }
}
