public class Printing {
    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flag][width][.precision][specifier-character]

//        String name = "Anthony";
//        char firstLetter  = 'S';
//        int age = 21;
//        double height = 175;
//        boolean isEmployed = true;
//
//        System.out.printf("Hello this is %s. He is %d. %s is %.1f tall.\n",name,age,name,height);
//        System.out.printf("He's first letter is %c.\n",firstLetter);
//        System.out.printf("Employed: %b.\n",isEmployed);

        //[flags]
        // + = output plus for positive
        // , =  comma seperated values like 10,000
        // ( = negative numbers enclosed in ()
        // space = to add space before positive numbers

//        double price = 99999999;
//        double price2 = 99.999;
//        double price3 = -1000.15;
//        System.out.printf("%,.1f\n",price);
//        System.out.printf("%2f\n",price2);
//        System.out.printf("%,.1f\n",price3);
//
        //[width]

        // 0 = zero padding
        // number = right justified padding i.e add 0 to left of the number
        // negative number = left justified padding


        int a= 1;
        int b = 25;
        int c = 355;
        int d = 4550;

//        System.out.printf("%04d\n",a);
//        System.out.printf("%04d\n",b);
//        System.out.printf("%04d\n",c);
//        System.out.printf("%04d\n",d);


        System.out.printf("%d\n",a);
        System.out.printf("%d\n",b);
        System.out.printf("%d\n",c);
        System.out.printf("%d",d);

    }

}
