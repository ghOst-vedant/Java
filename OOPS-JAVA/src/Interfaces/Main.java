package Interfaces;

public class Main {
    public static void main(String[] args) {

        /*
        interfaces = An interface in Java is a blueprint of a class,
                     serving as a contract for classes to implement specific behaviors.
                     It declares a set of abstract methods (methods without a body) that implementing
                       classes must define. Interfaces enable abstraction,
                       polymorphism, and multiple inheritance in Java.
         */

        Rabbit rabbit1 = new Rabbit();
        Hawk hawk1 = new Hawk();
        Fish fish1 = new Fish();

        rabbit1.flee();
        hawk1.hunt();
        fish1.flee();
        fish1.hunt();
    }
}
