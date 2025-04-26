import java.util.Random;

public class RandomNum {
    public static void main(String[] args){

        Random random = new Random();

        int num;
        num= random.nextInt(1,101);
        System.out.println(num);

        boolean isHead;

        isHead = random.nextBoolean();

        if (isHead) System.out.print("Heads");
        else System.out.print("Tails");
    }
}
