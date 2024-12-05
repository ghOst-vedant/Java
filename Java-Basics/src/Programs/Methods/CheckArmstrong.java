package Programs.Methods;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
//        int num = in.nextInt();
//        boolean ans = ArmStrong(num);
//        System.out.println(ans);

//        Print all 3 digit ArmStrong numbers
        for (int i = 100; i <= 999 ; i++) {
            ArmStrong(i);
        }
    }
//    static boolean ArmStrong(int n){
//        int sum = 0;
//        int og = n;
//        while(n != 0){
//            int digit = n%10;
//            sum += digit*digit*digit;
//            n/=10;
//        }
//        return sum==og;
//    }
    static void ArmStrong(int n){
        int sum = 0;
        int og = n;
        while(n != 0){
            int digit = n%10;
            sum += digit*digit*digit;
            n/=10;
        }
        if (sum == og){
            System.out.println(og);
        }
}
}
