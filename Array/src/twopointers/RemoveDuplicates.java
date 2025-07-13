package twopointers;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] arr) {
        // your logic
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        int len = removeDuplicates(arr);
        System.out.println("Length: " + len);
        for (int i = 0; i < len; i++) {
            System.out.print(arr[i] + " ");  // Should print: 1 2 3
        }
    }
}
