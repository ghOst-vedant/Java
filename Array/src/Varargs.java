public class Varargs {

    public static void main(String[] args) {
        //Rather than declaring various methods just for the sake of
        // more arguments we use varargs in the methods
        int sum = add(1,2,3,4,5,6,7);
        System.out.println(sum);
    }
    static int add(int... numbers){
        int sum = 0;
        for(int num:numbers){
            sum+=num;
        }
        return sum;
    }
}
