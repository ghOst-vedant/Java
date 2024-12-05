package Programs;

import java.util.Scanner;

public class OccurenceInNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = in.nextInt();
        System.out.println("Enter the number to find occurrences: ");
        int n = in.nextInt();
        int occ = 0;
        while(num!=0){
            int digit = num%10;
            if (digit == n) occ++;
            num/=10;
        }
        System.out.println(occ);
    }
}
