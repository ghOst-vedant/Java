package Abstraction;

public class Main {
    public static void main(String[] args) {
        /*
        abstract = Used to define abstract classes and methods.
                Abstraction is the process of hiding implementation details
                and showing only the essential features;
                Abstract classes CAN'T be instantiated directly
                Can contain 'abstract' methods (which must be implemented)
                Can contain 'concrete' methods (which are inherited)
         */

        Circle c1 = new Circle(5);
        Triangle t1 = new Triangle(5,10);
        Rectangle r1 = new Rectangle(5,5);
        double ca1 = c1.area();
        double ta1 = t1.area();
        double ra1 = r1.area();
        System.out.printf("Area of c1: %.2f",ca1);
        System.out.printf("\nArea of t1: %.2f",ta1);
        System.out.printf("\nArea of r1: %.2f",ra1);
    }
}
