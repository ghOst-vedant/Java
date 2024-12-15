package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Swapp {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        swap(arr,0,2);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int pos1,int pos2){
        int temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }
}
