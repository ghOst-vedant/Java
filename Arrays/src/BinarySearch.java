import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int size = in.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the array:");
        for (int i = 0; i < size; i++) {
            int num = in.nextInt();
            arr[i] = num;
        }

        System.out.println("Enter the number to search: ");
        int ele = in.nextInt();
        int position = binarySearch(arr,ele);
        System.out.println("Element found at: "+position);
    }
    static int binarySearch(int[] arr, int ele){
        int s = 0;
        int e = arr.length - 1;
        while(s <= e){
            int mid = s +(e - s) /2;
            if(arr[mid] == ele){
                return mid;
            } else if (arr[mid] > ele) {
                e = mid;
            }
            else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
