package Programs.Methods;

import java.util.Scanner;

public class Pythagorean {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        System.out.println(isTriplet(n1,n2,n3));

    }
    static boolean isTriplet(int n1,int n2,int n3){

        int s1 = n1*n1;
        int s2 = n2*n2;
        int s3 = n3*n3;

        if (s1 == s2+s3 || s2 == s1+s3 || s3 == s1+s2){
            return true;
        }
        return false;
    }
}
