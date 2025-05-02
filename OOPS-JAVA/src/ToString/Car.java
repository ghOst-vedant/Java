package ToString;

public class Car {
    String model;
    String color;
    Car(String model,String color){
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.model + " "+ this.color;
    }
}
