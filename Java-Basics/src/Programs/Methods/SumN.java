package Programs.Methods;

import java.util.Scanner;

public class SumN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        System.out.println(sum(num));

    }
    static int sum(int n){
        return n*(n+1)/2;
    }
}
