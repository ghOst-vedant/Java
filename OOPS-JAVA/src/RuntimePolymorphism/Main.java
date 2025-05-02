package RuntimePolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Runtime Polymorphism = When the method that gets executed is decided at runtime
                               based on the actual type of the object
         */

        int choice ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like a dog or a cat (1 = dog, 2 = cat): ");
        choice = scanner.nextInt();


        Animal animal;

        if (choice == 1){
            animal = new Dog();
            animal.speak();
        } else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
    }
}
