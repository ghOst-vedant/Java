package strings;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the string: ");
        String string = sn.next();

        System.out.println(palindrome(string));
    }
    private static boolean palindrome(String string){

        int start = 0;
        int end = string.length() - 1;
        while(start < end){
            if (string.charAt(start) == string.charAt(end)){
                start++;
                end--;
            }else{
                return false;
            }
        }
        return true;
    }
}
