package strings;

public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vedant");

        sb.append("3030");
        sb.deleteCharAt(sb.length() - 1);
        sb.delete(0,2);
        System.out.println(sb);

    }
}
