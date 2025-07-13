package slidingWindow;

public class MaxAverageSubarray {
    private static double findMaxAverage(int[] arr, int k) {

        if(arr==null || arr.length < k || k <=0) return 0.0;

       int sum = 0;
       double result = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        result = (double) sum / 4;

        for (int i = k; i < arr.length ; i++) {
            sum += arr[i];
            sum -= arr[i - k];
            result = Math.max(result, (double) sum / 4);

        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        System.out.println(findMaxAverage(arr,k));
    }
}
