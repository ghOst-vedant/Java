package slidingWindow;

public class LongestSubarraySum {
    public static int longestSubarray(int[] arr, int k) {
        int start = 0, sum = 0, maxLen = 0;

        for(int end = 0; end < arr.length; end++){
            sum += arr[end];
            while(sum > k){
                sum -= arr[start];
                start++;
            }
            maxLen = Math.max(maxLen,end - start +1);
        }

        return maxLen;

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 1, 1, 0};
        int k = 4;
        System.out.println(longestSubarray(arr, k));
    }
}
