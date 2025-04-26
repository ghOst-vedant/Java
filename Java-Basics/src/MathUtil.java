import java.util.Scanner;

public class MathUtil {
    public static void main(String[] args) {

        //value of pi
//        System.out.println(Math.PI); //3.141592653589793
//
//        //exponential constant
//        System.out.println(Math.E); //2.718281828459045
//
//        double result;
//        result = Math.pow(2,4); // 2 to power 4 = 16.0 as it is a double
//        System.out.println(result);
//
//        System.out.println(Math.abs(-10));
//        System.out.println(Math.sqrt(9));
//        System.out.println(Math.floor(3.58));
//        System.out.println(Math.round(3.58));
//        System.out.println(Math.ceil(3.58));
//        System.out.println(Math.min(9,10));
//        System.out.println(Math.max(9,10));



        //HYPOTENUSE of a TRIANGLE
        Scanner in = new Scanner(System.in);
//        int a,b;
//
//        System.out.print("Enter the side1: ");
//        a = in.nextInt();
//        System.out.print("Enter the side2: ");
//        b = in.nextInt();
//
//        double hypo;
//        hypo = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
//
//        System.out.println("Hypotenuse: "+hypo+"cm");

        // circle
        int r;
        System.out.print("Enter the radius: ");
        r = in.nextInt();
        double circum,area,volume;

        circum = 2* Math.PI*r;
        area = Math.PI * Math.pow(r,2);
        volume = (4 / 3)*Math.PI* Math.pow(r,3);

        System.out.printf("Circumference: %.1fcm\n",circum);
        System.out.printf("Area: %.1fcm²\n",area);
        System.out.printf("Volume: %.1fcm³",volume);
    }
}
