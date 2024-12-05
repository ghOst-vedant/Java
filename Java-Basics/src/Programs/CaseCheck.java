package Programs;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("UpperCase\n");
        }else  System.out.println("LowerCase\n");

    }
}
