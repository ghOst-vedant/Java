public class StringMethods {
    public static void main(String[] args) {


        String name = "     Vedant Gaikwad      ";

        //Length method
        int length = name.length();
        System.out.printf("length of %s is %d",name,length);

        //Get character at a particular index
        char start = name.charAt(0);
        System.out.printf("\nStarting letter is %c.\n",start);

        //To find the first occurrence of a character
        int index = name.indexOf('t');
        System.out.println(index);

        //To find the last occurrence of a character
        int lastIndex = name.lastIndexOf('d');
        System.out.println(lastIndex);

        //Upper Case

        name = name.toUpperCase();
        System.out.println(name);
        name = name.toLowerCase();
        System.out.println(name);

        //Eliminate white space
        System.out.println(name.trim());

        //replace
        name = name.replace('e','i');
        System.out.println(name.trim());


        //check if the string is empty
        if (name.isEmpty()) System.out.println("isEmpty!!!!!");

        //check if the string contains anything
        System.out.println(name.contains(" "));

        //Check if the string is equal to
        if (name.equals("Vedant")){
            System.out.println("Yes name is Vedant");
        }else {
            System.out.println("No the name is "+name.trim());
        }

        //check equal strings avoiding the case sensitivity
        //name.equalsIgnoreCase("string")
    }
}
