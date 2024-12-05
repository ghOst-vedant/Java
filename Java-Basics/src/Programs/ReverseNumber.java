package Programs;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = in.nextInt();
        int rev = 0;
        while(num!= 0){
            int digit = num%10;
            rev = rev*10+digit;
            num/=10;
        }
        System.out.println("Reverse: "+rev);

    }
}
