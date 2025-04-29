import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        int target;
        System.out.println("Enter 5 elements for the array");

        for (int i = 0; i < arr.length; i++) {
            arr[i]= scanner.nextInt();
        }
        System.out.print("The array: ");
        for (int j : arr) {
            System.out.print(j + " ");
        }

        System.out.print("\nEnter the number to search: ");
        target = scanner.nextInt();

        int s = 0,e = arr.length - 1,mid = 0;
        boolean flag = false;
        while(s<=e){
           mid = s+(e-s)/2;
           if (arr[mid] == target) {
               flag = true;
               System.out.printf("Found at %d", mid);
               break;
           }
           else if (arr[mid]<target) {
               s = mid + 1;
           } else e = mid;
        }

        if (!flag) System.out.println("Element not found");
    }
}
