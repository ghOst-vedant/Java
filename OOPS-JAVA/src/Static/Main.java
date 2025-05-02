package Static;

public class Main {
    public static void main(String[] args) {

        Friend f1 = new Friend("Tahir");
        Friend f2 = new Friend("Alex");
        Friend f3 = new Friend("Aniket");

        /*
        For static variable the whole class will have the constant value
        Commonly used for utility methods or shared resources
         */
        System.out.println(Friend.numOfFriends);
        Friend.showFriends();
    }
}
