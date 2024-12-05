package Programs.Methods;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        System.out.println(Fact(n));
    }
    static int Fact(int num){
        int fact = 1;
        for (int i = 2; i <=num ; i++) {
            fact*=i;
        }
        return fact;
    }
}
