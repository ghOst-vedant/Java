package Programs;

import java.util.Scanner;

public class StringSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = in.next();
        System.out.println("Enter the character: ");
        char ch = in.next().trim().charAt(0);
        System.out.println(searchString(str,ch));
    }
    static boolean searchString(String str,char ch){
        if (str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch){
                return true;
            }
        }
        return false;
    }
}
