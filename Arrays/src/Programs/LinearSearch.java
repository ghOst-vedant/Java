package Programs;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array: ");
        for (int i = 0; i < size; i++) {
            int ele = in.nextInt();
            arr[i] = ele;
        }
        System.out.println("Element to search:");
        int ele = in.nextInt();

        int res =  linearSearch(arr,ele);
        if (res == 0){
            System.out.println("Element not found.");
            return;
        }
        else{
            System.out.println("Element found at "+res+".");
        }


    }
    static int linearSearch(int[] arr,int ele){
        if (arr.length == 0) return 0;
        for (int i = 0; i < arr.length; i++) {
            if (ele == arr[i]){
                return i;
            }
        }
        return 0;
    }
}
