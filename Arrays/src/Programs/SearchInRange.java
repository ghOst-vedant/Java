package Programs;

import java.util.Scanner;

public class SearchInRange {
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
        System.out.println("Enter the range:");
        int st = in.nextInt();
        int en = in.nextInt();
        System.out.println(searchInRange(arr,ele,st,en));
    }
    static boolean searchInRange(int[] arr, int ele,int st,int en){
        if (arr.length==0) return false;
        for (int i = st; i <= en; i++) {
            if (arr[i] == ele) return true;
        }
        return false;
    }
}
