package strings;

import java.util.Arrays;

public class basics {
    public static void main(String[] args) {
        String name = "vedant";
        String NAME = "VEDANT";

        System.out.println("char at 0: "+name.charAt(0));

        System.out.println("length: "+ name.length());

        System.out.println("substring: "+ name.substring(3,name.length() - 1 ));

        System.out.println("equals: "+name.equals(NAME));

        System.out.println("equalsIgnoreCase: "+ name.equalsIgnoreCase(NAME));

        System.out.println("Index of d: "+ name.indexOf("d"));

        System.out.println("contains (dad): "+name.contains("dad"));

        char[] charArray = name.toCharArray();
        System.out.println("toCharArray: "+ Arrays.toString(charArray));

    }
}
