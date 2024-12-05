package Programs;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if (a==b&b==c){
            System.out.println("Equal: "+a);
            return;
        }
//        if (a>b){
//            if (a>c){
//                System.out.println("Largest: "+a);
//            }else System.out.println("Largest: "+c);
//        } else {
//            if (b>c)System.out.println("Largest: "+b);
//            else System.out.println("Largest: "+c);
//        }

//        int max = a;
//        if (b>max){
//            max = b;
//        }
//        if (c>max){
//            max = c;
//        }
//        using max function

        int max = Math.max(a,b);
        max = Math.max(max,c);
        System.out.println("Largest: "+max);
    }
}
