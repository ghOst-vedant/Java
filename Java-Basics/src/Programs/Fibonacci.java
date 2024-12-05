package Programs;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int t1 = 0;
        int t2 = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the range of the series: ");
        int n = in.nextInt();
        System.out.println(t1);
        System.out.println(t2);

        //Using for-loop
//        for (int i = 2; i <n ; i++) {
//            int t3 = t1 + t2;
//            System.out.println(t3);
//            t1 = t2;
//            t2 = t3;
//        }

        //using while-loop
//        int count = 2;
//        while(count<n){
//            int temp = t1+t2;
//            System.out.println(temp);
//            t1=t2;
//            t2=temp;
//            count++;
//        }

        //using do-while
//        do {
//            int temp = t1 + t2;
//            System.out.println(temp);
//            t1 = t2;
//            t2 = temp;
//            count++;
//        }while(count<n);
    }
}
