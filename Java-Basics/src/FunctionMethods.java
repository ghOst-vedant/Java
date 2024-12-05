import java.util.Arrays;
import java.util.Scanner;

public class FunctionMethods {
    /*
    access modifier return_type{
        //body
        return statement
    }
    * */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        sum of 2 numbers....
//        int num1 = in.nextInt();
//        int num2 = in.nextInt();
//
//        int sum = sum(num1,num2);
//        System.out.println(sum);

//        greeting method
//        String name = in.nextLine();
//        greet(name);
        vArgs(1,2,3,4,5,6,7);

    }
        //Variable arguments
    static void vArgs(int ...v){
        System.out.println(Arrays.toString(v));
    }

    static int sum(int num1,int num2){
        return num1+num2;
    }
    static void greet(String name){
        System.out.println("Hello, "+ name+".");
    }

}
