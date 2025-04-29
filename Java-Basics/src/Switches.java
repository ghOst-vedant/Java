import java.util.Scanner;

public class Switches {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("Enter the day: ");
        day = scanner.nextLine().toLowerCase();

        /*
        switch (day){
            case "monday" -> System.out.println("Its Weekday");
            case "tuesday" -> System.out.println("Its Weekday");
            case "wednesday" -> System.out.println("Its Weekday");
            case "thursday" -> System.out.println("Its Weekday");
            case "friday" -> System.out.println("Its Weekday");
            case "saturday" -> System.out.println("Weekend Starts!");
            case "sunday" -> System.out.println("Weekend...");
        }
        */

        switch (day){
            case "monday","tuesday","wednesday","thursday", "friday" -> System.out.println("Its Weekday");
            case "saturday","sunday" -> System.out.println("Weekend...");
        }

    }
}
