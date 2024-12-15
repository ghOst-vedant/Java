package Programs;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {11,2,3,4,10};
        int maxi = max(arr);
        int mini = min(arr);
        System.out.println(maxi);
        System.out.println(mini);
    }
    static int max(int[] arr){
        int maxi = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxi){
                maxi = arr[i];
            }
        }
        return maxi;
    }
    static int min(int[] arr){
        int mini = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < mini){
                mini = arr[i];
            }
        }
        return mini;
    }
}
