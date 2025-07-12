import java.util.Arrays;


public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12,0,12,14,0,42,3,0,35,234,};
        moveZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void moveZeros(int[] arr) {

        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arr[i] = arr[j];
                i++;
            }
        }
        while (i < arr.length){
            arr[i] = 0;
            i++;
        }
    }

    private static void swap(int i, int j) {
        int temp = i;
        i = j;
        j = temp;
    }

}
