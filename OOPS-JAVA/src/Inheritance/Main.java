package Inheritance;

public class Main {
    public static void main(String[] args) {
        /*
        One class inherits attributes and methods from another class
        */
        Dog dog1 = new Dog();

        Cat cat1 = new Cat();

        System.out.println(dog1.isAlive);
        dog1.bark();

        System.out.println(cat1.isAlive);
        cat1.meow();
    }
}
