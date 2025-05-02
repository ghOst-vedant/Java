package Polymorphism;

public class Main {
    public static void main(String[] args) {


        /*
        Polymorphism = "Poly" = many
                        "Morph" = shape
                        various object inheriting a super class or
                        implementing a interface can be treated as objects of a common subclass.
                        Objects can be identified as other objects.

          */
        Boat boat1 = new Boat();
        Bike bike1 = new Bike();
        Car car1 = new Car();

        Vehicle[] vehicles = {car1,boat1,bike1};
    }
}
