package strings;

import java.util.HashMap;

public class CheckAnagrams {
    public static void main(String[] args) {
        String s1 = "anot";
        String s2 = "tano";

        System.out.println(validAnagram(s1,s2));
    }

    private static boolean validAnagram(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[25];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) -'a']--;
        }
        for(int value : count){
            if (value != 0) return false;
        }

        return true;
    }

//    private static Boolean validAnagram(String s1, String s2) {
//        if (s1.length() != s2.length()) return Boolean.FALSE;
//        HashMap<Character,Integer> mpp = new HashMap<>();
//
//        for (int i = 0; i < s1.length() ; i++) {
//            char ch = s1.charAt(i);
//        mpp.put(ch,mpp.getOrDefault(ch,0) + 1);
//        }
//        for (int i = 0; i < s2.length() ; i++) {
//            char ch = s2.charAt(i);
//            if (!mpp.containsKey(ch) || mpp.get(ch) == 0){
//                return Boolean.FALSE;
//            }
//            mpp.put(ch,mpp.get(ch) - 1);
//        }
//        return Boolean.TRUE;
//    }

}
