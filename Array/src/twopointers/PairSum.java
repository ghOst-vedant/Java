package twopointers;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int target = 4;
        System.out.println(check(arr,target));
    }
    private static boolean check(int[] arr, int x){
        int s = 0;
        int e = arr.length - 1;

        while(s < e){
            if ((arr[s] + arr[e]) == x) return true;
            if ((arr[s] + arr[e]) > x) e--;
            if((arr[s] + arr[e]) < x) s++;

        }
        return false;
    }
}
