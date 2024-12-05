package Programs;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true){
            System.out.println("Enter the operation: ");
            char op = in.next().trim().charAt(0);
            if (op=='+' || op=='-' || op=='*' || op=='/' || op=='%'){
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                if (op == '+'){
                    System.out.println(n1+n2);
                }
                if (op=='-'){
                    System.out.println(n1-n2);
                }
                if(op=='*'){
                    System.out.println(n1*n2);
                }
                if(op=='/'){
                    System.out.println(n1/n2);
                }
            }
            else if(op == 'x' || op == 'X') break;
            else{
                System.out.println("Invalid Operation.");
            }
        }

    }
}
