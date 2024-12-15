import java.util.Arrays;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//          Int arrays
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = i;
//        }
//        for (int j : arr) {
//            System.out.println(j);
//        }
//        System.out.println(Arrays.toString(arr));

        //Array of objects
//        String[] strings = new String[5];
//        for (int i = 0; i < strings.length; i++) {
//            strings[i]=in.next();
//        }
//        System.out.println(Arrays.toString(strings));

        //Passing array to function
        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println("After modification: "+Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=arr[arr.length-1];
        arr[1]=arr[arr.length-2];

    }

}
