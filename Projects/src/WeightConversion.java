import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int choice;
        double weight,newWeight;
        System.out.println("Weight conversion program");
        System.out.println("1. Convert Kg to lbs");
        System.out.println("2. Convert lbs to kg");

        System.out.print("Enter your choice:");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.println("Enter the weight in kg:");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("Weight in lbs: %.2f",newWeight);
        }if (choice == 2){
            System.out.println("Enter the weight in lbs:");
            weight = scanner.nextDouble();
            newWeight = weight / 2.20462;
            System.out.printf("Weight in lbs: %.2f",newWeight);
        }
        scanner.close();
    }
}
