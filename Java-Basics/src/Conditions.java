import java.util.Scanner;

public class Conditions{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = in.nextInt();
        if(a == 10){
            System.out.println("Enter b: ");
           int b = in.nextInt();
           if (b==5){
               a -=b;
           }
           else{
            a += b;
           }
           System.out.println("a = "+a);
        }
        else{
            System.out.println("Value not equal to 10.");
        }

    }
}