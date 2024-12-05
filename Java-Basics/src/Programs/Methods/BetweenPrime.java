package Programs.Methods;

import java.util.Scanner;

public class BetweenPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int s = in.nextInt();
        int e = in.nextInt();
        for (int i = s; i <= e ; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }
    static boolean isPrime(int n){
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n%2 == 0) return false;
        int c = 3;
        while(c * c <= n){
            if (n % c == 0) return false;
            c+=2;
        }
        return c*c>n;
    }
}

