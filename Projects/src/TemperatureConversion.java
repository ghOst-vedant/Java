import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double temp,newTemp;
        String unit;

        System.out.print("Enter the Temperature: ");
        temp = scanner.nextDouble();

        System.out.print("\nEnter the Unit (C or F): ");
        unit = scanner.next().toUpperCase();


        newTemp = (unit.equals("C"))? ((temp - 32) * 5 / 9) : (temp * 9 / 5) - 32 ;

        if (unit.equals("C")){
            System.out.printf("Temperature in Fahrenheit : %.2f℉",newTemp);
        }else System.out.printf("Temperature in Degree : %.2f℃",newTemp);

    }
}
