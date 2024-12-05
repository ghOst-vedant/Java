import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String str = in.next();

//        String a = "chickoo";
//        if (a.equals(str)){
//            System.out.println("Found: chickoo");
//        }else System.out.println("Found: "+str);

        int day = in.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("It's a Monday");
//            case 2 -> System.out.println("It's a Tuesday.");
//            case 3 -> System.out.println("It's a Wednesday.");
//            case 4 -> System.out.println("It's a Thursday.");
//            case 5 -> System.out.println("It's a Friday.");
//            case 6 -> System.out.println("It's a Saturday.");
//            case 7 -> System.out.println("It's a Sunday.");
//            default -> System.out.println("Enter a valid day...");
//        }

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
        }

    }
}
