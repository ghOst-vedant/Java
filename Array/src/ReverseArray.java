import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int[] B = {4, 5, 1, 2, 3};
        int k = 3;

        System.out.println(isLeftRotation(A, B, k));
    }

    private static boolean isLeftRotation(int[] a, int[] b, int k) {
        int n = a.length;
        System.out.println(Arrays.toString(a));
        reverse(a,0,k-1);
        reverse(a, k,n-1);
        reverse(a,0,n-1);

        for(int i = 0; i < n; i++){
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    private static void reverse(int[] arr, int start, int end){
            while( start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
    }
}
