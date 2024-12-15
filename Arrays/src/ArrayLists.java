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
//        Integer[] arr = list.toArray(new Integer[0]);
        int a = list.get(1);
        int[] arr = new int[0];
        System.out.println(arr.getClass());
//        for(int ele:arr){
//            System.out.println(ele);
//        }

    }
}
