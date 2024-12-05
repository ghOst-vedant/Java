package Programs.Methods;

import java.util.Scanner;

public class GradesFromMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int marks = in.nextInt();
        Grades(marks);
    }
    static void Grades(int marks){

        switch (marks/10){
            case 10:
            case 9:
                System.out.println("AA");
                break;
            case 8:
                System.out.println("AB");
                break;
            case 7:
                System.out.println("BB");
                break;
            case 6:
                System.out.println("BC");
                break;
            case 5:
                System.out.println("CD");
                break;
            case 4:
                System.out.println("DD");
                break;
            default:
                System.out.println("Fail");

        }
    }
}
