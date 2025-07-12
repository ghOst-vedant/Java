public class SecondLargest {
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

                if (arr[i] > largest){
                    second = largest;
                    largest = arr[i];
                } else if (arr[i] != largest && arr[i] > second) {
                    third = second;
                    second = arr[i];
                } else if (arr[i] != second && arr[i] > third) {
                    third = arr[i];
                }
        }

        return (third == Integer.MIN_VALUE) ? -1 : third;
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8};
        System.out.println("Second Largest: " + findSecondLargest(arr));  // Output: 10
    }
}
