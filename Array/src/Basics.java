import java.util.Arrays;
import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"apple", "mango","banana", "guava", "jackfruit"};
        String[] foods = new String[10];
        //fruits[0]= "pineapple";
        //Arrays.fill(fruits,"banana");
        //int len = fruits.length;
        //Arrays.sort(fruits);

        //System.out.println(Arrays.toString(fruits));

        for(String fruit:fruits){
            System.out.println(fruit);
        }

        for (int i = 0; i < 2; i++) {
            foods[i] = scanner.nextLine();
        }

        System.out.print(Arrays.toString(foods));

    }
}
