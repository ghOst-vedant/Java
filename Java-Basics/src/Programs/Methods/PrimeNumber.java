package Programs.Methods;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean decision = prime(n);
        System.out.println(decision);
    }
    static boolean prime(int num){
        if (num == 2) return true;
        if(num%2 == 0) return false;
        if (num<=1) return false;
        int c = 3;
        while(c * c <=num) {
            if (num % c == 0) return false;
            c+=2;
        }
        return c*c>num;
    }

}
