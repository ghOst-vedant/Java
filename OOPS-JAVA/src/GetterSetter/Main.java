package GetterSetter;

public class Main {
    public static void main(String[] args) {

        /*
        They help protect object data and add rules for accessing or modifying them.
        Getter = Methods that make a field READABLE.
        setter = Methods that make a field WRITEABLE.
         */

        Car car1 = new Car("Mustang","Red",50000);

        car1.setModel("GT");
        System.out.println(car1.getModel() +" " + car1.getColor() +" "+ car1.getPrice() );
    }
}
