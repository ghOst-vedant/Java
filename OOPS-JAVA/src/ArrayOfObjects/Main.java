package ArrayOfObjects;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
        Car car1 = new Car("Mustang","red");
        Car car2 = new Car("Mercedes", "white");
        Car car3 = new Car("BMW", "black");

         */

        // These are anonymous objects 
        Car[] cars = {
                new Car("Mustang","red"),
                new Car("Mercedes", "white"),
                new Car("BMW", "black")
        };

        /*
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;

         */

        for (Car car : cars) {
            car.drive();
        }

    }
}
