package OOPS;

public class Car {
    String make =  "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = false;
    void start(){
        if (isRunning){
            System.out.println("OOPS.Car is already running...");
        }
       else {
            System.out.println("Engine started...");
            isRunning = true;
       }
    }
    void drive(){
        System.out.println("You drive the "+ model);
    }
    void stop(){
        if (isRunning){
            isRunning = false;
            System.out.println("Engine stopped...");
        }else{
            System.out.println("Engine is not started...");
        }

    }
}
