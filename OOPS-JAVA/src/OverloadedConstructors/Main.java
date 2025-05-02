package OverloadedConstructors;

public class Main {
    public static void main(String[] args) {

        /*
    Overloaded constructors = They allow a class to have multiple constructors to handle various
                            object constructions in the program
     */
        User user1 = new User();
        User user2 = new User("Vedant","v1@gmail.com");
        User user3 = new User("Tahir");


        System.out.println("User1");
        System.out.println();
        System.out.println("User1:"+user1.userName);
        System.out.println("User1:"+user1.email);
        System.out.println("User1:"+user1.age);

        System.out.println("User2");
        System.out.println();
        System.out.println("User2:"+user2.userName);
        System.out.println("User2:"+user2.email);
        System.out.println("User2:"+user2.age);


        System.out.println("User3");
        System.out.println();
        System.out.println("User3:"+user3.userName);
        System.out.println("User3:"+user3.email);
        System.out.println("User3:"+user3.age);
    }

}
