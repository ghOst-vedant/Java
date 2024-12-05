package Programs.Methods;

import java.util.Scanner;

public class NumberPalindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPalindrome(num));
    }
    static boolean isPalindrome(int num){
        int og = num;
        int n = 0;
        while(num!=0){
            int digit = num%10;
            n = n*10 + digit;
            num/=10;
        }

        return og == n;
    }
}
