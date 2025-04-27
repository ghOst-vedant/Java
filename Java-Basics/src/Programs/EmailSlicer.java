package Programs;

import java.util.Scanner;

public class EmailSlicer {
    public static void main(String[] args) {

//        String email = "abcd@gmail.com";
        String name,domain ;

        Scanner scanner = new Scanner(System.in);
        String email;

        System.out.print("Enter the email:");
        email = scanner.nextLine();

        //Get the username
        if (email.contains("@")){
            int index = email.indexOf("@");
            name = email.substring(0,index);
            System.out.println("Username: "+name);

            //Get the domain
            domain = email.substring(index+1);
            System.out.println("Domain: "+domain);
        }else{
            System.out.println("Please enter a valid email!!!!");
        }

        scanner.close();
    }
}
