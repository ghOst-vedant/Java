package strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Enter the string: ");
        StringBuilder string = new StringBuilder("Vedant");

        System.out.println(reverseString(string));
    }
    private static StringBuilder reverseString(StringBuilder string){

       int end = string.length() - 1;
        StringBuilder str = new StringBuilder();
        while(end >= 0){
            str.append(string.charAt(end));
            end--;
        }

        return str;
    }
}
