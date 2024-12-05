public class Overloading {
    public static void main(String[] args) {
//        This is method overloading
//        when 2 methods have same name the execution depends on the type of arguments supplied to the method, either the number of arguments should be different or the type of arguments should be different.
        func(9);
        func("vedant");
    }
    static void func(int a){
        System.out.println(a);
    }
    static void func(String name){
        System.out.println(name);
    }
}

