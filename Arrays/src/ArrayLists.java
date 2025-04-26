import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//syntax
//ArrayList<Integer> list = new ArrayList<>();

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(5);
        list.add(11);
        list.add(1,20);

        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println("Exited ArrayList.");

    }
}
