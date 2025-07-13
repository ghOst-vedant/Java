package strings;

public class CountVowels {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("vedant");

        int count = 0;

        for (int i = 0; i < name.length(); i++){
            char ch = name.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
    }
}
