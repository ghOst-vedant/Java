package slidingWindow;

public class MaxSubarraySum {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,4,2};
        int k = 3;
        System.out.println("Max Subarray Sum: " + subArraySum(arr,k));
    }

    private static int subArraySum(int[] arr, int k) {
        int maxSum = 0;
        int windowSum = 0;
        for (int i = 0; i < k; i++){
            windowSum += arr[i];
        }
        for (int i = k; i < arr.length ; i++) {
               windowSum = windowSum - arr[i - k] + arr[i];
               maxSum = Math.max(windowSum,maxSum);
        }
        return maxSum;
    }
}

