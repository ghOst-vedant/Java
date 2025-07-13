package slidingWindow;

public class MinimumSizeSubarray {

    public static int minSubArrayLen(int target, int[] arr) {

        int start = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        for (int end = 0; end < arr.length ; end++) {
            sum += arr[end];
            while(sum >= target){
                minLen = Math.min(minLen, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        return (minLen == Integer.MAX_VALUE) ? 0 : minLen;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target, arr));  // Output: 2
    }
}
