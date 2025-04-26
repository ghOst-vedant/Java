import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {

        // Compound Interest Calculator

        // A = P ((1 + (r/n))^nt)

        double principal, rate, amount;
        int interestCompounded,years;

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Principal amount:");
        principal = in.nextDouble();

        System.out.print("Enter the interest rate (in %):");
        rate = in.nextDouble()/100;

        System.out.print("Enter the times interest is compounded per year: ");
        interestCompounded = in.nextInt() ;

        System.out.print("Enter the years: ");
        years = in.nextInt() ;

        amount = principal * Math.pow((1+(rate/years)),(years*interestCompounded));

        System.out.printf("\nAmount: %.2f",amount);
       in.close();
    }
}
