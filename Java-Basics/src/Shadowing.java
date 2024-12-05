public class Shadowing {
    static int x =100;
    public static void main(String[] args) {
        System.out.println(x);
        int x =20; //This x shadows the x = 100 value defined in the global scope.
        System.out.println(x);
        func();
    }
    static void func(){
        System.out.println("In func: "+x);
    }
}

